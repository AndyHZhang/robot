package com.robot.demo3;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.util.Log;

import com.robot.demo3.RecString.Records;

public class RobotContentProvider extends ContentProvider {
	private static final String TAG = "RobotContentProvider";

    private static final String DATABASE_NAME = "rec_strings.db";
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_NAME = "records";
    
    private static class DatabaseHelper extends SQLiteOpenHelper {
    	DatabaseHelper(Context context) {
    		super(context, DATABASE_NAME, null, DATABASE_VERSION);
    	}
    	
    	@Override
    	public void onCreate(SQLiteDatabase db) {
            db.execSQL("CREATE TABLE " + TABLE_NAME + " ("
                    + Records._ID + " INTEGER PRIMARY KEY,"
                    + Records.STRING + " TEXT,"
                    + Records.IMAGE + " TEXT,"
                    + Records.SOUND + " TEXT"
                    + ");");
        }
    	
    	@Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            Log.w(TAG, "Upgrading database from version " + oldVersion + " to "
                    + newVersion + ", which will destroy all old data");
            db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
            onCreate(db);
        }
    }
    
    private DatabaseHelper mOpenHelper;
    
    @Override
    public boolean onCreate() {
        mOpenHelper = new DatabaseHelper(getContext());
        return true;
    }
    
    @Override
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs,
            String sortOrder) {
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();
        qb.setTables(TABLE_NAME);

        // Get the database and run the query
        SQLiteDatabase db = mOpenHelper.getReadableDatabase();
        Cursor c = qb.query(db, projection, selection, selectionArgs, null, null, null);

        // Tell the cursor what uri to watch, so it knows when its source data changes
        c.setNotificationUri(getContext().getContentResolver(), uri);
        return c;
    }
    
    @Override
    public String getType(Uri uri) {
    	return null;
    }
    
    @Override
    public Uri insert(Uri uri, ContentValues initialValues) {

        SQLiteDatabase db = mOpenHelper.getWritableDatabase();
        long rowId = db.insert(TABLE_NAME, "", initialValues);
        if (rowId > 0) {            
            Uri recordUri = ContentUris.withAppendedId(Records.CONTENT_URI, rowId);
            getContext().getContentResolver().notifyChange(recordUri, null);
            return recordUri;
        }

        throw new SQLException("Failed to insert row into " + uri);
    }
    
    @Override
    public int delete(Uri uri, String where, String[] whereArgs) {
    	SQLiteDatabase db = mOpenHelper.getWritableDatabase();
    	int num = db.delete(TABLE_NAME, where, whereArgs);
    	if (num > 0) {
    		getContext().getContentResolver().notify();
    		return num;
    	}
        return 0;
    }
    
    @Override
    public int update(Uri uri, ContentValues values, String where, String[] whereArgs) {
        return 0;
    }
}
