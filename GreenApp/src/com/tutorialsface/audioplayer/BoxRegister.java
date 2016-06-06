package com.tutorialsface.audioplayer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class BoxRegister extends Activity{

	Button button;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		getActionBar().hide();
		setContentView(R.layout.box_reg);
		ImageButton bt = (ImageButton)findViewById(R.id.submit);
		bt.setOnClickListener(new OnClickListener() 
		{
			public void onClick(View v) 
			{
		
				 Intent i = new Intent (BoxRegister.this,login_activity.class);
		         startActivity(i);
		        finish();
			}
		});

	

	}	
	
}