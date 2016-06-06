package com.tutorialsface.audioplayer;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;



public class SigninActivity extends Activity
{

	EditText uname,pass1;
	ImageButton imageButton1;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
	super.onCreate(savedInstanceState);		
	setContentView(R.layout.activity_signin);
	getActionBar().hide();
	imageButton1 = (ImageButton)findViewById(R.id.create);
	ImageButton bt = (ImageButton)findViewById(R.id.signin);
	bt.setOnClickListener(new OnClickListener() 
	{
		public void onClick(View v) 
		{
	
			 Intent i = new Intent (SigninActivity.this,login_activity.class);
			 i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			 startActivity(i);
	         finish();
		}
	});
	imageButton1.setOnClickListener(new OnClickListener() 
	{
		public void onClick(View v) 
		{
	
			 Intent i = new Intent (SigninActivity.this,BoxRegister.class);
			 i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			 startActivity(i);
	         //finish();
		}
	});

		}
	public void userlogin(View view)
	{
		
		String unamestr=uname.getText().toString();
		String passstr=pass1.getText().toString();
		String urlparams="username="+unamestr+"&password="+passstr;
		
		
		
		BackgroungTask backgroundTask=new BackgroungTask(this);
		backgroundTask.execute(unamestr,passstr);
		
		
		

		 Intent i = new Intent (SigninActivity.this,Mainmenu.class);
        
		
		
	}
	}	
	
