package ninja.paranoidandroid.schedule.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by anton on 03.05.16.
 */
public class DBHelper extends SQLiteOpenHelper {

    private final static String TAG = "DBHelper";

    private final static String DATABASE_NAME = "tasks_database.db";
    private final static String CREATE_DATABASE_FILENAME = "create_tasks_database.sql";
    private final static int DATABASE_VERSION = 1;

    public DBHelper(Context context){
         super(context, DATABASE_NAME, null, DATABASE_VERSION);

     }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
