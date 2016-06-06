package com.tutorialsface.audioplayer;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;



public class ElamenuActivity extends Activity {
	private List<ellaAdapter> myCars = new ArrayList<ellaAdapter>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.elecmenmen);
		getActionBar().hide();
		populateCarList();
		populateListView();
		registerClickCallback();
	
		Button Cal=(Button) findViewById(R.id.Calculate);
		Cal.setOnClickListener(new OnClickListener() {
			 @Override
				public void onClick(View v)
				{
				 
				 Intent i = new Intent(getApplicationContext(), NumberActivity.class);
					i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					startActivity(i);
					System.gc();
				}});
	}

	
	private void populateCarList() {
		myCars.add(new ellaAdapter("General", 2016, R.drawable.gener, "Items(4)"));
		myCars.add(new ellaAdapter("Kitchen", 2016, R.drawable.kitchen, "Items(2)"));
		myCars.add(new ellaAdapter("Laundry", 2016, R.drawable.wash, "Items(3)"));
		myCars.add(new ellaAdapter("Entertainment", 2016, R.drawable.living, "Items(5)"));
		myCars.add(new ellaAdapter("Home Office", 2016, R.drawable.homeoff, "Items(3)"));
	}
	
	private void populateListView() {
		ArrayAdapter<ellaAdapter> adapter = new MyListAdapter();
		ListView list = (ListView) findViewById(R.id.carsListView);
		list.setAdapter(adapter);
	}
	
	private void registerClickCallback() {
		ListView list = (ListView) findViewById(R.id.carsListView);
		list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View viewClicked,
					int position, long id) {
				
				ellaAdapter clickedCar = myCars.get(position);
				switch (position) {
                case 0:
                	Intent i = new Intent(ElamenuActivity.this, GeneralActivity.class);
            		startActivity(i);
                	break;
                case 1:
                   
                    try{
                    	
                    	Intent i2 = new Intent(ElamenuActivity.this, KitchenActivity.class);
                		startActivity(i2);	
                    }
                    catch(Exception e)
                    {
                    	
                    }
                    
                    break;
                case 2:
                	Intent i2 = new Intent(ElamenuActivity.this, LaundryActivity.class);
            		startActivity(i2);
                    break;
                case 3:
                	Intent i3 = new Intent(ElamenuActivity.this, EntertainmentActivity.class);
            		startActivity(i3);
                    break;
                case 4:
                	Intent i4 = new Intent(ElamenuActivity.this, HomeOfficeActivity.class);
            		startActivity(i4);
                    break;
    
            }
				
	}
		});
	}
	
	private class MyListAdapter extends ArrayAdapter<ellaAdapter> {
		public MyListAdapter() {
			super(ElamenuActivity.this, R.layout.item_view, myCars);
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// Make sure we have a view to work with (may have been given null)
			View itemView = convertView;
			if (itemView == null) {
				itemView = getLayoutInflater().inflate(R.layout.item_view, parent, false);
			}
			
			// Find the car to work with.
			ellaAdapter currentCar = myCars.get(position);
			
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












