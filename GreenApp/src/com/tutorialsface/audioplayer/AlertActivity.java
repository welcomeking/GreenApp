package com.tutorialsface.audioplayer;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.NumberPicker;
import android.widget.Toast;

public class AlertActivity extends Activity {

	Button btnOpenCustomAlertDialogBox;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);
        
        btnOpenCustomAlertDialogBox = (Button)findViewById(R.id.button1);
        
        btnOpenCustomAlertDialogBox.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v) 
			{
				AlertDialog.Builder builder = new AlertDialog.Builder(AlertActivity.this);
                builder.setCancelable(false);

                final NumberPicker picker = new NumberPicker(AlertActivity.this);
                picker.setMinValue(0);
                picker.setMaxValue(10);
                final FrameLayout parent = new FrameLayout(AlertActivity.this);
                parent.addView(picker, new FrameLayout.LayoutParams(
                        FrameLayout.LayoutParams.WRAP_CONTENT,
                        FrameLayout.LayoutParams.WRAP_CONTENT,
                        Gravity.CENTER));
                builder.setView(parent);
                builder.setIcon(R.drawable.ic_launcher)
			.setTitle("How many curently switched on")
			//.setMessage("How many curently switched on")
			.setPositiveButton("OK", new DialogInterface.OnClickListener()
			{
				@Override
			public void onClick(DialogInterface dialog, int which) 
				{
					int number= picker.getValue();
					Toast.makeText(AlertActivity.this, "You have "+number, Toast.LENGTH_SHORT).show();
				}
			})
			.setNegativeButton("Cancel", new DialogInterface.OnClickListener()
				{
					@Override
			public void onClick(DialogInterface dialog, int which) 
					{
			Toast.makeText(AlertActivity.this, "You Clicked on Cancel", Toast.LENGTH_SHORT).show();
					}
				}).show();
			}
		});
        
    }


}