package com.tutorialsface.audioplayer;

import android.provider.BaseColumns;

public class TableData {
	
	public  TableData()
	{
		
	}
	
	public static abstract class LightBulb implements BaseColumns
	{
		public static final String IncandescentBulbs = "incandescentbulbs";
		public static final String FluorescentBublbs = "fluorescentbublbs";
		public static final String HolagenBublbs = "halogenbublbs";
		public static final String Lumens = "lumens";
		public static final String LED = "led";		
		public static final String CandleBulbs = "candlebulbs";
		public static final String RBulbs = "rbulbs";
		public static final String CFLBulbs = "cflbublbs";
		public static final String ParBulbs = "parbublbs";
		
		public static final String DATABASE_NAME = "InformationDatabase";
		public static final String TABLE_NAME = "tblLightBulbs";
	}
	
	public static abstract class AirCondition implements BaseColumns
	{
		public static final String WindowsAirCon = "windowsaircon";
		public static final String SplitAirCon = "splitaircon";
		public static final String PortableAirCon = "portableaircon";
		public static final String CentralAirCon = "centralaircon";
		public static final String DuctlessAirCon = "ductlessaircon";		
		public static final String UnitaryAirCon = "unitaryaircon";
		public static final String PTACAirCon = "ptacaircon";
		
		
		public static final String DATABASE_NAME = "InformationDatabase";
		public static final String TABLE_NAME = "tblAirCondition";
	}
	
	public static abstract class Vacuum implements BaseColumns
	{
		public static final String Bagless = "bagless";
		public static final String HandStrick = "handstrick";
		public static final String Bagged = "bagged";
		public static final String Robot = "robot";
		public static final String Cordless = "cordless";		
		
		
		public static final String DATABASE_NAME = "InformationDatabase";
		public static final String TABLE_NAME = "tblVacuumCleaner";
	}
}
