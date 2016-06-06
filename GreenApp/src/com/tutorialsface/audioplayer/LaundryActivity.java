package com.tutorialsface.audioplayer;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;



public class LaundryActivity extends Activity {
	private List<EntertainmentAdapter> myCars = new ArrayList<EntertainmentAdapter>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.laundry);
		getActionBar().hide();
		System.gc();
		populateCarList();
		populateListView();
		registerClickCallback();
	}
	private void populateCarList() {
		myCars.add(new EntertainmentAdapter("Washing Machine", 2016, R.drawable.washing, "types(1)"));
		myCars.add(new EntertainmentAdapter("Dryers", 2016, R.drawable.dryer, "types(2)"));
		myCars.add(new EntertainmentAdapter("Iron", 2016, R.drawable.iron, "types(2)"));

	}
	public void ketchenSubmit(View view)
	{
		startActivity(new Intent(getApplicationContext(),ElamenuActivity.class));
	}
	private void populateListView() {
		ArrayAdapter<EntertainmentAdapter> adapter = new MyListAdapter();
		ListView list = (ListView) findViewById(R.id.carsListView);
		list.setAdapter(adapter);
	}
	
	private void registerClickCallback() {
		ListView list = (ListView) findViewById(R.id.carsListView);
		list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View viewClicked,
					int position, long id) {
				
				EntertainmentAdapter clickedCar = myCars.get(position);
				//String message = "You clicked position " + position
					//			+ " Which is car make " + clickedCar.getMake();
				Intent i = new Intent(LaundryActivity.this, forum.class);
        		startActivity(i);
				//Toast.makeText(ChatRoomActivity.this, message, Toast.LENGTH_LONG).show();
			}
		});
	}
	
	private class MyListAdapter extends ArrayAdapter<EntertainmentAdapter> {
		public MyListAdapter() {
			super(LaundryActivity.this, R.layout.item_view, myCars);
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// Make sure we have a view to work with (may have been given null)
			View itemView = convertView;
			if (itemView == null) {
				itemView = getLayoutInflater().inflate(R.layout.item_view, parent, false);
			}
			
			// Find the car to work with.
			EntertainmentAdapter currentCar = myCars.get(position);
			
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












