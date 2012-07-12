package com.example.mysqllitetest;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class RitaSQLiteHelper extends SQLiteOpenHelper {

	public static final String TABLE_OBIECTIVE = "obiective";
	public static final String COLUMN_ID = "_id";
	public static final String COLUMN_COMMENT = "comment";
	public static final String COLUMN_DENUMIRE = "denumire";
	public static final String COLUMN_CATEGORIE = "categorie";
	public static final String COLUMN_DETALII = "detalii";
	public static final String COLUMN_JUDET = "judet";
	public static final String COLUMN_LOCALITATE = "localitate";
	public static final String COLUMN_COORDONATE = "coordonate";
	public static final String COLUMN_COORD_LAT = "coord_lat";
	public static final String COLUMN_COORD_LONG = "coord_long";
	public static final String COLUMN_KM_DIN_BUC = "km_din_buc";
	public static final String COLUMN_VAZUT_F = "vazut_f";
	public static final String COLUMN_VAZUT_AA = "vazut_aa";
	public static final String COLUMN_VAZUT_A2E = "vazut_a2e";
	public static final String COLUMN_VAZUT_A1E = "vazut_a1e";
	public static final String COLUMN_VAZUT_I = "vazut_i";
	public static final String COLUMN_VAZUT_S = "vazut_s";
	public static final String COLUMN_LINK_DRUM_LIBER = "link_drum_liber";

	private static final String DATABASE_NAME = "obiective.db";
	private static final int DATABASE_VERSION = 2;

	// Database creation sql statement
	private static final String DATABASE_CREATE = "create table "
			+ TABLE_OBIECTIVE + "(" + COLUMN_ID
			+ " integer primary key autoincrement, " 
			+ COLUMN_COMMENT + " text not null,"
			+ COLUMN_DENUMIRE + " text,"
			+ COLUMN_CATEGORIE + " text,"
			+ COLUMN_DETALII + " text,"
			+ COLUMN_JUDET + " text,"
			+ COLUMN_LOCALITATE + " text,"
			+ COLUMN_COORDONATE + " text,"
			+ COLUMN_COORD_LAT + " text,"
			+ COLUMN_COORD_LONG + " text,"
			+ COLUMN_KM_DIN_BUC + " text,"
			+ COLUMN_VAZUT_F + " text,"
			+ COLUMN_VAZUT_A1E + " text,"
			+ COLUMN_VAZUT_A2E + " text,"
			+ COLUMN_VAZUT_AA + " text,"
			+ COLUMN_VAZUT_S + " text,"
			+ COLUMN_VAZUT_I + " text,"
			+ COLUMN_LINK_DRUM_LIBER + " text"
			+");";

	public RitaSQLiteHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase database) {
		database.execSQL(DATABASE_CREATE);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		Log.w(RitaSQLiteHelper.class.getName(),
				"Upgrading database from version " + oldVersion + " to "
						+ newVersion + ", which will destroy all old data");
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_OBIECTIVE);
		onCreate(db);
	}

}
