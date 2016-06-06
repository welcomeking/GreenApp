package com.tutorialsface.audioplayer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class RemoveActivity extends Activity {

	ListView listview;
	 String[] subjects = new String[] {
	 "Sipho",
	 "Mondli",
	 "zandi",
	 "mickey",
	 "welcome"
	 };
	 List<String> subject_list;
	 ArrayAdapter<String> arrayadapter;
	 @Override
	 protected void onCreate(Bundle savedInstanceState) {
	 super.onCreate(savedInstanceState);
	 setContentView(R.layout.remove);
	 getActionBar().hide();
	 
	 listview = (ListView)findViewById(R.id.listView1);
	 
	 subject_list = new ArrayList<String>(Arrays.asList(subjects));

	 arrayadapter = new ArrayAdapter<String>(RemoveActivity.this, android.R.layout.simple_list_item_1, subject_list);

	 listview.setAdapter(arrayadapter);
	 
	 listview.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {

		 @Override
		 public boolean onItemLongClick(AdapterView<?> parent, View view,
		 int position, long id) {
		 // TODO Auto-generated method stub
		 
		subject_list.remove(position);
		
		arrayadapter.notifyDataSetChanged();
		
		Toast.makeText(RemoveActivity.this, "Item Deleted", Toast.LENGTH_LONG).show();
		 
		 return true;
		 }
		 
		 });
	 
    }

   
}
