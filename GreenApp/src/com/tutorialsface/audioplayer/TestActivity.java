package com.tutorialsface.audioplayer;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.provider.MediaStore;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class TestActivity extends Activity {

	private WebView webView;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.test);

		webView = (WebView) findViewById(R.id.webView1);
		webView.getSettings().setJavaScriptEnabled(true);
		String wel=("welcome king");
		webView.loadUrl("http://tools.switchon.vic.gov.au/energy-calculator/tools-energy-calculator");
		//webView.loadUrl("https:www.google.com/maps/place/Mangosuthu+University+of+Technology,+511+Griffiths+Mxenge+Hwy,+Umlazi,+Durban,+4031,+South+Africa/@-29.9702056,30.9147618,20z/data=!4m2!3m1!1s0x1ef7acb92bb39671:0x5fff50d20ffe53f0");
		//webView.loadUrl("https://www.google.com/search?q="+wel);
		//String customHtml = "<html><body><h1>Hello, WebView</h1></body></html>";
	//	webView.loadData(customHtml, "text/html", "UTF-8");

	}

}