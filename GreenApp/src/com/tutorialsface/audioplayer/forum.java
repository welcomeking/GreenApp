package com.tutorialsface.audioplayer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
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



public class forum  extends Activity {
	
	Button button;
	private EditText txtName;
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_forum);
		
		getActionBar().hide();
		//addKeyListener();
		Button bt = (Button)findViewById(R.id.btnJoin);
		txtName = (EditText) findViewById(R.id.name);
		bt.setOnClickListener(new OnClickListener()
		{


		@Override
		public void onClick(View v)
		{
			if (txtName.getText().toString().trim().length() > 0) {

				String name = txtName.getText().toString().trim();

				Intent i = new Intent(forum.this,
						MainActivity.class);
				i.putExtra("name", name);

			i = new Intent(forum.this,MenuActivity.class);

			startActivity(i);
			} else {
				Toast.makeText(getApplicationContext(),
						"Please enter your name", Toast.LENGTH_LONG).show();
			}
		}
	});
}
	public void addKeyListener() 
	{	
		txtName.setOnKeyListener(new OnKeyListener() {
			public boolean onKey(View v, int keyCode, KeyEvent event) {
			
				
				// if keydown and "enter" is pressed
				if ((event.getAction() == KeyEvent.ACTION_DOWN)
						&& (keyCode == KeyEvent.KEYCODE_ENTER)) 
				{

					try{
						 //InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
						// imm.hideSoftInputFromWindow(txtName.getWindowToken(), 0);
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
