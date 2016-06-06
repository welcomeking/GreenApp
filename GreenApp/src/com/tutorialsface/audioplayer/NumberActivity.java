package com.tutorialsface.audioplayer;

import android.app.Activity;
import android.os.Bundle;
import android.widget.NumberPicker;
import android.widget.TextView;


public class NumberActivity extends Activity {

	
	TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        getActionBar().hide();


        textview = (TextView)findViewById(R.id.textView1);
        
       
   }
}
