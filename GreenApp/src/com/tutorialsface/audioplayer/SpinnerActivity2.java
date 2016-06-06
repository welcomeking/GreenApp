package com.tutorialsface.audioplayer;


import java.util.concurrent.ExecutionException;

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
import android.widget.AdapterView.OnItemSelectedListener;
import android.net.Uri;



public class SpinnerActivity2 extends Activity {


	 ImageButton setItem2;
	 ImageView im;
	 
	 String[] mobile = new String[]{
	
			 "----Select----",
			 "House",
			 "Apartment",
			 
			 
	 };
	 //SpinnerActivityTwo
	 @Override
	 protected void onCreate(Bundle savedInstanceState) {
	 super.onCreate(savedInstanceState);
	 setContentView(R.layout.activity_house);
	 
	final Spinner spinnerTest2 = (Spinner)findViewById(R.id.spinner11);
	 setItem2 = (ImageButton)findViewById(R.id.next10111);
	 setItem2.setClickable(false);
	 setItem2.setEnabled(false);
	 
	 ArrayAdapter<String> spinnerArrayAdapter2 = new ArrayAdapter<String>(
	 this,R.layout.textview_for_house,mobile );
	 
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
	                        }
	                        catch(Exception e)
	                        {
	                        	
	                        }
	                        
	                        break;
	                    case 2:
	                        Toast.makeText(parent.getContext(), "Apartment", Toast.LENGTH_SHORT).show();
	                        im.setImageDrawable(null);
	                        im.setImageDrawable(getResources().getDrawable(R.drawable.apart));
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
				
			
				Intent i = new Intent(SpinnerActivity2.this, AlertActivity.class);
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