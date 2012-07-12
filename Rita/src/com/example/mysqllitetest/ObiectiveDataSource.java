package com.example.mysqllitetest;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class ObiectiveDataSource {
	// Database fields
		private SQLiteDatabase database;
		private RitaSQLiteHelper dbHelper;
		private String[] allColumns = { RitaSQLiteHelper.COLUMN_ID,
				RitaSQLiteHelper.COLUMN_COMMENT,
				RitaSQLiteHelper.COLUMN_CATEGORIE,
				RitaSQLiteHelper.COLUMN_COORD_LAT,
				RitaSQLiteHelper.COLUMN_COORD_LONG,
				RitaSQLiteHelper.COLUMN_COORDONATE,
				RitaSQLiteHelper.COLUMN_DENUMIRE,
				RitaSQLiteHelper.COLUMN_DETALII,
				RitaSQLiteHelper.COLUMN_JUDET,
				RitaSQLiteHelper.COLUMN_KM_DIN_BUC,
				RitaSQLiteHelper.COLUMN_LINK_DRUM_LIBER,
				RitaSQLiteHelper.COLUMN_LOCALITATE,
				RitaSQLiteHelper.COLUMN_VAZUT_A1E,
				RitaSQLiteHelper.COLUMN_VAZUT_A2E,
				RitaSQLiteHelper.COLUMN_VAZUT_AA,
				RitaSQLiteHelper.COLUMN_VAZUT_F,
				RitaSQLiteHelper.COLUMN_VAZUT_I,
				RitaSQLiteHelper.COLUMN_VAZUT_S
			};

		public ObiectiveDataSource(Context context) {
			dbHelper = new RitaSQLiteHelper(context);
		}

		public void open() throws SQLException {
			database = dbHelper.getWritableDatabase();
		}

		public void close() {
			dbHelper.close();
		}

		public Obiectiv createObiectiv(String obiectiv) {
			ContentValues values = new ContentValues();
			values.put(RitaSQLiteHelper.COLUMN_COMMENT, obiectiv);
			values.put(RitaSQLiteHelper.COLUMN_CATEGORIE, "a");
			values.put(RitaSQLiteHelper.COLUMN_COORD_LAT, "b");
			values.put(RitaSQLiteHelper.COLUMN_COORD_LONG, "c");
			values.put(RitaSQLiteHelper.COLUMN_COORDONATE, "d");
			values.put(RitaSQLiteHelper.COLUMN_DETALII, "e");
			values.put(RitaSQLiteHelper.COLUMN_JUDET, "f");
			values.put(RitaSQLiteHelper.COLUMN_KM_DIN_BUC, "g");
			values.put(RitaSQLiteHelper.COLUMN_LINK_DRUM_LIBER, "h");
			values.put(RitaSQLiteHelper.COLUMN_LOCALITATE, "i");
			values.put(RitaSQLiteHelper.COLUMN_VAZUT_A1E, "j");
			values.put(RitaSQLiteHelper.COLUMN_VAZUT_A2E, "k");
			values.put(RitaSQLiteHelper.COLUMN_VAZUT_AA, "l");
			values.put(RitaSQLiteHelper.COLUMN_VAZUT_F, "m");
			values.put(RitaSQLiteHelper.COLUMN_VAZUT_I, "n");
			values.put(RitaSQLiteHelper.COLUMN_VAZUT_S, "o");
			
			
			long insertId = database.insert(RitaSQLiteHelper.TABLE_OBIECTIVE, null,
					values);
			Cursor cursor = database.query(RitaSQLiteHelper.TABLE_OBIECTIVE,
					allColumns, RitaSQLiteHelper.COLUMN_ID + " = " + insertId, null,
					null, null, null);
			cursor.moveToFirst();
			Obiectiv newObiectiv = cursorToObiectiv(cursor);
			cursor.close();
			return newObiectiv;
		}

		public void deleteObiectiv(Obiectiv obiectiv) {
			long id = obiectiv.getId();
			System.out.println("Obiectiv deleted with id: " + id);
			database.delete(RitaSQLiteHelper.TABLE_OBIECTIVE, RitaSQLiteHelper.COLUMN_ID
					+ " = " + id, null);
		}

		public List<Obiectiv> getToateObiectivele() {
			System.out.println("Am intrat in getToateObiectivele-urile");
			List<Obiectiv> obiective = new ArrayList<Obiectiv>();

			Cursor cursor = database.query(RitaSQLiteHelper.TABLE_OBIECTIVE,
					allColumns, null, null, null, null, null);
			System.out.println("Cursor " + cursor);
			cursor.moveToFirst();
			while (!cursor.isAfterLast()) {
				System.out.println("in while");
				Obiectiv comment = cursorToObiectiv(cursor);
				obiective.add(comment);
				cursor.moveToNext();
			}
			// Make sure to close the cursor
			cursor.close();
			return obiective;
		}

		private Obiectiv cursorToObiectiv(Cursor cursor) {
			Obiectiv obiectiv = new Obiectiv();
			obiectiv.setId(cursor.getLong(0));
			obiectiv.setDetalii(cursor.getString(1));
			obiectiv.setDenumire(cursor.getString(2));
			return obiectiv;
		}

}
