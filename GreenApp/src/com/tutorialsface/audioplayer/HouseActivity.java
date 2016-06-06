package com.tutorialsface.audioplayer;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.NumberPicker;
import android.widget.Spinner;
import android.widget.Toast;

public class HouseActivity extends Activity {


	 ImageButton setItem2;
	 ImageView im;
	 NumberPicker picker;
	 
	 String[] mobile2 = new String[]{
	
			 "----Select----",
			 "House",
			 "Apartment",
			 
			 
	 };
	 //SpinnerActivityTwo
	 @Override
	 protected void onCreate(Bundle savedInstanceState) {
	 super.onCreate(savedInstanceState);
	 setContentView(R.layout.activity_house);
	 getActionBar().hide();
	 System.gc();
	final Spinner spinnerTest2 = (Spinner)findViewById(R.id.spinner11);
	 setItem2 = (ImageButton)findViewById(R.id.next10111);
	 setItem2.setClickable(false);
	 setItem2.setEnabled(false);
	 
	 ArrayAdapter<String> spinnerArrayAdapter2 = new ArrayAdapter<String>(
	 this,R.layout.textview_for_house,mobile2 );
	 
	 spinnerArrayAdapter2.setDropDownViewResource(R.layout.textview_for_house);
	 
	 spinnerTest2.setAdapter(spinnerArrayAdapter2);
		 final ImageView im = (ImageView)findViewById(R.id.imageView111);
		 spinnerTest2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
	            @Override
	            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
	            	 try{	
	                switch (position) {
	                    case 0:
	                        Toast.makeText(parent.getContext(), "Nothing Selected", Toast.LENGTH_SHORT).show();
	                        //im.setImageDrawable(null);
	                    	//im.setImageDrawable(getResources().getDrawable(R.drawable.southafrica));
	                        break;
	                    case 1:
	                        Toast.makeText(parent.getContext(), "House", Toast.LENGTH_SHORT).show();
	                       // 
	                        try{
	                        	
	                        	im.setImageDrawable(null);
	                        	im.setImageDrawable(getResources().getDrawable(R.drawable.house));	
	                        	spinnerTest2.setEnabled(false);
	                        	spinnerTest2.setClickable(false);
	                        	setItem2.setClickable(true);
		                       	 setItem2.setEnabled(true);
	                        	
	                        	setItem2.setClickable(true);
	                       	 setItem2.setEnabled(true);
	                       	 
	                      	AlertDialog.Builder builder = new AlertDialog.Builder(HouseActivity.this);
	                        builder.setCancelable(false);

	                        picker = new NumberPicker(HouseActivity.this);
	                        picker.setMinValue(0);
	                        picker.setMaxValue(10);
	                        picker.setDisplayedValues( new String[] {"Tiles" ,"Wood" , "carpet"} );

	                        final FrameLayout parent1 = new FrameLayout(HouseActivity.this);
	                        parent1.addView(picker, new FrameLayout.LayoutParams(
	                                FrameLayout.LayoutParams.WRAP_CONTENT,
	                                FrameLayout.LayoutParams.WRAP_CONTENT,
	                                Gravity.CENTER));
	                        builder.setView(parent1);
	                        builder.setIcon(R.drawable.ic_launcher)
	                        .setTitle("Select Floor Type")
	                	//.setMessage("How many curently switched on")
	                	.setPositiveButton("OK", new DialogInterface.OnClickListener()
	                	{
	                		@SuppressLint("NewApi")
	                		@Override
	                	public void onClick(DialogInterface dialog, int which) 
	                		{
	                			int number= picker.getValue();
	                			Toast.makeText(HouseActivity.this, "You have "+number, Toast.LENGTH_SHORT).show();
	                		}
	                	})
	                	.setNegativeButton("Cancel", new DialogInterface.OnClickListener()
	                		{
	                			@Override
	                	public void onClick(DialogInterface dialog, int which) 
	                			{
	                	Toast.makeText(HouseActivity.this, "You Clicked on Cancel", Toast.LENGTH_SHORT).show();
	                			}
	                		}).show();
	                       	 
	                       	 
	                        }
	                        catch(Exception e)
	                        {
	                        	
	                        }
	                        
	                        break;
	                    case 2:
	                        Toast.makeText(parent.getContext(), "Apartment", Toast.LENGTH_SHORT).show();
	                        im.setImageDrawable(null);
	                        im.setImageDrawable(getResources().getDrawable(R.drawable.apartment));
	                        spinnerTest2.setEnabled(false);
                       	spinnerTest2.setClickable(false);
                       	setItem2.setClickable(true);
	                       	 setItem2.setEnabled(true);
	                       	 
	                       	AlertDialog.Builder builder1 = new AlertDialog.Builder(HouseActivity.this);
	                        builder1.setCancelable(false);

	                        picker = new NumberPicker(HouseActivity.this);
	                        picker.setMinValue(0);
	                        picker.setMaxValue(10);
	                        picker.setDisplayedValues( new String[] {"Tiles" ,"Wood" , "carpet"} );

	                        final FrameLayout parent11 = new FrameLayout(HouseActivity.this);
	                        parent11.addView(picker, new FrameLayout.LayoutParams(
	                                FrameLayout.LayoutParams.WRAP_CONTENT,
	                                FrameLayout.LayoutParams.WRAP_CONTENT,
	                                Gravity.CENTER));
	                        builder1.setView(parent11);
	                        builder1.setIcon(R.drawable.ic_launcher)
	                        .setTitle("Select Floor Type")
	                	//.setMessage("How many curently switched on")
	                	.setPositiveButton("OK", new DialogInterface.OnClickListener()
	                	{
	                		@SuppressLint("NewApi")
	                		@Override
	                	public void onClick(DialogInterface dialog, int which) 
	                		{
	                			int number= picker.getValue();
	                			Toast.makeText(HouseActivity.this, "You have "+number, Toast.LENGTH_SHORT).show();
	                		}
	                	})
	                	.setNegativeButton("Cancel", new DialogInterface.OnClickListener()
	                		{
	                			@Override
	                	public void onClick(DialogInterface dialog, int which) 
	                			{
	                	Toast.makeText(HouseActivity.this, "You Clicked on Cancel", Toast.LENGTH_SHORT).show();
	                			}
	                		}).show();
	                       	 
	                        break;
	        
	                }
	            	 }
                    catch(Exception e)
                    {
                    	
                    }

	            }

	            @Override
	            public void onNothingSelected(AdapterView<?> parent) {

	               // sometimes you need nothing here
	            }
	        });
			
		 setItem2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			try{
				
			
				Intent i = new Intent(HouseActivity.this, apartActivity.class);
				//i.putExtra("info", data101);
				//i.putExtra("welcome","true");
				startActivity(i);

			}
			catch(Exception e)
			{
				
			}
			}
			
			});
	 
	 }
	}