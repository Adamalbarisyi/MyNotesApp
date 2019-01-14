package com.example.adamalbarisyi.mynotesapp.db;

import android.database.Cursor;
import android.net.Uri;
import android.provider.BaseColumns;

public class DatabaseContract {

    public static String TABLE_NOTE = "note";

    public static final class NoteColumns implements BaseColumns {
        //Note title
       public static String TITLE = "title";
        //Note description
       public static String DESCRIPTION = "description";
        //Note date
       public static String DATE = "date";
    }

    public static final String AUTHORITY = "com.example.adamalbarisyi.mynotesapp";

    public static final Uri CONTENT_URI = new
            Uri.Builder().scheme("content")
            .authority(AUTHORITY)
            .appendPath(TABLE_NOTE)
            .build();

    public static String getColumnString(Cursor cursor, String columnName) {
        return cursor.getString(cursor.getColumnIndex(columnName));
    }

    public static int getColumnInt(Cursor cursor, String columName) {
        return cursor.getInt(cursor.getColumnIndex(columName));
    }

    public static long getColumnLong(Cursor cursor, String columeName) {
        return cursor.getLong(cursor.getColumnIndex(columeName));
    }
}
