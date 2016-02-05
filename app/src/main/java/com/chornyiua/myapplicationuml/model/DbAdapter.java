package com.chornyiua.myapplicationuml.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbAdapter {
    private static final String DB_NAME = "db.db";
    private static final String TABLE_NAME = "table";
    private static final int DB_VERSION = 1;

    private DbHelper dbHelper;
    private Context context;
    private SQLiteDatabase database;

    private abstract class DbHelper extends SQLiteOpenHelper {
        public DbHelper(Context context, SQLiteDatabase.CursorFactory factory) {
            super(context, DB_NAME, factory, DB_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {

        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        }
    }
}
