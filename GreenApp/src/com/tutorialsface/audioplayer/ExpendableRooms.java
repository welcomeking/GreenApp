package com.tutorialsface.audioplayer;

import java.util.ArrayList;

import android.app.ExpandableListActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ExpandableListView.OnChildClickListener;

public class ExpendableRooms extends ExpandableListActivity implements

OnChildClickListener {
	private Toast toast;
	TextView textStatus;
@Override
public void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
ExpandableListView expandbleLis = getExpandableListView();
expandbleLis.setDividerHeight(2);
expandbleLis.setGroupIndicator(null);
expandbleLis.setClickable(true);

setGroupData();
setChildGroupData();

NewAdapter mNewAdapter = new NewAdapter(groupItem, childItem);
mNewAdapter
		.setInflater(
				(LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE),
				this);
getExpandableListView().setAdapter(mNewAdapter);
expandbleLis.setOnChildClickListener(this);
}

public void setGroupData() {
groupItem.add("TechNology");
groupItem.add("Mobile");
groupItem.add("Manufacturer");
groupItem.add("Extras");
}

ArrayList<String> groupItem = new ArrayList<String>();
ArrayList<Object> childItem = new ArrayList<Object>();

public void setChildGroupData() {
/**
 * Add Data For TecthNology
 */
ArrayList<String> child = new ArrayList<String>();
child.add("welcome");
child.add("Drupal");
child.add(".Net Framework");
child.add("PHP");
childItem.add(child);

/**
 * Add Data For Mobile
 */
child = new ArrayList<String>();
child.add("Android");
child.add("Window Mobile");
child.add("iPHone");
child.add("Blackberry");
childItem.add(child);
/**
 * Add Data For Manufacture
 */
child = new ArrayList<String>();
child.add("HTC");
child.add("Apple");
child.add("Samsung");
child.add("Nokia");
childItem.add(child);
/**
 * Add Data For Extras
 */
child = new ArrayList<String>();
child.add("Contact Us");
child.add("About Us");
child.add("Location");
child.add("Root Cause");
childItem.add(child);
}	
	public View getViewByPosition(int pos, ListView listView) 
	{
		final int firstListItemPosition = listView.getFirstVisiblePosition();
		final int lastListItemPosition = firstListItemPosition + listView.getChildCount() - 1;

		if (pos < firstListItemPosition || pos > lastListItemPosition ) {
			return listView.getAdapter().getView(pos, null, listView);
		} else {
			final int childIndex = pos - firstListItemPosition;
			String message=listView.getChildAt(childIndex).toString();
			textStatus.setText("it works answer is "+message);
			
			return listView.getChildAt(childIndex);
			
		
		}
}
	
@Override
public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) 
{
	
	if(groupPosition==1){
        if(childPosition == 1)
        {
            Intent child0Intent = new Intent(getBaseContext(), ListViewImagesActivitybulbs.class);
            startActivity(child0Intent);
            }
	}

return false;
}


	
}

