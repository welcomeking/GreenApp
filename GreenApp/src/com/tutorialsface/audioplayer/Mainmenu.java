package com.tutorialsface.audioplayer;

import java.io.File;

import com.android.volley.Cache;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class Mainmenu extends Activity {

	ImageButton imageone, imagetwo, imagethree, imagefour, imagefive, imagesix, imageimageseven, imageeight,imagenine;
	ImageView imageView1, imageView2;
	RoundImage roundedImage, roundedImage1;
	private Toast toast;
	String data101,welcome,welcome2;
	boolean changed = false;
	
	private long lastBackPressTime = 0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getActionBar().hide();
		System.gc();
		setContentView(R.layout.activity_mainmenu);
		imageView1 = (ImageView) findViewById(R.id.wel);
		Bitmap bm = BitmapFactory.decodeResource(getResources(),R.drawable.image);
		roundedImage = new RoundImage(bm);
		imageView1.setImageDrawable(roundedImage);
		welcome=getIntent().getStringExtra("welcome");
		welcome2=welcome;
		
	try
	{
		
	if(welcome.equals("true"))
	{
		
			data101=getIntent().getStringExtra("info");
			imageView1.setImageBitmap(BitmapFactory
                    .decodeFile(data101));
            Bitmap x = BitmapFactory.decodeFile(data101);
            roundedImage = new RoundImage(x);
    		imageView1.setImageDrawable(roundedImage);
    		welcome2="true";
			
		}
	
	}
	catch(Exception e)
	{
		
	}
		
		
		imageone = (ImageButton) findViewById(R.id.imageButton1);
		imagetwo = (ImageButton) findViewById(R.id.imageButton2);
		imagethree = (ImageButton) findViewById(R.id.imageButton3);
		imagefour = (ImageButton) findViewById(R.id.imageButton4);
		imagefive = (ImageButton) findViewById(R.id.imageButton5);
		imagesix = (ImageButton) findViewById(R.id.imageButton6);
		imageimageseven = (ImageButton) findViewById(R.id.imageButton7);
		imageeight = (ImageButton) findViewById(R.id.imageButton8);
		imagenine = (ImageButton) findViewById(R.id.imageButton9);
		
		
		imageView1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) 
			{
				Intent i = new Intent(getApplicationContext(), ProfileActivity.class);
				i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				i.putExtra("welcome",welcome2);
				i.putExtra("info", data101);
				startActivity(i);
				System.gc();
        			//finish();
			}
		});
		
		
		imageone.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) 
			{
				//try {
					
				
				Intent i = new Intent(getApplicationContext(), FeedActivity.class);
				i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(i);
				System.gc();
        			//finish();
			//  } catch (Exception e) {
		            //Toast.makeText(this, "Please try again", Toast.LENGTH_LONG)
		                   // .show();
		        //}
			}
		});
		
		imagetwo.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) 
			{
				Intent i = new Intent(getApplicationContext(), ElecmenuActivity.class);
				i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(i);
				System.gc();
        			//finish();
			}
		});
		
		imagethree.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) 
			{
				Intent i = new Intent(getApplicationContext(), EskomActivity.class);
				i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(i);
				System.gc();
        			//finish();
			}
		});
		
		imagefour.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) 
			{
				Intent i = new Intent(getApplicationContext(), SpinnerActivity.class);
				i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(i);
				System.gc();
        			//finish();
			}
		});
		
		imagefive.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) 
			{
				Intent i = new Intent(getApplicationContext(), ElamenuActivity.class);
				i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(i);
				System.gc();
        			//finish();
			}
		});
		
		imagesix.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) 
			{
				Intent i = new Intent(getApplicationContext(), RemoveActivity.class);
				i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(i);
				System.gc();
        			//finish();
			}
		});
		
		imageimageseven.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) 
			{
				Intent i = new Intent(getApplicationContext(), settings.class);
				i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(i);
				System.gc();
        			//finish();
			}
		});
		imageeight.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) 
			{
				Intent i = new Intent(getApplicationContext(), MainActivity.class);
				i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(i);
				System.gc();
				//finish();
			//	Intent i = new Intent(Mainmenu.this, MainActivity.class);
        		//startActivity(i);
        		
        			//finish();
			}
		});
		
		imagenine.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) 
			{
				Intent i = new Intent(getApplicationContext(), UpdateActivity.class);
				i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(i);
				System.gc();
        			//finish();
			}
		});
		
		
		
		
	}
	
	public void onBackPressed() {
	  if (this.lastBackPressTime < System.currentTimeMillis() - 4000) {
	    toast = Toast.makeText(this, "Press back again to close this app", 4000);
	    toast.show();
	    System.gc();
	    this.lastBackPressTime = System.currentTimeMillis();
	  } else {
	    if (toast != null) {
	    toast.cancel();
	  }
	  super.onBackPressed();
	 }
	}
}