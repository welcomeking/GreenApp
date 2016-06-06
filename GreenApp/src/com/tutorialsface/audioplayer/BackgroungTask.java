package com.tutorialsface.audioplayer;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

public class BackgroungTask  extends AsyncTask<String,Void,String>{
	Context ctx;
	BackgroungTask(Context ctx){
		this.ctx=ctx;
	}
@override
protected void onPreExecute(){
	super.onPreExecute();
}
	@Override
	protected String doInBackground(String... params) {
		String reg_url="http://10.0.2.2/greenapp.netne.ne/register.php";
		String login_url="http://10.0.2.2/greenapp.netne.ne/login.php";
		String method=params[0];
		if(method.equals("login"))
		{
			String username=params[1];
			String password=params[2];
			
			try
			{
				URL url=new URL(login_url);
				HttpURLConnection httpURLConnection=(HttpURLConnection)url.openConnection();
				httpURLConnection.setRequestMethod("POST");
				httpURLConnection.setDoOutput(true);
				OutputStream OS=httpURLConnection.getOutputStream();
				BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(OS,"UTF-8"));
				String data=URLEncoder.encode("user_name","UTF-8")+"="+URLEncoder.encode(username,"UTF-8")+"&"+
				URLEncoder.encode("user_password","UTF-8")+"="+URLEncoder.encode(password,"UTF-8");
				
				bufferedWriter.write(data);
				bufferedWriter.flush();
				bufferedWriter.close();
				OS.close();
				InputStream IS=httpURLConnection.getInputStream();
				IS.close();
				return "Successfully log in";
			}
			catch(MalformedURLException e)
			{
				e.printStackTrace();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		
		}
		if(method.equals("register"))
		{
			String firstName=params[1];
			String lastName=params[2];
			String email=params[3];
			String username=params[4];
			String password=params[5];
			String confirmPassword=params[6];
	
			try {
				URL url=new URL(reg_url);
				HttpURLConnection httpURLConnection=(HttpURLConnection)url.openConnection();
				httpURLConnection.setRequestMethod("POST");
				httpURLConnection.setDoOutput(true);
				OutputStream OS=httpURLConnection.getOutputStream();
				BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(OS,"UTF-8"));
				String data=URLEncoder.encode("userfirstName","UTF-8")+"="+URLEncoder.encode(firstName,"UTF-8")+"&"+
				URLEncoder.encode("userlastName","UTF-8")+"="+URLEncoder.encode(lastName,"UTF-8")+"&"+
				URLEncoder.encode("useremail","UTF-8")+"="+URLEncoder.encode(email,"UTF-8")+"&"+
				URLEncoder.encode("user_name","UTF-8")+"="+URLEncoder.encode(username,"UTF-8")+"&"+
				URLEncoder.encode("user_password","UTF-8")+"="+URLEncoder.encode(password,"UTF-8")+"&"+
				URLEncoder.encode("user_conPassword","UTF-8")+"="+URLEncoder.encode(confirmPassword,"UTF-8");
				bufferedWriter.write(data);
				bufferedWriter.flush();
				bufferedWriter.close();
				OS.close();
				InputStream IS=httpURLConnection.getInputStream();
				IS.close();
				return "Registration successful";
				
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
	
	@override
	protected void onProgressUpdate(Void...values ){
		super.onProgressUpdate(values);
	}
	
	@override
	protected void onPostExecute(String result){
	Toast.makeText(ctx,result,Toast.LENGTH_LONG).show();
	}
	

}

