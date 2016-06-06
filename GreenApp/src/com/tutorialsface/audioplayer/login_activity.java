package com.tutorialsface.audioplayer;


import android.R.string;
import android.app.Activity;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

public class login_activity extends Activity {


	ImageButton imageButton;
	EditText EditText1,EditText2;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
	super.onCreate(savedInstanceState);		
	setContentView(R.layout.activity_login);
	getActionBar().hide();
	addKeyListener();
	ImageButton bt = (ImageButton)findViewById(R.id.signin);
	EditText1 = (EditText) findViewById(R.id.Username);
	bt.setOnClickListener(new OnClickListener() 
	{
		public void onClick(View v) 
		{
	
			Intent i = new Intent(getApplicationContext(),Mainmenu.class);
			 i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			startActivity(i);
			String king = EditText1.getText().toString();	
			i.putExtra("user",king);
			i.putExtra("welcome","false");
			System.gc();
	        finish();
		}
	});

		}
	public void addKeyListener() 
	{

		// get edittext component
		EditText1 = (EditText) findViewById(R.id.Username);
		EditText2 = (EditText) findViewById(R.id.password);
	
		EditText1.setOnKeyListener(new OnKeyListener() {
			public boolean onKey(View v, int keyCode, KeyEvent event) {
			
				
				// if keydown and "enter" is pressed
				if ((event.getAction() == KeyEvent.ACTION_DOWN)
						&& (keyCode == KeyEvent.KEYCODE_ENTER)) 
				{

				//	try{
						InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
						 imm.hideSoftInputFromWindow(EditText1.getWindowToken(), 0);

						 //Toast.makeText(login_activity.this,
							//	 EditText1.getText(), Toast.LENGTH_LONG).show();
						 //	}
				//	catch(Exception e)
				//	{
							
				//	}
					return true;
					
				} 
				
				
				
			
				return false;
			}		
		});
		EditText2.setOnKeyListener(new OnKeyListener() {
			public boolean onKey(View v, int keyCode, KeyEvent event) {
			
				
				// if keydown and "enter" is pressed
				if ((event.getAction() == KeyEvent.ACTION_DOWN)
						&& (keyCode == KeyEvent.KEYCODE_ENTER)) 
				{

					try{
						InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
						 imm.hideSoftInputFromWindow(EditText2.getWindowToken(), 0);
						 Intent i = new Intent(getApplicationContext(),Mainmenu.class);
						 i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
						startActivity(i);
				        finish();
						 //Toast.makeText(login_activity.this,
							//	 EditText1.getText(), Toast.LENGTH_LONG).show();
						 	}
					catch(Exception e)
					{
							
					}
					return true;
					
				} 
				
				
				
			
				return false;
			}		
		});

	}
	}	