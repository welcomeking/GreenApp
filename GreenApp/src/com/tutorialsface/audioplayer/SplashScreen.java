package com.tutorialsface.audioplayer;

import java.io.File;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class SplashScreen extends Activity {

	private static final String TAG = null;
	// Splash screen timer
	private static int SPLASH_TIME_OUT = 2000;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		//clearApplicationData(null);
		System.gc();
		new Handler().postDelayed(new Runnable() {

			/*
			 * Showing splash screen with a timer. This will be useful when you
			 * want to show case your app logo / company
			 */

			@Override
			public void run() {
				clearApplicationData();
				// This method will be executed once the timer is over
				// Start your app main activity
				Intent i = new Intent(SplashScreen.this, SigninActivity.class);
				 i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					startActivity(i);
			
				finish();
			}
		}, SPLASH_TIME_OUT);
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
