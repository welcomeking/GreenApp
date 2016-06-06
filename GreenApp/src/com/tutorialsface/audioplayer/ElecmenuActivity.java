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



public class ElecmenuActivity extends Activity {
	private List<Car2> myCars = new ArrayList<Car2>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.elecmen);
		System.gc();
		populateCarList();
		populateListView();
		registerClickCallback();
		
	}
	private void populateCarList() {
		myCars.add(new Car2("General", 2016, R.drawable.help, "Posts(0)"));
		myCars.add(new Car2("Math Lab", 2016, R.drawable.heart, "Posts(0)"));
		myCars.add(new Car2("Elec Lab", 2016, R.drawable.fish, "Posts(0)"));
		myCars.add(new Car2("GreenTech", 2016, R.drawable.lightning, "Posts(0)!"));
		myCars.add(new Car2("Student Forum", 2016, R.drawable.star, "Posts(0)"));
		myCars.add(new Car2("Green Campus", 2016, R.drawable.bug, "Posts(0)"));
		myCars.add(new Car2("GreenApp Support", 2016, R.drawable.up, "Posts(0)"));
	}
	
	private void populateListView() {
		ArrayAdapter<Car2> adapter = new MyListAdapter();
		ListView list = (ListView) findViewById(R.id.carsListView);
		list.setAdapter(adapter);
	}
	
	private void registerClickCallback() {
		ListView list = (ListView) findViewById(R.id.carsListView);
		list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View viewClicked,
					int position, long id) {
				
				Car2 clickedCar = myCars.get(position);
				//String message = "You clicked position " + position
					//			+ " Which is car make " + clickedCar.getMake();
				Intent i = new Intent(ElecmenuActivity.this, forum.class);
        		startActivity(i);
				//Toast.makeText(ChatRoomActivity.this, message, Toast.LENGTH_LONG).show();
			}
		});
	}
	
	private class MyListAdapter extends ArrayAdapter<Car2> {
		public MyListAdapter() {
			super(ElecmenuActivity.this, R.layout.item_view, myCars);
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// Make sure we have a view to work with (may have been given null)
			View itemView = convertView;
			if (itemView == null) {
				itemView = getLayoutInflater().inflate(R.layout.item_view, parent, false);
			}
			
			// Find the car to work with.
			Car2 currentCar = myCars.get(position);
			
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












