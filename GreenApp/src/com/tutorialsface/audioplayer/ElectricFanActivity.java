package com.tutorialsface.audioplayer;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.NumberPicker;
import android.widget.Toast;


public class ElectricFanActivity extends ListActivity {

	String[] city= {
			"Tesco Tower Fan",
			"Dyson Pure Cool Link Purifier Desk Fan",
			"Lakeland Tilting Mini Desk Fan",
			"Bionaire Mini Tower Fan:",
			"Swan Retro Stand Fan",
			"Tesco Metal Desk Fan",
			"Blyss 18 inch Air Circulator",
			"Stadler Form Otto Fan"
			
	};
	NumberPicker picker;
	Button button;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_electricfan);
		getActionBar().hide();
		
		Button button = (Button)findViewById(R.id.save20);
		button.setOnClickListener(new OnClickListener()
		{


		@SuppressLint("NewApi")
		@Override
		public void onClick(View v)
		{
				Intent i = new Intent(ElectricFanActivity.this,
						MainActivity.class);
				//i.putExtra("name", );
			startActivity(i);
		}
	});
		// -- Display mode of the ListView
		
		ListView listview= getListView();
	//	listview.setChoiceMode(listview.CHOICE_MODE_NONE);
	//	listview.setChoiceMode(listview.CHOICE_MODE_SINGLE);
		listview.setChoiceMode(listview.CHOICE_MODE_MULTIPLE);
		
		//--	text filtering
		listview.setTextFilterEnabled(true);
			
			setListAdapter(new ArrayAdapter<String>(this, 
					android.R.layout.simple_list_item_checked,city));
	}
	
	public void onListItemClick(ListView parent, View v,int position,long id){
		
		CheckedTextView item = (CheckedTextView) v;
		Toast.makeText(this, city[position] + " checked : " +
		item.isChecked(), Toast.LENGTH_SHORT).show();
		onClick2(v);
	}
	
	@SuppressLint("NewApi")
	public void onClick2(View v) 
	{
		AlertDialog.Builder builder = new AlertDialog.Builder(ElectricFanActivity.this);
        builder.setCancelable(false);

        picker = new NumberPicker(ElectricFanActivity.this);
        picker.setMinValue(0);
        picker.setMaxValue(10);
        final FrameLayout parent = new FrameLayout(ElectricFanActivity.this);
        parent.addView(picker, new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.WRAP_CONTENT,
                FrameLayout.LayoutParams.WRAP_CONTENT,
                Gravity.CENTER));
        builder.setView(parent);
        builder.setIcon(R.drawable.ic_launcher)
	.setTitle("How many curently switched on")
	//.setMessage("How many curently switched on")
	.setPositiveButton("OK", new DialogInterface.OnClickListener()
	{
		@SuppressLint("NewApi")
		@Override
	public void onClick(DialogInterface dialog, int which) 
		{
			int number= picker.getValue();
			Toast.makeText(ElectricFanActivity.this, "You have "+number, Toast.LENGTH_SHORT).show();
		}
	})
	.setNegativeButton("Cancel", new DialogInterface.OnClickListener()
		{
			@Override
	public void onClick(DialogInterface dialog, int which) 
			{
	Toast.makeText(ElectricFanActivity.this, "You Clicked on Cancel", Toast.LENGTH_SHORT).show();
			}
		}).show();
	}
}
