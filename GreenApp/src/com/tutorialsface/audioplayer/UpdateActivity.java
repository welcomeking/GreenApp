package com.tutorialsface.audioplayer;

import java.io.File;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class UpdateActivity extends Activity {

	Button buttonCheck;
	TextView textStatus;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_update);
		getActionBar().hide();
		
	


	
		buttonCheck = (Button) findViewById(R.id.buttonCheck);
		buttonCheck.setOnClickListener(new OnClickListener() 
		{
			@Override
			public void onClick(View v) 
			{
				clearApplicationData();
			}
		});
		}
		public void clearApplicationData() 
		{		
				File cache = getCacheDir();
				File appDir = new File(cache.getParent());
				if(appDir.exists())
				{
					String[] children = appDir.list();
					for(String s : children)
					{
							if(!s.equals("lib"))	
							{
								deleteDir(new File(appDir, s));
								Log.i("TAG", "File /data/data/APP_PACKAGE/" + s +" DELETED");
							}
					}
				}
		}
	
	public static boolean deleteDir(File dir) {
	    if (dir != null && dir.isDirectory()) {
	        String[] children = dir.list();
	        for (int i = 0; i < children.length; i++) {
	            boolean success = deleteDir(new File(dir, children[i]));
	            if (!success) {
	                return false;
	            }
	        }
	    }
	
	    return dir.delete();

	}
}