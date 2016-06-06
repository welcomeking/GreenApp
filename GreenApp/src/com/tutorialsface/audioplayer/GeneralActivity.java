package com.tutorialsface.audioplayer;

import java.util.ArrayList;
import java.util.List;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.Toast;



public class GeneralActivity extends Activity {
	NumberPicker picker;
	private List<GeneralAdapter> myCars = new ArrayList<GeneralAdapter>();

	Button generalSubmit;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.general);
		getActionBar().hide();
		System.gc();
		populateCarList();
		populateListView();
		registerClickCallback();
		
		Button generalSubmit=(Button) findViewById(R.id.generalSubmit);
		
		
		
	}
	public void generalSubmit(View view)
	{
		startActivity(new Intent(getApplicationContext(),ElamenuActivity.class));
		
	}
	private void populateCarList() {
		myCars.add(new GeneralAdapter("Light bulb", 2016, R.drawable.globe, "types(4)"));
		myCars.add(new GeneralAdapter("Ceiling Fan", 2016, R.drawable.ceilingfan, "types(2)"));
		myCars.add(new GeneralAdapter("Geyser", 2016, R.drawable.geyserrr, "types(3)"));
		myCars.add(new GeneralAdapter("Vacuum cleaner", 2016, R.drawable.vacuumcleaner, "types(3)"));
		myCars.add(new GeneralAdapter("Air conditioner", 2016, R.drawable.aiircon, "types(3)"));
		

	}
	
	private void populateListView() {
		ArrayAdapter<GeneralAdapter> adapter = new MyListAdapter();
		ListView list = (ListView) findViewById(R.id.carsListView);
		list.setAdapter(adapter);
	}
	
	private void registerClickCallback() {
		ListView list = (ListView) findViewById(R.id.carsListView);
		list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View viewClicked,
					int position, long id) {
				
				GeneralAdapter clickedCar = myCars.get(position);
				//String message = "You clicked position " + position
					//			+ " Which is car make " + clickedCar.getMake();
				switch (position) {
                case 0:
                	Intent i = new Intent(GeneralActivity.this, BulbsActivity.class);
            		startActivity(i);
                	break;
                case 1:
                   
                	Intent ii = new Intent(GeneralActivity.this, CeilingFanActivity.class);
            		startActivity(ii);
                    
                    
                    break;
                case 2:
                	Intent i2 = new Intent(GeneralActivity.this, GeyserActivity.class);
            		startActivity(i2);
                	break;
                case 3:
                	Intent i3 = new Intent(GeneralActivity.this, VaccumCleanerActivity.class);
            		startActivity(i3);
                	break;
                case 4:
                	Intent i4 = new Intent(GeneralActivity.this, AirConditionerActivity.class);
            		startActivity(i4);
                	break;
                 
    
            }

				//Intent i = new Intent(GeneralActivity.this, forum.class);
        	//	startActivity(i);
				//Toast.makeText(ChatRoomActivity.this, message, Toast.LENGTH_LONG).show();
			}
		});
	}
	
	private class MyListAdapter extends ArrayAdapter<GeneralAdapter> {
		public MyListAdapter() {
			super(GeneralActivity.this, R.layout.item_view, myCars);
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// Make sure we have a view to work with (may have been given null)
			View itemView = convertView;
			if (itemView == null) {
				itemView = getLayoutInflater().inflate(R.layout.item_view, parent, false);
			}
			
			// Find the car to work with.
			GeneralAdapter currentCar = myCars.get(position);
			
			// Fill the view
			ImageView imageView = (ImageView)itemView.findViewById(R.id.item_icon);
			imageView.setImageResource(currentCar.getIconID());
			
			// Make:
			TextView makeText = (TextView) itemView.findViewById(R.id.item_txtMake);
			makeText.setText(currentCar.getMake());

			// Year:
			TextView yearText = (TextView) itemView.findViewById(R.id.item_txtYear);
			yearText.setText("" + currentCar.getYear());
			
			// Condition:
			TextView condionText = (TextView) itemView.findViewById(R.id.item_txtCondition);
			condionText.setText(currentCar.getCondition());

			return itemView;
		}				
	}
}












