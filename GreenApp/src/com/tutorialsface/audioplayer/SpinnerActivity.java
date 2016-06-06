package com.tutorialsface.audioplayer;


import java.util.concurrent.ExecutionException;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.NumberPicker;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;
import android.net.Uri;



public class SpinnerActivity extends Activity {

	 Spinner spinnerTest;
	 ImageButton setItem;
	 ImageView im;
	 
	 String[] mobile = new String[]{
	
			 "----Select----",
			 "KwaZulu-Natal",
			 "The Eastern Cape",
			 "The Free State",
			 "Gauteng",
			 "Mpumalanga",
			 "The Northern Cape",
			 "North West",
			 "Limpopo",
			 "The Western Cape"
			 
	 };
	 NumberPicker picker;
	 //SpinnerActivityTwo
	 @Override
	 protected void onCreate(Bundle savedInstanceState) {
	 super.onCreate(savedInstanceState);
	 setContentView(R.layout.spiner_main);
	 getActionBar().hide();
	 System.gc();
	 
	final Spinner spinnerTest = (Spinner)findViewById(R.id.spinner1);
	//ImageView im = (ImageView)findViewById(R.id.imageView1);
	 setItem = (ImageButton)findViewById(R.id.next101);
	 setItem.setClickable(false);
	 setItem.setEnabled(false);
	 
	 ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(
	 this,R.layout.textview_for_spinnertwo,mobile );
	 
	 spinnerArrayAdapter.setDropDownViewResource(R.layout.textview_for_spinnertwo);
	 
	 spinnerTest.setAdapter(spinnerArrayAdapter);
	
	// spinnerTest.setOnItemSelectedListener(new OnItemSelectedListener() {
		 final ImageView im = (ImageView)findViewById(R.id.imageView1);
		 spinnerTest.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
	            @Override
	            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
	            	 try{	
	                switch (position) 
	                {
	                    case 0:
	                        Toast.makeText(parent.getContext(), "Nothing Selected", Toast.LENGTH_SHORT).show();
	                        //im.setImageDrawable(null);
	                    	//im.setImageDrawable(getResources().getDrawable(R.drawable.southafrica));
	                        break;
	                   
	                    case 1:
	                        Toast.makeText(parent.getContext(), "KwaZulu-Natal", Toast.LENGTH_SHORT).show();
	                       // 
	                        try{
	                        	
	                        	im.setImageDrawable(null);
	                        	im.setImageDrawable(getResources().getDrawable(R.drawable.kzn));	
	                        	spinnerTest.setEnabled(false);
	                        	spinnerTest.setClickable(false);
	                        	setItem.setClickable(true);
		                       	 setItem.setEnabled(true);
	                        	
	                        	setItem.setClickable(true);
	                       	 setItem.setEnabled(true);
	                       	 
	                       	AlertDialog.Builder builder = new AlertDialog.Builder(SpinnerActivity.this);
	                        builder.setCancelable(false);

	                        picker = new NumberPicker(SpinnerActivity.this);
	                        picker.setMinValue(0);
	                        picker.setMaxValue(10);
	                        picker.setDisplayedValues( new String[] {"Amajuba","eThekwini","iLembe","Sisonke","Ugu","uMgungundlovu","UMkhanyakude","Umzinyathi","uThukela","Uthungulu","Zululand"} );

	                        final FrameLayout parent1 = new FrameLayout(SpinnerActivity.this);
	                        parent1.addView(picker, new FrameLayout.LayoutParams(
	                                FrameLayout.LayoutParams.WRAP_CONTENT,
	                                FrameLayout.LayoutParams.WRAP_CONTENT,
	                                Gravity.CENTER));
	                        builder.setView(parent1);
	                        builder.setIcon(R.drawable.ic_launcher)
	                        .setTitle("Select Local Municipality")
	                	//.setMessage("How many curently switched on")
	                	.setPositiveButton("OK", new DialogInterface.OnClickListener()
	                	{
	                		@SuppressLint("NewApi")
	                		@Override
	                	public void onClick(DialogInterface dialog, int which) 
	                		{
	                			int number= picker.getValue();
	                			Toast.makeText(SpinnerActivity.this, "You have "+number, Toast.LENGTH_SHORT).show();
	                		}
	                	})
	                	.setNegativeButton("Cancel", new DialogInterface.OnClickListener()
	                		{
	                			@Override
	                	public void onClick(DialogInterface dialog, int which) 
	                			{
	                	Toast.makeText(SpinnerActivity.this, "You Clicked on Cancel", Toast.LENGTH_SHORT).show();
	                			}
	                		}).show();
	                       	 
	                        }
	                        catch(Exception e)
	                        {
	                        	
	                        }
	                        
	                        break;
	                    case 2:
	                        Toast.makeText(parent.getContext(), "The Eastern Cape", Toast.LENGTH_SHORT).show();
	                        im.setImageDrawable(null);
	                        im.setImageDrawable(getResources().getDrawable(R.drawable.ec));
	                        spinnerTest.setEnabled(false);
                        	spinnerTest.setClickable(false);
                        	setItem.setClickable(true);
	                       	 setItem.setEnabled(true);
	                       	AlertDialog.Builder builder = new AlertDialog.Builder(SpinnerActivity.this);
	                        builder.setCancelable(false);

	                        picker = new NumberPicker(SpinnerActivity.this);
	                        picker.setMinValue(0);
	                        picker.setMaxValue(10);
	                    	picker.setDisplayedValues( new String[] {
	                    			"Alfred Nzo",
	                    			"Amathole",
	                    			"Buffalo City", 
	                    			"Sarah Baartman", 
	                    			"Chris Hani", 
	                    			"Joe Gqabi", 
	                    			"Nelson Mandela Bay ",
	                    			"OR Tambo District" 	 } );
	                        final FrameLayout parent1 = new FrameLayout(SpinnerActivity.this);
	                        parent1.addView(picker, new FrameLayout.LayoutParams(
	                                FrameLayout.LayoutParams.WRAP_CONTENT,
	                                FrameLayout.LayoutParams.WRAP_CONTENT,
	                                Gravity.CENTER));
	                        builder.setView(parent1);
	                        builder.setIcon(R.drawable.ic_launcher)
	                        .setTitle("Select Local Municipality")
	                	//.setMessage("How many curently switched on")
	                	.setPositiveButton("OK", new DialogInterface.OnClickListener()
	                	{
	                		@SuppressLint("NewApi")
	                		@Override
	                	public void onClick(DialogInterface dialog, int which) 
	                		{
	                			int number= picker.getValue();
	                			Toast.makeText(SpinnerActivity.this, "You have "+number, Toast.LENGTH_SHORT).show();
	                		}
	                	})
	                	.setNegativeButton("Cancel", new DialogInterface.OnClickListener()
	                		{
	                			@Override
	                	public void onClick(DialogInterface dialog, int which) 
	                			{
	                	Toast.makeText(SpinnerActivity.this, "You Clicked on Cancel", Toast.LENGTH_SHORT).show();
	                			}
	                		}).show();
	                       	 
	                       	 
	                        break;
	                    case 3:
	                        Toast.makeText(parent.getContext(), "The Free State ", Toast.LENGTH_SHORT).show();
	                        im.setImageDrawable(null);
	                        im.setImageDrawable(getResources().getDrawable(R.drawable.free));
	                        spinnerTest.setEnabled(false);
                        	spinnerTest.setClickable(false);
                        	setItem.setClickable(true);
	                       	 setItem.setEnabled(true);
		                     	AlertDialog.Builder builder1 = new AlertDialog.Builder(SpinnerActivity.this);
		                        builder1.setCancelable(false);

		                        picker = new NumberPicker(SpinnerActivity.this);
		                        picker.setMinValue(0);
		                        picker.setMaxValue(10);
		                    	picker.setDisplayedValues( new String[] {"City of Johannesburg Metropolitan Municipality",
		                    			"Dihlabeng", 
		                    			"Kopanong", 
		                    			"Letsemeng", 
		                    			"Mafube", 
		                    			"Maluti-a-Phofung ", 
		                    			"Mangaung ",
		                    			"Mantsopa", 
		                    			"Masilonyana",
		                    			"Metsimaholo",
		                    			"Mohokare",
		                    			"Moqhaka",
		                    			"Nala",
		                    			"Naledi",
		                    			"Ngwathe",
		                    			"Nketoana",
		                    			"Phumelela",
		                    			"Tokologo",
		                    			"Tswelopele"	 } );
		                        final FrameLayout parent11 = new FrameLayout(SpinnerActivity.this);
		                        parent11.addView(picker, new FrameLayout.LayoutParams(
		                                FrameLayout.LayoutParams.WRAP_CONTENT,
		                                FrameLayout.LayoutParams.WRAP_CONTENT,
		                                Gravity.CENTER));
		                        builder1.setView(parent11);
		                        builder1.setIcon(R.drawable.ic_launcher)
		                        .setTitle("Select Local Municipality")
		                	//.setMessage("How many curently switched on")
		                	.setPositiveButton("OK", new DialogInterface.OnClickListener()
		                	{
		                		@SuppressLint("NewApi")
		                		@Override
		                	public void onClick(DialogInterface dialog, int which) 
		                		{
		                			int number= picker.getValue();
		                			Toast.makeText(SpinnerActivity.this, "You have "+number, Toast.LENGTH_SHORT).show();
		                		}
		                	})
		                	.setNegativeButton("Cancel", new DialogInterface.OnClickListener()
		                		{
		                			@Override
		                	public void onClick(DialogInterface dialog, int which) 
		                			{
		                	Toast.makeText(SpinnerActivity.this, "You Clicked on Cancel", Toast.LENGTH_SHORT).show();
		                			}
		                		}).show();
		                       	 
		                        
	                       	 
	                        break;
	                    case 4:
	                        Toast.makeText(parent.getContext(), "Gauteng", Toast.LENGTH_SHORT).show();
	                        im.setImageDrawable(null);
	                        im.setImageDrawable(getResources().getDrawable(R.drawable.gau));
	                        spinnerTest.setEnabled(false);
                        	spinnerTest.setClickable(false);
                        	setItem.setClickable(true);
	                       	 setItem.setEnabled(true);

	                     	AlertDialog.Builder builder11 = new AlertDialog.Builder(SpinnerActivity.this);
	                        builder11.setCancelable(false);

	                        picker = new NumberPicker(SpinnerActivity.this);
	                        picker.setMinValue(0);
	                        picker.setMaxValue(10);
	                    	picker.setDisplayedValues( new String[] {"City of Johannesburg Metropolitan Municipality",
	                         		"Ekurhuleni ",
	                         		"City of Tshwane",
	                         		"Emfuleni",
	                         		"Midvaal ",
	                         		"Lesedi ",
	                         		"Kungwini",
	                         		"Nokeng Tsa Taemane",
	                         		"Merafong City",
	                         		"Mogale City",
	                         		"Randfontein"	 } );
	                        final FrameLayout parent111 = new FrameLayout(SpinnerActivity.this);
	                        parent111.addView(picker, new FrameLayout.LayoutParams(
	                                FrameLayout.LayoutParams.WRAP_CONTENT,
	                                FrameLayout.LayoutParams.WRAP_CONTENT,
	                                Gravity.CENTER));
	                        builder11.setView(parent111);
	                        builder11.setIcon(R.drawable.ic_launcher)
	                        .setTitle("Select Local Municipality")
	                	//.setMessage("How many curently switched on")
	                	.setPositiveButton("OK", new DialogInterface.OnClickListener()
	                	{
	                		@SuppressLint("NewApi")
	                		@Override
	                	public void onClick(DialogInterface dialog, int which) 
	                		{
	                			int number= picker.getValue();
	                			Toast.makeText(SpinnerActivity.this, "You have "+number, Toast.LENGTH_SHORT).show();
	                		}
	                	})
	                	.setNegativeButton("Cancel", new DialogInterface.OnClickListener()
	                		{
	                			@Override
	                	public void onClick(DialogInterface dialog, int which) 
	                			{
	                	Toast.makeText(SpinnerActivity.this, "You Clicked on Cancel", Toast.LENGTH_SHORT).show();
	                			}
	                		}).show();
	                       	 
	                        break;
	                    case 5:
	                        Toast.makeText(parent.getContext(), "Mpumalanga", Toast.LENGTH_SHORT).show();
	                        im.setImageDrawable(null);
	                        im.setImageDrawable(getResources().getDrawable(R.drawable.mpuma));
	                        spinnerTest.setEnabled(false);
                        	spinnerTest.setClickable(false);
                        	setItem.setClickable(true);
	                       	 setItem.setEnabled(true);
	                       	 

		                     	AlertDialog.Builder builder111 = new AlertDialog.Builder(SpinnerActivity.this);
		                        builder111.setCancelable(false);

		                        picker = new NumberPicker(SpinnerActivity.this);
		                        picker.setMinValue(0);
		                        picker.setMaxValue(10);
		                    	picker.setDisplayedValues( new String[] {
		                    			"Albert Luthuli",
		                    			"Bushbuckridge",
		                    			"Dipaleseng ",
		                    			"Dr JS Moroka",
		                    			"Emakhazeni",
		                    			"Emalahleni",
		                    			"Govan Mbeki",
		                    			"Lekwa",
		                    			"Mbombela",
		                    			"Mkhondo",
		                    			"Msukaligwa",
		                    			"Nkomazi",
		                    			"Pixley Ka Seme",
		                    			"Steve Tshwete",
		                    			"Thaba Chweu",
		                    			"Thembisile Hani",
		                    			"Umjindi",
		                    			"Victor Khanye"	 } );
		                        final FrameLayout parent1111 = new FrameLayout(SpinnerActivity.this);
		                        parent1111.addView(picker, new FrameLayout.LayoutParams(
		                                FrameLayout.LayoutParams.WRAP_CONTENT,
		                                FrameLayout.LayoutParams.WRAP_CONTENT,
		                                Gravity.CENTER));
		                        builder111.setView(parent1111);
		                        builder111.setIcon(R.drawable.ic_launcher)
		                        .setTitle("Select Local Municipality")
		                	//.setMessage("How many curently switched on")
		                	.setPositiveButton("OK", new DialogInterface.OnClickListener()
		                	{
		                		@SuppressLint("NewApi")
		                		@Override
		                	public void onClick(DialogInterface dialog, int which) 
		                		{
		                			int number= picker.getValue();
		                			Toast.makeText(SpinnerActivity.this, "You have "+number, Toast.LENGTH_SHORT).show();
		                		}
		                	})
		                	.setNegativeButton("Cancel", new DialogInterface.OnClickListener()
		                		{
		                			@Override
		                	public void onClick(DialogInterface dialog, int which) 
		                			{
		                	Toast.makeText(SpinnerActivity.this, "You Clicked on Cancel", Toast.LENGTH_SHORT).show();
		                			}
		                		}).show();
		                       	 
	                       	 
	                       	 
	                        break;
	                    case 6:
	                        Toast.makeText(parent.getContext(), "The Northern Cape", Toast.LENGTH_SHORT).show();
	                        im.setImageDrawable(null);
	                        im.setImageDrawable(getResources().getDrawable(R.drawable.nc));
	                        spinnerTest.setEnabled(false);
                        	spinnerTest.setClickable(false);
                        	setItem.setClickable(true);
	                       	 setItem.setEnabled(true);
	                       	 
	                       	 AlertDialog.Builder builder5 = new AlertDialog.Builder(SpinnerActivity.this);
		                        builder5.setCancelable(false);
		                        picker = new NumberPicker(SpinnerActivity.this);
		                        picker.setMinValue(0);
		                        picker.setMaxValue(10);
		                    	picker.setDisplayedValues( new String[] {
		                    			"Dikgatlong", 
		                    			"Emthanjeni",
		                    			"Ga-Segonyana",
		                    			"Gamagara",
		                    			"Hantam",
		                    			"Joe Morolong",
		                    			"Kai Garib", 
		                    			"Kamiesberg",
		                    			"Kareeberg",
		                    			"Karoo Hoogland",
		                    			"Kgatelopele",
		                    			"Khâi-Ma",
		                    			"Khara Hais",
		                    			"Kheis",
		                    			"Magareng",
		                    			"Mier",
		                    			"Nama Khoi",
		                    			"Phokwane",
		                    			"Renosterberg",
		                    			"Richtersveld",
		                    			"Siyancuma",
		                    			"Siyathemba",
		                    			"Sol Plaatje",
		                    			"Thembelihle",
		                    			"Tsantsabane", 
		                    			"Ubuntu",
		                    			"Umsobomvu"} );
		                        final FrameLayout parent5 = new FrameLayout(SpinnerActivity.this);
		                        parent5.addView(picker, new FrameLayout.LayoutParams(
		                                FrameLayout.LayoutParams.WRAP_CONTENT,
		                                FrameLayout.LayoutParams.WRAP_CONTENT,
		                                Gravity.CENTER));
		                        builder5.setView(parent5);
		                        builder5.setIcon(R.drawable.ic_launcher)
		                        .setTitle("Select Local Municipality")
		                	//.setMessage("How many curently switched on")
		                	.setPositiveButton("OK", new DialogInterface.OnClickListener()
		                	{
		                		@SuppressLint("NewApi")
		                		@Override
		                	public void onClick(DialogInterface dialog, int which) 
		                		{
		                			int number= picker.getValue();
		                			Toast.makeText(SpinnerActivity.this, "You have "+number, Toast.LENGTH_SHORT).show();
		                		}
		                	})
		                	.setNegativeButton("Cancel", new DialogInterface.OnClickListener()
		                		{
		                			@Override
		                	public void onClick(DialogInterface dialog, int which) 
		                			{
		                	Toast.makeText(SpinnerActivity.this, "You Clicked on Cancel", Toast.LENGTH_SHORT).show();
		                			}
		                		}).show();
	                       	 
	                        break;
	                    case 7:
	                        Toast.makeText(parent.getContext(), "North West", Toast.LENGTH_SHORT).show();
	                        im.setImageDrawable(null);
	                        im.setImageDrawable(getResources().getDrawable(R.drawable.nw));
	                        spinnerTest.setEnabled(false);
                        	spinnerTest.setClickable(false);
                        	setItem.setClickable(true);
	                       	 setItem.setEnabled(true);
	                       	 
	                       	 AlertDialog.Builder builder4 = new AlertDialog.Builder(SpinnerActivity.this);
		                        builder4.setCancelable(false);
		                        picker = new NumberPicker(SpinnerActivity.this);
		                        picker.setMinValue(0);
		                        picker.setMaxValue(10);
		                    	picker.setDisplayedValues( new String[] {
		                    			"City of Matlosana",
		                    			"Ditsobotla",
		                    			"Greater Taung",
		                    			"Kagisano-Molopo",
		                    			"Kgetlengrivier",
		                    			"Lekwa-Teemane",
		                    			"Madibeng", 
		                    			"Mahikeng",
		                    			"Mamusa",
		                    			"Maquassi Hills",
		                    			"Moretele",
		                    			"Moses Kotane",
		                    			"Naledi",
		                    			"Ramotshere Moiloa",
		                    			"Ratlou",
		                    			"Rustenburg",
		                    			"Tlokwe",
		                    			"Tswaing",
		                    			"Ventersdorp",} );
		                        final FrameLayout parent4 = new FrameLayout(SpinnerActivity.this);
		                        parent4.addView(picker, new FrameLayout.LayoutParams(
		                                FrameLayout.LayoutParams.WRAP_CONTENT,
		                                FrameLayout.LayoutParams.WRAP_CONTENT,
		                                Gravity.CENTER));
		                        builder4.setView(parent4);
		                        builder4.setIcon(R.drawable.ic_launcher)
		                        .setTitle("Select Local Municipality")
		                	//.setMessage("How many curently switched on")
		                	.setPositiveButton("OK", new DialogInterface.OnClickListener()
		                	{
		                		@SuppressLint("NewApi")
		                		@Override
		                	public void onClick(DialogInterface dialog, int which) 
		                		{
		                			int number= picker.getValue();
		                			Toast.makeText(SpinnerActivity.this, "You have "+number, Toast.LENGTH_SHORT).show();
		                		}
		                	})
		                	.setNegativeButton("Cancel", new DialogInterface.OnClickListener()
		                		{
		                			@Override
		                	public void onClick(DialogInterface dialog, int which) 
		                			{
		                	Toast.makeText(SpinnerActivity.this, "You Clicked on Cancel", Toast.LENGTH_SHORT).show();
		                			}
		                		}).show();
	                       	 
	                       	 
	                        break;
	                    case 8:
	                        Toast.makeText(parent.getContext(), "Limpopo", Toast.LENGTH_SHORT).show();
	                        im.setImageDrawable(null);
	                        im.setImageDrawable(getResources().getDrawable(R.drawable.limp));
	                        spinnerTest.setEnabled(false);
                        	spinnerTest.setClickable(false);
                        	setItem.setClickable(true);
	                       	 setItem.setEnabled(true);
	                       	 
	                       	 AlertDialog.Builder builder3 = new AlertDialog.Builder(SpinnerActivity.this);
		                        builder3.setCancelable(false);
		                        picker = new NumberPicker(SpinnerActivity.this);
		                        picker.setMinValue(0);
		                        picker.setMaxValue(10);
		                    	picker.setDisplayedValues( new String[] {
		                    			"Aganang",
		                    			"Ba-Phalaborwa",
		                    			"Bela-Bela",
		                    			"Blouberg",
		                    			"Elias Motsoaledi",
		                    			"Ephraim Mogale",
		                    			"Fetakgomo",
		                    			"Greater Giyani",
		                    			"Greater Letaba",
		                    			"Greater Tubatse",
		                    			"Greater Tzaneen",
		                    			"Lepelle-Nkumpi",
		                    			"Makhado",
		                    			"Makhuduthamaga",
		                    			"Maruleng",
		                    			"Modimolle",
		                    			"Mogalakwena",
		                    			"Molemole",
		                    			"Musina",
		                    			"Mutale",
		                    			"Polokwane",
		                    			"Thabazimbi",
		                    			"Thulamela",} );
		                        final FrameLayout parent3 = new FrameLayout(SpinnerActivity.this);
		                        parent3.addView(picker, new FrameLayout.LayoutParams(
		                                FrameLayout.LayoutParams.WRAP_CONTENT,
		                                FrameLayout.LayoutParams.WRAP_CONTENT,
		                                Gravity.CENTER));
		                        builder3.setView(parent3);
		                        builder3.setIcon(R.drawable.ic_launcher)
		                        .setTitle("Select Local Municipality")
		                	//.setMessage("How many curently switched on")
		                	.setPositiveButton("OK", new DialogInterface.OnClickListener()
		                	{
		                		@SuppressLint("NewApi")
		                		@Override
		                	public void onClick(DialogInterface dialog, int which) 
		                		{
		                			int number= picker.getValue();
		                			Toast.makeText(SpinnerActivity.this, "You have "+number, Toast.LENGTH_SHORT).show();
		                		}
		                	})
		                	.setNegativeButton("Cancel", new DialogInterface.OnClickListener()
		                		{
		                			@Override
		                	public void onClick(DialogInterface dialog, int which) 
		                			{
		                	Toast.makeText(SpinnerActivity.this, "You Clicked on Cancel", Toast.LENGTH_SHORT).show();
		                			}
		                		}).show();
	                       	 
	                        break;
	                    case 9:
	                        Toast.makeText(parent.getContext(), "The Western Cape", Toast.LENGTH_SHORT).show();
	                        im.setImageDrawable(null);
	                        im.setImageDrawable(getResources().getDrawable(R.drawable.wc));
	                        spinnerTest.setEnabled(false);
                        	spinnerTest.setClickable(false);
                        	setItem.setClickable(true);
	                       	 setItem.setEnabled(true);
	                       	 
	                         AlertDialog.Builder builder2 = new AlertDialog.Builder(SpinnerActivity.this);
		                        builder2.setCancelable(false);

		                        picker = new NumberPicker(SpinnerActivity.this);
		                        picker.setMinValue(0);
		                        picker.setMaxValue(10);
		                    	picker.setDisplayedValues( new String[] {
		                    			"Beaufort West",
		                    			"Bergrivier",
		                    			"Cape Agulhas",
		                    			"Breede Valley",
		                    			"Cederberg",
		                    			"City of Cape Town",
		                    			"Drakenstein",
		                    			"George",
		                    			"Hessequa",
		                    			"Kannaland",
		                    			"Knysna",
		                    			"Laingsburg",
		                    			"Langeberg",
		                    			"Matzikama",
		                    			"Mossel Bay",
		                    			"Oudtshoorn",
		                    			"Overstrand",
		                    			"Prince Albert",
		                    			"Saldanha Bay",
		                    			"Stellenbosch",
		                    			"Swartland",
		                    			"Swellendam",
		                    			"Theewaterskloof" } );
		                        final FrameLayout parent11111 = new FrameLayout(SpinnerActivity.this);
		                        parent11111.addView(picker, new FrameLayout.LayoutParams(
		                                FrameLayout.LayoutParams.WRAP_CONTENT,
		                                FrameLayout.LayoutParams.WRAP_CONTENT,
		                                Gravity.CENTER));
		                        builder2.setView(parent11111);
		                        builder2.setIcon(R.drawable.ic_launcher)
		                	.setTitle("Select Local Municipality")
		                	//.setMessage("How many curently switched on")
		                	.setPositiveButton("OK", new DialogInterface.OnClickListener()
		                	{
		                		@SuppressLint("NewApi")
		                		@Override
		                	public void onClick(DialogInterface dialog, int which) 
		                		{
		                			int number= picker.getValue();
		                			Toast.makeText(SpinnerActivity.this, "You have "+number, Toast.LENGTH_SHORT).show();
		                		}
		                	})
		                	.setNegativeButton("Cancel", new DialogInterface.OnClickListener()
		                		{
		                			@Override
		                	public void onClick(DialogInterface dialog, int which) 
		                			{
		                	Toast.makeText(SpinnerActivity.this, "You Clicked on Cancel", Toast.LENGTH_SHORT).show();
		                			}
		                		}).show();
		                        
		                        break;
		                }      
	            	 }
	            	 catch(Exception e)
                     {
                     	
                     }
	            }

	            @Override
	            public void onNothingSelected(AdapterView<?> parent) {

	               // sometimes you need nothing here
	            }
	        });

		 setItem = (ImageButton) findViewById(R.id.next101);
			
		 setItem.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			try{
				System.gc();
				Intent i = new Intent(getApplicationContext(), HouseActivity.class);
				i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				//i.putExtra("info", data101);
				//i.putExtra("welcome","true");
				startActivity(i);

			}
			catch(Exception e)
			{
				
			}
			}
			
			});
	 
	 }
	}