package com.tutorialsface.audioplayer;

import com.tutorialsface.audioplayer.TableData.AirCondition;
import com.tutorialsface.audioplayer.TableData.LightBulb;
import com.tutorialsface.audioplayer.TableData.Vacuum;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DatabaseOperator extends SQLiteOpenHelper{
	
	public static final int databse_version = 1;
	
	public String CREATE_QUER = "CREATE TABLE "+LightBulb.TABLE_NAME+"("+LightBulb.FluorescentBublbs+" TEXT,"+LightBulb.HolagenBublbs+" TEXT,"+LightBulb.Lumens+" TEXT,"+LightBulb.LED+" TEXT,"+LightBulb.CandleBulbs+" TEXT,"+LightBulb.RBulbs+" TEXT,"+LightBulb.CFLBulbs+" TEXT,"
			+LightBulb.ParBulbs+" TEXT,"+LightBulb.IncandescentBulbs+" TEXT);";
	
	public String CREATE_QUERY = "CREATE TABLE "+AirCondition.TABLE_NAME+"("+AirCondition.WindowsAirCon+" TEXT,"+AirCondition.SplitAirCon+" TEXT,"+AirCondition.PortableAirCon+" TEXT,"+AirCondition.CentralAirCon+" TEXT,"+AirCondition.DuctlessAirCon+" TEXT,"+AirCondition.UnitaryAirCon+" TEXT,"+AirCondition.PTACAirCon+" TEXT);";
	
	public String CREATE_QUEY = "CREATE TABLE "+Vacuum.TABLE_NAME+"("+Vacuum.Bagless+" TEXT,"+Vacuum.HandStrick+" TEXT,"+Vacuum.Bagged+" TEXT,"+Vacuum.Robot+" TEXT,"+Vacuum.Cordless+" TEXT);";
	
	public DatabaseOperator(Context context) 
	{
		super(context,LightBulb.DATABASE_NAME, null, databse_version);
		Log.d("Database operations", "Database created");
	}

	@Override
	public void onCreate(SQLiteDatabase sdb) 
	{
		sdb.execSQL(CREATE_QUERY);
		Log.d("Database operations", "Table Air condition created");
		
		sdb.execSQL(CREATE_QUER);
		Log.d("Database operations", "Table light bulb created");
		
		sdb.execSQL(CREATE_QUEY);
		Log.d("Database operations", "Table Vacuum created");
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub

	}
	
	public void InsertLightBulb(DatabaseOperator dop,String incaBulbs,String fluBulbs,String halBulbs,
			String lumBulbs, String led, String candleBubls, String rBulbs, String cflBubls,String parBulbs)
	{
		SQLiteDatabase SQ = dop.getWritableDatabase();
		ContentValues cv = new ContentValues();
		cv.put(LightBulb.IncandescentBulbs, incaBulbs);
		cv.put(LightBulb.FluorescentBublbs, fluBulbs);
		cv.put(LightBulb.HolagenBublbs, halBulbs);
		cv.put(LightBulb.Lumens, lumBulbs);
		cv.put(LightBulb.LED, led);
		cv.put(LightBulb.CandleBulbs, candleBubls);
		cv.put(LightBulb.RBulbs, rBulbs);
		
		long k = SQ.insert(LightBulb.TABLE_NAME, null, cv);
		Log.d("Database operations", "One row inserted");
	}
	
	public void defaultInsertLightBulb(DatabaseOperator dop)
	{
		SQLiteDatabase SQ = dop.getWritableDatabase();
		ContentValues cv = new ContentValues();
		cv.put(LightBulb.IncandescentBulbs, "0");
		cv.put(LightBulb.FluorescentBublbs, "0");
		cv.put(LightBulb.HolagenBublbs, "0");
		cv.put(LightBulb.Lumens, "0");
		cv.put(LightBulb.LED, "0");
		cv.put(LightBulb.CandleBulbs, "0");
		cv.put(LightBulb.RBulbs, "0");
		
		long k = SQ.insert(LightBulb.TABLE_NAME, null, cv);
		Log.d("Database operations", "One row inserted");
	}
	
	public void InsertAircon(DatabaseOperator dop,String win,String split,String portable,String central, String duck, String uni, String ptac)
	{
		SQLiteDatabase SQ = dop.getWritableDatabase();
		ContentValues cv = new ContentValues();
		cv.put(AirCondition.WindowsAirCon, win);
		cv.put(AirCondition.SplitAirCon, split);
		cv.put(AirCondition.PortableAirCon, portable);
		cv.put(AirCondition.CentralAirCon, central);
		cv.put(AirCondition.DuctlessAirCon, duck);
		cv.put(AirCondition.UnitaryAirCon, uni);
		cv.put(AirCondition.PTACAirCon, ptac);
		
		long k = SQ.insert(LightBulb.TABLE_NAME, null, cv);
		Log.d("Database operations", "One row inserted");
	}

	public void defaultInsertAircon(DatabaseOperator dop)
	{
		SQLiteDatabase SQ = dop.getWritableDatabase();
		ContentValues cv = new ContentValues();
		cv.put(AirCondition.WindowsAirCon, "0");
		cv.put(AirCondition.SplitAirCon, "0");
		cv.put(AirCondition.PortableAirCon, "0");
		cv.put(AirCondition.CentralAirCon,"0");
		cv.put(AirCondition.DuctlessAirCon,"0");
		cv.put(AirCondition.UnitaryAirCon, "0");
		cv.put(AirCondition.PTACAirCon, "0");
		
		long k = SQ.insert(LightBulb.TABLE_NAME, null, cv);
		Log.d("Database operations", "One row inserted");
	}
}
