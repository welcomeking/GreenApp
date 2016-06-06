package com.tutorialsface.audioplayer;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class ProfileActivity extends Activity {

	ImageButton imageButton;
	ImageView imageView1, imageView2;
	RoundImage roundedImage, roundedImage1;
	private static int RESULT_LOAD_IMAGE = 1;
	String data101,welcome; 
	String[] FILE;
	 String ImageDecode;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getActionBar().hide();
		
		setContentView(R.layout.profile);
		imageView1 = (ImageView) findViewById(R.id.wel);
		Bitmap bm = BitmapFactory.decodeResource(getResources(),R.drawable.image);
		roundedImage = new RoundImage(bm);
		imageView1.setImageDrawable(roundedImage);
		welcome=getIntent().getStringExtra("welcome");
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
				
			}
		
		}
		catch(Exception e)
		{
			
		}
		
		imageButton = (ImageButton) findViewById(R.id.submit);
		
		imageButton.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
		try{
			
		
			Intent i = new Intent(getApplicationContext(), Mainmenu.class);
			i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			i.putExtra("info", data101);
			i.putExtra("welcome","true");
			i.putExtra("welcome2","true");
			startActivity(i);
			finish();

		}
		catch(Exception e)
		{
			
		}
		}
		
		});
		
		imageView1.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					
					Intent i = new Intent(
							Intent.ACTION_PICK,
							android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
					
					startActivityForResult(i, RESULT_LOAD_IMAGE);
				}
			});
	    }
	    
	    
	    @Override
	    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
	    	super.onActivityResult(requestCode, resultCode, data);
	    	try {
			if (requestCode == RESULT_LOAD_IMAGE && resultCode == RESULT_OK && null != data) {
			
		                
		 
		                Uri URI = data.getData();
		                String[] FILE = { MediaStore.Images.Media.DATA };
		 
		             
		                Cursor cursor = getContentResolver().query(URI,
		                		FILE, null, null, null);
		            
		                cursor.moveToFirst();
		 
		                int columnIndex = cursor.getColumnIndex(FILE[0]);
		                ImageDecode = cursor.getString(columnIndex);
		                cursor.close();
		                data101=ImageDecode;
		                imageView1.setImageBitmap(BitmapFactory
		                        .decodeFile(ImageDecode));
		                Bitmap x = BitmapFactory.decodeFile(ImageDecode);
		                roundedImage = new RoundImage(x);
		        		imageView1.setImageDrawable(roundedImage);
			}
	    	 } catch (Exception e) {
		            Toast.makeText(this, "Please try again", Toast.LENGTH_LONG)
		                    .show();
		        }
	    
	    }
	    @Override
	    public boolean onKeyDown(int keyCode, KeyEvent event)
	    {
	        if ((keyCode == KeyEvent.KEYCODE_BACK))
	        {
	            finish();
	        }
	        return super.onKeyDown(keyCode, event);
	    }
	}
	
