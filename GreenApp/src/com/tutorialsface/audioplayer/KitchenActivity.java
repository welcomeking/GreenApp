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
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;



public class KitchenActivity extends Activity {
	private List<KitchenAdapter> myCars = new ArrayList<KitchenAdapter>();

	Button ketchenSubmit;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.kitchen);
		getActionBar().hide();
		System.gc();
		populateCarList();
		populateListView();
		registerClickCallback();
		
	}
	public void ketchenSubmit(View view)
	{
		startActivity(new Intent(getApplicationContext(),ElamenuActivity.class));
	}
	private void populateCarList() {
		myCars.add(new KitchenAdapter("stove", 2016, R.drawable.stove, "types(4)"));
		myCars.add(new KitchenAdapter("Refrigerator", 2016, R.drawable.fridge, "types(2)"));
		myCars.add(new KitchenAdapter("Microwave oven", 2016, R.drawable.microwave, "types(3)"));
		myCars.add(new KitchenAdapter("Toster", 2016, R.drawable.toast, "types(5)"));
		myCars.add(new KitchenAdapter("Dish washer", 2016, R.drawable.dishwasher, "types(3)"));
		myCars.add(new KitchenAdapter("Coffe Maker", 2016, R.drawable.coffeemaker, "types(1)"));
		myCars.add(new KitchenAdapter("Electric kettle", 2016, R.drawable.kettle, "types(6)"));
	}
	
	private void populateListView() {
		ArrayAdapter<KitchenAdapter> adapter = new MyListAdapter();
		ListView list = (ListView) findViewById(R.id.carsListView);
		list.setAdapter(adapter);
	}
	
	private void registerClickCallback() {
		ListView list = (ListView) findViewById(R.id.carsListView);
		list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View viewClicked,
					int position, long id) {
				
				KitchenAdapter clickedCar = myCars.get(position);
				//String message = "You clicked position " + position
					//			+ " Which is car make " + clickedCar.getMake();
				Intent i = new Intent(KitchenActivity.this, forum.class);
        		startActivity(i);
				//Toast.makeText(ChatRoomActivity.this, message, Toast.LENGTH_LONG).show();
			}
		});
	}
	
	private class MyListAdapter extends ArrayAdapter<KitchenAdapter> {
		public MyListAdapter() {
			super(KitchenActivity.this, R.layout.item_view, myCars);
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// Make sure we have a view to work with (may have been given null)
			View itemView = convertView;
			if (itemView == null) {
				itemView = getLayoutInflater().inflate(R.layout.item_view, parent, false);
			}
			
			// Find the car to work with.
			KitchenAdapter currentCar = myCars.get(position);
			
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












