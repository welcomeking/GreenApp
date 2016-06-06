package com.tutorialsface.audioplayer;



import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.Toast;
public class MenuActivity extends Activity{

	private static final int DIALOG_OVER_ID = 0;
	Button buttonCheck;
	ImageButton imageButton;
	EditText EditText1;
	ListView list;
	ImageView imageSmiling, imageLaughing, imageSad, imageAngry, imageTeasing, imageInLove;
	String data101;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		getActionBar().hide();
		System.gc();
		//addKeyListener();
		setContentView(R.layout.menu);
		//InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
		// imm.hideSoftInputFromWindow(editText1.getWindowToken(), 0);
		
		LinearLayout layout = (LinearLayout) findViewById(R.id.icons);
		for (int i = 0; i < layout.getChildCount(); i++) 
		{
		    View child = layout.getChildAt(i);
		
		    child.setEnabled(false);
		
		    child.setVisibility(View.GONE);
		  
		}    

		buttonCheck = (Button)findViewById(R.id.btnSend);
		buttonCheck.setOnClickListener(new OnClickListener() 
		{
			public void onClick(View v) 
			{
				
				try{
					InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
					 imm.hideSoftInputFromWindow(EditText1.getWindowToken(), 0);
					}
				catch(Exception e)
				{
						
				}
				
			}
		});	



		
		ImageButton bt = (ImageButton)findViewById(R.id.next3);
		bt.setOnClickListener(new OnClickListener() 
		{
			public void onClick(View v) 
			{
		
				LinearLayout layout = (LinearLayout) findViewById(R.id.icons);
	
				View child = layout.getChildAt(0);
				if(child.isEnabled())
				{
					for (int i = 0; i < layout.getChildCount(); i++) 
					{
					    child = layout.getChildAt(i);
					    child.setEnabled(false);
					    child.setVisibility(View.GONE);
					}    
				}
				else
				{
					for (int i = 0; i < layout.getChildCount(); i++) 
					{
					    child = layout.getChildAt(i);
					    child.setEnabled(true);
					    child.setVisibility(View.VISIBLE);
					}    
				}
			}	
		});	
				
			

		EditText1 = (EditText) findViewById(R.id.editText1);
		imageSmiling = (ImageView) findViewById(R.id.imageSmiling);
		imageLaughing = (ImageView) findViewById(R.id.imageLaughing);
		imageSad = (ImageView) findViewById(R.id.imageSad);
		imageAngry = (ImageView) findViewById(R.id.imageAngry);
		imageTeasing = (ImageView) findViewById(R.id.imageTeasing);
		imageInLove = (ImageView) findViewById(R.id.imageInLove);
		
		
		
		imageSmiling.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) 
			{
				addImageBetweentext(imageSmiling.getDrawable());
			}
		});
		imageLaughing.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				addImageBetweentext(imageLaughing.getDrawable());
			}
		});
		imageSad.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				addImageBetweentext(imageSad.getDrawable());
			}
		});
		imageAngry.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				addImageBetweentext(imageAngry.getDrawable());
			}
		});
		imageTeasing.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				addImageBetweentext(imageTeasing.getDrawable());
			}
		});
		imageInLove.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				addImageBetweentext(imageInLove.getDrawable());
			}
		});	
	}
	
	
	
	
	public void addKeyListener() 
	{

		// get edittext component
		EditText1 = (EditText) findViewById(R.id.editText1);
		// add a keylistener to keep track user input
		EditText1.setOnKeyListener(new OnKeyListener() {
			public boolean onKey(View v, int keyCode, KeyEvent event) {
			
				
				// if keydown and "enter" is pressed
				if ((event.getAction() == KeyEvent.ACTION_DOWN)
						&& (keyCode == KeyEvent.KEYCODE_ENTER)) 
				{

				//	try{
					//	InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
						// imm.hideSoftInputFromWindow(editText1.getWindowToken(), 0);
					
						 Toast.makeText(MenuActivity.this,
								 EditText1.getText(), Toast.LENGTH_LONG).show();
						 //	}
				//	catch(Exception e)
				//	{
							
				//	}
					return true;
					
				} 
				
				
				
			
				return false;
			}		
		});

	}



	private void addImageBetweentext(Drawable drawable) {
		drawable .setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
		
		int selectionCursor = EditText1.getSelectionStart();
		EditText1.getText().insert(selectionCursor, ".");
		selectionCursor = EditText1.getSelectionStart();
		
		SpannableStringBuilder builder = new SpannableStringBuilder(EditText1.getText());
		builder.setSpan(new ImageSpan(drawable), selectionCursor - ".".length(), selectionCursor, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
		EditText1.setText(builder);
		EditText1.setSelection(selectionCursor);
	}
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		switch(keyCode)
		{
		case KeyEvent.KEYCODE_BACK:
            // do the work to define the game over Dialog
        	this.showDialog(DIALOG_OVER_ID);
        	
            return true;
		}
		
		return super.onKeyDown(keyCode, event);
	}
	
	// Initiating Menu XML file (conversation_activity_menu.xml)
    @Override
    
	
	protected Dialog onCreateDialog(int id) {
        Dialog dialog = null;
        switch(id) 
        {
        case DIALOG_OVER_ID:
            // do the work to define the game over Dialog
        	dialog = showExitDialog();
            break;
        default:
            dialog = null;
        }
        return dialog;
    }
    
    private Dialog showExitDialog()
    {
    	AlertDialog.Builder builder = new AlertDialog.Builder(this);
    	builder.setMessage(this.getText(R.string.dialog_exit))
    	       .setCancelable(false)
    	       .setPositiveButton("Leave", new DialogInterface.OnClickListener() {
    	           public void onClick(DialogInterface dialog, int id) {
    	        	   quitActivity();
    	           }
    	       })
    	       .setNegativeButton("Stay", new DialogInterface.OnClickListener() {
    	           public void onClick(DialogInterface dialog, int id) {
    	                dialog.cancel();
    	           }
    	       });
    	
    	AlertDialog alert = builder.create();
    	
    	return alert;
    }
    
    private void quitActivity()
    {
    	Intent i = new Intent(getApplicationContext(), Mainmenu.class);
		i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(i);
		System.gc();
 	   this.finish();
    }
}