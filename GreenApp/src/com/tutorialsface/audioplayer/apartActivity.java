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

public class apartActivity extends Activity {


	 ImageButton setItem2;
	 ImageView im;
	 
	 String[] mobile = new String[]{
	
			 "----Select----",
			 "10 percent cover",
			 "20 percent cover",
			 "40 percent cover",
			 "70 percent cover",
			 
			 
	 };
	 //SpinnerActivityTwo
	 @Override
	 protected void onCreate(Bundle savedInstanceState) {
	 super.onCreate(savedInstanceState);
	 setContentView(R.layout.activity_apart);
	 
	final Spinner spinnerTest2 = (Spinner)findViewById(R.id.spinner111);
	 setItem2 = (ImageButton)findViewById(R.id.next101111);
	 setItem2.setClickable(false);
	 setItem2.setEnabled(false);
	 
	 ArrayAdapter<String> spinnerArrayAdapter2 = new ArrayAdapter<String>(
	 this,R.layout.textview_for_apart,mobile );
	 
	 spinnerArrayAdapter2.setDropDownViewResource(R.layout.textview_for_apart);
	 
	 spinnerTest2.setAdapter(spinnerArrayAdapter2);
		 final ImageView im = (ImageView)findViewById(R.id.imageView1111);
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
	                        Toast.makeText(parent.getContext(), "10 percent covered", Toast.LENGTH_SHORT).show();
	                       // 
	                        try{
	                        	
	                        	im.setImageDrawable(null);
	                        	im.setImageDrawable(getResources().getDrawable(R.drawable.apartment10));	
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
	                        Toast.makeText(parent.getContext(), "20 percent covered", Toast.LENGTH_SHORT).show();
	                        im.setImageDrawable(null);
	                        im.setImageDrawable(getResources().getDrawable(R.drawable.apartment20));
	                        spinnerTest2.setEnabled(false);
                       	spinnerTest2.setClickable(false);
                       	setItem2.setClickable(true);
	                       	 setItem2.setEnabled(true);
	                        break;
	                        case 3:
		                        Toast.makeText(parent.getContext(), "40 percent covered", Toast.LENGTH_SHORT).show();
		                        im.setImageDrawable(null);
		                        im.setImageDrawable(getResources().getDrawable(R.drawable.apartment40));
		                        spinnerTest2.setEnabled(false);
	                       	spinnerTest2.setClickable(false);
	                       	setItem2.setClickable(true);
		                       	 setItem2.setEnabled(true);
		                        break;
		                        case 4:
			                        Toast.makeText(parent.getContext(), "70 percent covered", Toast.LENGTH_SHORT).show();
			                        im.setImageDrawable(null);
			                        im.setImageDrawable(getResources().getDrawable(R.drawable.apartment70));
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
				
			
				Intent i = new Intent(apartActivity.this, apartfaceActivity.class);
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