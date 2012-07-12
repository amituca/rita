package com.example.mysqllitetest;

import java.util.List;
import java.util.Random;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

public class TestDatabaseActivity extends ListActivity {
	private ObiectiveDataSource datasource;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		datasource = new ObiectiveDataSource(this);
		datasource.open();

		List<Obiectiv> values = datasource.getToateObiectivele();

		// Use the SimpleCursorAdapter to show the
		// elements in a ListView
		ArrayAdapter<Obiectiv> adapter = new ArrayAdapter<Obiectiv>(this,
				android.R.layout.simple_list_item_1, values);
		setListAdapter(adapter);
	}

	// Will be called via the onClick attribute
	// of the buttons in main.xml
	public void onClick(View view) {
		@SuppressWarnings("unchecked")
		ArrayAdapter<Obiectiv> adapter = (ArrayAdapter<Obiectiv>) getListAdapter();
		Obiectiv obiectiv = null;
		switch (view.getId()) {
		case R.id.add:
			String[] obiective = new String[] { "Munte", "Manastire", "Baraj","Intersectie", "Vedeta" };
			int nextInt = new Random().nextInt(5);
			// Save the new comment to the database
			obiectiv = datasource.createObiectiv(obiective[nextInt]);
			adapter.add(obiectiv);
			break;
		case R.id.delete:
			if (getListAdapter().getCount() > 0) {
				obiectiv = (Obiectiv) getListAdapter().getItem(0);
				datasource.deleteObiectiv(obiectiv);
				adapter.remove(obiectiv);
			}
			break;
		}
		adapter.notifyDataSetChanged();
	}

	@Override
	protected void onResume() {
		super.onResume();
		datasource.open();
	}

	@Override
	protected void onPause() {
		super.onPause();
		datasource.close();
	}

}