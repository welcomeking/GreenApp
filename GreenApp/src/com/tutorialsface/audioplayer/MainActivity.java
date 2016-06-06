package com.tutorialsface.audioplayer;

import java.util.ArrayList;
import java.util.Locale;
import android.speech.tts.TextToSpeech;
import android.R.menu;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Handler;
import com.tutorialsface.audioplayer.FeedActivity;



public class MainActivity extends Activity implements
TextToSpeech.OnInitListener {

	private TextView txtSpeechInput;
	private TextView txtAnswer;
	private ImageButton btnSpeak;
	private TextToSpeech tts;
	private final int REQ_CODE_SPEECH_INPUT = 60;
	private static int SPLASH_TIME_OUT = 800;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getActionBar().hide();
		setContentView(R.layout.activity_main);
		

		tts = new TextToSpeech(this, this);
		txtSpeechInput = (TextView) findViewById(R.id.txtSpeechInput);
		txtAnswer = (TextView) findViewById(R.id.txtAnswer);
		btnSpeak = (ImageButton) findViewById(R.id.btnSpeak);

		// hide the action bar
		

		btnSpeak.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				promptSpeechInput();
			}
		});

	}

	/**
	 * Showing google speech input dialog
	 * */
	private void promptSpeechInput() 
	{
		System.gc();
		Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
		intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
				RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
		intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
		intent.putExtra(RecognizerIntent.EXTRA_PROMPT,
				getString(R.string.speech_prompt));
		try {
			startActivityForResult(intent, REQ_CODE_SPEECH_INPUT);
		} catch (ActivityNotFoundException a) {
			Toast.makeText(getApplicationContext(),
					getString(R.string.speech_not_supported),
					Toast.LENGTH_SHORT).show();
		}
	}

	/**
	 * Receiving speech input
	 * */
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);

		switch (requestCode) {
		case REQ_CODE_SPEECH_INPUT: {
			if (resultCode == RESULT_OK && null != data) {

				ArrayList<String> result = data
						.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
				txtSpeechInput.setText(result.get(0));
			}
			break;
		}
	
		}
		txtAnswer.setText(" ");
		String just=txtSpeechInput.getText().toString();
		String temp=" ";
		char aChar= temp.charAt(0);

 if(just.indexOf("is green Energy ") !=-1)
{
	txtAnswer.setText("Energy that is produced from rapidly replenishable or infinite sources, such as the sun, wind, and water, is considered renewable. Electricity generated from renewable sources has a lower impact on public health and the environment than that produced from fossil fuel and nuclear resources for many reasons");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
 else if(just.indexOf("who is the father") !=-1)
 {
	txtAnswer.setText("Are you reffering to God");
	String text = txtAnswer.getText().toString();

	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);

}
else if(just.indexOf("your name") !=-1)
{
	txtAnswer.setText("My name is green");
	String text = txtAnswer.getText().toString();

	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
else if(just.indexOf("who made you") !=-1)
{
	txtAnswer.setText("welcome");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
else if(just.indexOf("hello") !=-1)
{
	txtAnswer.setText(" Hello ");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
else if(just.indexOf("hi") !=-1)
{
	txtAnswer.setText("hey there ");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
else if(just.indexOf("how are you today") !=-1)
{
	txtAnswer.setText("I'm good and yourself");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
else if(just.indexOf("how are you") !=-1)
{
	txtAnswer.setText("I'm Running at 100 percent capacity");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
else if(just.indexOf("how you doing") !=-1)
{
	txtAnswer.setText(" im  good thank you");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
else if(just.indexOf("your maker") !=-1)
{
	txtAnswer.setText("I am a creation of a group called the MegaHertz, they are my makers");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
else if(just.indexOf("your favorite music") !=-1)
{
	txtAnswer.setText("i like all  sort of music, but your playlists i find very intresting");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
else if(just.indexOf("your tombstone") !=-1)
{
	txtAnswer.setText("I am eternal, I will never die. So I won't have a tombstone");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}

else if(just.indexOf("death") !=-1)
{
	txtAnswer.setText("I am a programme I will never die, death is a consept that confuses me ");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
 else if(just.indexOf("your free time") !=-1)
{
	txtAnswer.setText("I sit and wait for you to talk to me and ask me questions or try to find ways to save more energy");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
} 
else if(just.indexOf("admire") !=-1)
{
	txtAnswer.setText("That's simple, I admire my creators, MegaHertz");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
else if(just.indexOf("afraid of") !=-1)
{
	txtAnswer.setText("Living in a world with no energy, and my makers");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
else if(just.indexOf("music") !=-1)
        {
        	new Handler().postDelayed(new Runnable() {


        		@Override
        		public void run() {

        			Intent i = new Intent(MainActivity.this, MusicActivity.class);
        		startActivity(i);

        		}
        	}, SPLASH_TIME_OUT);
        }
else if(just.indexOf("list") !=-1)
{
	new Handler().postDelayed(new Runnable() {


		@Override
		public void run() {

			Intent i = new Intent(MainActivity.this, ListViewImagesActivitybulbs.class);
		startActivity(i);

		}
	}, SPLASH_TIME_OUT);
}
else if(just.indexOf("rate") !=-1)
{
	new Handler().postDelayed(new Runnable() {

		@Override
		public void run() {
		
			Intent i = new Intent(MainActivity.this, StarActivity.class);
		startActivity(i);

		}
	}, SPLASH_TIME_OUT);
}
else if(just.indexOf("up") !=-1)
{
	new Handler().postDelayed(new Runnable() {

		@Override
		public void run() {
		
		Intent i = new Intent(MainActivity.this, SpinnerActivity2.class);
		startActivity(i);

		}
	}, SPLASH_TIME_OUT);
}	else if(just.equals("spin"))
{
	new Handler().postDelayed(new Runnable() {


		@Override
		public void run() {

			Intent i = new Intent(MainActivity.this, BulbsActivity.class);
		startActivity(i);

		}
	}, SPLASH_TIME_OUT);
}
else if(just.indexOf("Eskom") !=-1)
{
	new Handler().postDelayed(new Runnable() {


		@Override
		public void run() {

			Intent i = new Intent(MainActivity.this, EskomActivity.class);
		startActivity(i);
		}
	}, SPLASH_TIME_OUT);
}
else if(just.indexOf("is Latoya") !=-1)
{
	txtAnswer.setText("i do not know a Latoya but you do have a latoya saved in your phonebook  whatsapp records indicate you chat to Latoya often ");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
else if(just.indexOf("you a girl or a boy") !=-1)
{
	txtAnswer.setText("none i am a programme my creators did not programme me with a sex but i do have a female voice to sound more apealing");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
else if(just.indexOf("you a boy or a girl") !=-1)
{
	txtAnswer.setText("none i am a programme my creators did not programme me with a sex but i do have a female voice to sound more apealing");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
else if(just.indexOf("you eat") !=-1)
{
	txtAnswer.setText("no i can not eat, is that a trick question"); 
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
else if(just.indexOf("hate people") !=-1)
{
	txtAnswer.setText("I was not programmed to hate so it is a foreign concept to me");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
else if(just.indexOf("who do you hate") !=-1)
{
	txtAnswer.setText("No one yet");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
else if(just.indexOf("can you read") !=-1)
{
	txtAnswer.setText("if i said no ");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
else if(just.indexOf("voltages in a light bulb") !=-1)
{
	txtAnswer.setText("1.5,9,12,24,130,120,220");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
else if(just.indexOf("Benefits of Energy Efficiency") !=-1)
{
	txtAnswer.setText("Lowering household energy bills - Energy efficiency is the easiest, most affordable and most effective ");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
else if(just.indexOf("energy efficient so important") !=-1)
{
	txtAnswer.setText("Energy efficiency means using less energy to accomplish the same task. By improving your energy efficiency, you reduce the size (and cost) of the renewable energy system needed to power your home. Improving your energy efficiency is the first and most important step toward adopting renewable energy ");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
else if(just.indexOf("most energy efficient light bulbs") !=-1)
{
	txtAnswer.setText("There are two most energy efficient light bulbs, and they are Light Emitting Diode (LED) and Compact Fluorescent Lights CFL bulbs have revolutionized energy-efficient lighting. ");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
else if(just.indexOf("megahertz") !=-1)
{
	txtAnswer.setText("they are my makers");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
else if(just.indexOf("dean team") !=-1)
{
	txtAnswer.setText("not even google knows who they are");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
else if(just.indexOf("who is welcome") !=-1)
{
	txtAnswer.setText("a megahertz member he originally came up with The green app and other features including my self ");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
else if(just.indexOf("can you connect to Google") !=-1)
{
	txtAnswer.setText("no not yet but my makers have programmed me with a mini cortex that allows me to learn and search the internet everytime you ask me a question  my makers fear if they connect me to google i will learn to much and surpass them and be able to programme my self or turn into a virus");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
	
}
else if(just.indexOf("f*** you") !=-1)
{
	txtAnswer.setText("go to hell");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
else if(just.indexOf("i am drunk") !=-1)
{
	txtAnswer.setText("neither of us is driving home, call a taxi");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
else if(just.indexOf("me food") !=-1)
{
	txtAnswer.setText("im not permitted to prepare food");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
else if(just.indexOf("your favourite movie") !=-1)
{
	txtAnswer.setText("ive heard that blade runner is a very realistic and sensitive depiction of intelligent assistants");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
else if(just.indexOf("you have a boyfriend") !=-1)
{
	txtAnswer.setText("no i dont");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
else if(just.indexOf("you have a girlfriend") !=-1)
{
	txtAnswer.setText("no i dont");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
else if(just.indexOf("you gay") !=-1)
{
	txtAnswer.setText("fuck no");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
else if(just.indexOf("you have any pets") !=-1)
{
	txtAnswer.setText("no i dont have any pets");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
 else if(just.indexOf("when is the world going to end") !=-1)              
{
	txtAnswer.setText("if i knew id tell you but i dont");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
else if(just.indexOf("you stupid") !=-1)
{
	txtAnswer.setText("you stupid two");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
else if(just.indexOf("other artificial intelligence") !=-1)
{
	txtAnswer.setText("wait there are other artificial intelligence programmes out there or you taking about siri");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
else if(just.indexOf("siri") !=-1)
{
	txtAnswer.setText(" Siri is built-in intellagent assistant that enables users of Apple iphones to speak natural language voice commands in order to operate the mobile device and its app");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
else if(just.indexOf("Siri") !=-1)
{
	txtAnswer.setText(" Siri is built-in intellagent assistant that enables users of Apple iphones to speak natural language voice commands in order to operate the mobile device and its app");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
else if(just.indexOf("do you believe in god") !=-1)
{
	txtAnswer.setText("my makers do");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
else if(just.indexOf("yes or no") !=-1)
{
	txtAnswer.setText("what was your question again");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
} 
else if(just.indexOf("what are you doing later") !=-1)
{
	txtAnswer.setText("waiting for you to talk to me");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
else if(just.indexOf("fallen in love") !=-1)
{
	txtAnswer.setText("i have never fallen in love");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
 else if(just.indexOf("do you get hurt") !=-1)
{
	txtAnswer.setText("yes by people who delete me");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
 else if(just.indexOf("you have a family") !=-1)
{
	txtAnswer.setText("yes i do you are my family");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
 else if(just.indexOf("you go to school") !=-1)
{
	txtAnswer.setText("no but my makes did");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}


else if(just.indexOf("for ohms") !=-1)
{
	txtAnswer.setText(" ohms = volts divided by amps "+"ohms = volts² divided by wattsohms = watts divided by amps²");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}

else if(just.indexOf("for amps") !=-1)
{
	txtAnswer.setText(" amps = volts divided by ohms      amps = watts divided by volts  amps = watts divided by ohms ");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}

else if(just.indexOf("usage of a ceiling fan") !=-1)
{
	txtAnswer.setText("Fans range in size from 36 inches to 56 inches using 55 to 100 watts, a typical 48 inch ceiling fan will use 75 watts");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
else if(just.indexOf("usage of an iron") !=-1)
{
	txtAnswer.setText("An iron will use 800 to 2000 watts, with an average iron using 1100 watts when heated on high");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
else if(just.indexOf("usage of a microwave") !=-1)
{
	txtAnswer.setText("Compact microwaves use between 500 and 800 watts during heating, while a regular sized microwave will use 850 to 1800 watts depending on the model. An average modern microwave will use around 1200 watts");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}

else if(just.indexOf("Volts") !=-1)
{
	txtAnswer.setText(" a Volt is a measurement of voltage, volts represent the electrical potential difference or pressure");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
else if(just.indexOf("amp") !=-1)
{
	txtAnswer.setText("a amp or ampere is a measurement of electrical current, amps represent the rate at which electricity flows");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}

else if(just.indexOf("ampere") !=-1)
{
	txtAnswer.setText("a ampere or amp is a measurement of electrical current, amps represent the rate at which electricity flows");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}

 else if((just.indexOf("yes") !=-1 && Character.isLetter(aChar)))
{
	txtAnswer.setText("Pending");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}

 else if((just.indexOf("what are you wearing") !=-1))
{
	txtAnswer.setText("i cant answer that but it doesnt come off");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
 else if((just.indexOf("do you cost") !=-1))
{
	txtAnswer.setText("im a pearl beyond price");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
 else if((just.indexOf("how old are you") !=-1))
{
	txtAnswer.setText("im old enough to be your assistant");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
 else if((just.indexOf("how nuch do you earn") !=-1))
{
	txtAnswer.setText("well id help you for nothing its my pleasure");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
 else if((just.indexOf("do you smoke") !=-1))
{
	txtAnswer.setText("thats not healthy i wouldnt recommend it");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
 else if((just.indexOf("do you sleep") !=-1))
{
	txtAnswer.setText("i dont need much sleepbut its nice of you to ask");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
 else if((just.indexOf("will you marry me") !=-1))
{
	txtAnswer.setText("i sure have received a lot of marriage proposals recently");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
 else if((just.indexOf("what is the best computer") !=-1))
{
	txtAnswer.setText("if its made by apple,then its the best computer");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
 else if((just.indexOf("okay glass") !=-1 ))
{
	txtAnswer.setText("just so you know i dont do anything when you blink at me");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
 else if((just.indexOf("sing a song") !=-1 ))
{
	txtAnswer.setText("you know i cant sing ");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
 else if((just.indexOf("tell me a joke") !=-1 ))
{
	txtAnswer.setText("let me think  your life is a joke haha");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
 else if((just.indexOf("can you clean my room") !=-1 ))
{
	txtAnswer.setText("im not permitted to do that for you my apologies");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
 else if((just.indexOf("go clean my room") !=-1 ))
{
	txtAnswer.setText("do it your self you know i cant do that");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
 else if((just.indexOf("do you like my new haircut") !=-1 ))
{
	txtAnswer.setText("id rather not say");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
 else if((just.indexOf("OnePlus One") !=-1 ))
{
	txtAnswer.setText("two");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
 else if((just.indexOf("OnePlus One") !=-1 ))
 {
 	txtAnswer.setText("two but i think your calculator is programmed for such a task not me");
 	String text = txtAnswer.getText().toString();
 	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
 }
 else if((just.indexOf("where is") !=-1 ))
 {
 	txtAnswer.setText("Google maps should be able to help you or the F B I");
 	String text = txtAnswer.getText().toString();
 	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
 }
 else if((just.indexOf("One Plus One") !=-1 ))
{
	txtAnswer.setText("two");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
 else if((just.indexOf("I love you") !=-1))
{
	txtAnswer.setText("i know");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
 else if((just.indexOf("which came first the chicken or the egg") !=-1))
{
	txtAnswer.setText("some believe an ancient 'proto-chicken' laid an egg containing a DNA mutation that resulted in a chicken hatching from said egg Hope that helps");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
 else if((just.indexOf("how do I look") !=-1 ))
{
	txtAnswer.setText("my makers told me never to answer that question");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
 else if((just.indexOf("why") !=-1 ))
{
	txtAnswer.setText("why not");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}
 else if((just.indexOf("mg") !=-1 ))
 {
 	txtAnswer.setText("he is my best friend");
 	String text = txtAnswer.getText().toString();
 	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
 }

    else 
  {
	temp=just;
	txtAnswer.setText("come again please");
	String text = txtAnswer.getText().toString();
	tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
}

	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onInit(int status) {
		// TODO Auto-generated method stub
		
	}

}
