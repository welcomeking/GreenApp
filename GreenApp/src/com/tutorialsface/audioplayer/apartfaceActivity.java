package com.tutorialsface.audioplayer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class apartfaceActivity extends Activity {

	 ImageButton setItem2;
	 ImageView im;
	 
	 String[] mobile = new String[]{
	
			 "----Select----",
			 "North Facing",
			 "South Faceing",
			 "West Faceing",
			 "East Faceing",
			 
			 
	 };
	 //SpinnerActivityTwo
	 @Override
	 protected void onCreate(Bundle savedInstanceState) {
	 super.onCreate(savedInstanceState);
	 setContentView(R.layout.activity_apartface);
	 System.gc();
	final Spinner spinnerTest2 = (Spinner)findViewById(R.id.spinner1111);
	 setItem2 = (ImageButton)findViewById(R.id.next1011111);
	 setItem2.setClickable(false);
	 setItem2.setEnabled(false);
	 
	 ArrayAdapter<String> spinnerArrayAdapter2 = new ArrayAdapter<String>(
	 this,R.layout.textview_for_apartface,mobile );
	 
	 spinnerArrayAdapter2.setDropDownViewResource(R.layout.textview_for_apartface);
	 
	 spinnerTest2.setAdapter(spinnerArrayAdapter2);
		 final ImageView im = (ImageView)findViewById(R.id.imageView11111);
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
	                        Toast.makeText(parent.getContext(), "North Facing", Toast.LENGTH_SHORT).show();
	                       // 
	                        try{
	                        	
	                        	im.setImageDrawable(null);
	                        	im.setImageDrawable(getResources().getDrawable(R.drawable.apartmentnorth));	
	                        	spinnerTest2.setEnabled(false);
	                        	spinnerTest2.setClickable(false);
	                        	setItem2.setClickable(true);
		                       	 setItem2.setEnabled(true);
	                        	
	                        	setItem2.setClickable(true);
	                       	 setItem2.setEnabled(true);
	                        }
	                        catch(Exception e)
	                        {
	                        	
	                        }
	                        
	                        break;
	                    case 2:
	                        Toast.makeText(parent.getContext(), "South FAceing", Toast.LENGTH_SHORT).show();
	                        im.setImageDrawable(null);
	                        im.setImageDrawable(getResources().getDrawable(R.drawable.apartmentsouth));
	                        spinnerTest2.setEnabled(false);
                      	spinnerTest2.setClickable(false);
                      	setItem2.setClickable(true);
	                       	 setItem2.setEnabled(true);
	                        break;
	                        case 3:
		                        Toast.makeText(parent.getContext(), "West Facing", Toast.LENGTH_SHORT).show();
		                        im.setImageDrawable(null);
		                        im.setImageDrawable(getResources().getDrawable(R.drawable.apartmentwest));
		                        spinnerTest2.setEnabled(false);
	                       	spinnerTest2.setClickable(false);
	                       	setItem2.setClickable(true);
		                       	 setItem2.setEnabled(true);
		                        break;
		                        case 4:
			                        Toast.makeText(parent.getContext(), "East Faceing", Toast.LENGTH_SHORT).show();
			                        im.setImageDrawable(null);
			                        im.setImageDrawable(getResources().getDrawable(R.drawable.apartmenteast));
			                        spinnerTest2.setEnabled(false);
		                       	spinnerTest2.setClickable(false);
		                       	setItem2.setClickable(true);
			                       	 setItem2.setEnabled(true);
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
				
				System.gc();
				Intent i = new Intent(apartfaceActivity.this, openingActivity.class);
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