package com.tutorialsface.audioplayer;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class ListViewImagesActivitybulbs extends Activity {
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainbulbs);
        getActionBar().hide();
        
        ArrayList<ItemDetailsbulbs> image_details = GetSearchResults();
        
        final ListView lv1 = (ListView) findViewById(R.id.listV_main);
        lv1.setAdapter(new ItemListBaseAdapterbulbs(this, image_details));
        
        lv1.setOnItemClickListener(new OnItemClickListener() {
        	@Override
        	public void onItemClick(AdapterView<?> a, View v, int position, long id) { 
        		Object o = lv1.getItemAtPosition(position);
            	ItemDetailsbulbs obj_itemDetails = (ItemDetailsbulbs)o;
        		Toast.makeText(ListViewImagesActivitybulbs.this, "You have chosen : " + " " + obj_itemDetails.getName(), Toast.LENGTH_LONG).show();
        	}  
        });
    }
    
    private ArrayList<ItemDetailsbulbs> GetSearchResults(){
    	ArrayList<ItemDetailsbulbs> results = new ArrayList<ItemDetailsbulbs>();
    	
    	ItemDetailsbulbs item_details = new ItemDetailsbulbs();
    	item_details.setName("LED Bulbs");
    	item_details.setItemDescription("Spicy Chiken Pizza");
    	item_details.setPrice("RS 310.00");
    	item_details.setImageNumber(1);
    	results.add(item_details);
    	
    	item_details = new ItemDetailsbulbs();
    	item_details.setName("Edison Bulbs");
    	item_details.setItemDescription("Beef Burger");
    	item_details.setPrice("RS 350.00");
    	item_details.setImageNumber(2);
    	results.add(item_details);
    	
    	item_details = new ItemDetailsbulbs();
    	item_details.setName("Standard Household");
    	item_details.setItemDescription("Chiken Pizza");
    	item_details.setPrice("RS 250.00");
    	item_details.setImageNumber(3);
    	results.add(item_details);
    	
    	item_details = new ItemDetailsbulbs();
    	item_details.setName("Halogen Bulbs");
    	item_details.setItemDescription("Chicken Burger");
    	item_details.setPrice("RS 350.00");
    	item_details.setImageNumber(4);
    	results.add(item_details);
    	
    	item_details = new ItemDetailsbulbs();
    	item_details.setName("MR Halogen");
    	item_details.setItemDescription("Fish Burger");
    	item_details.setPrice("RS 310.00");
    	item_details.setImageNumber(5);
    	results.add(item_details);
    	
    	item_details = new ItemDetailsbulbs();
    	item_details.setName("PAR-Bulbs");
    	item_details.setItemDescription("Mango Juice");
    	item_details.setPrice("RS 250.00");
    	item_details.setImageNumber(6);
    	results.add(item_details);
    	
    	
    	item_details = new ItemDetailsbulbs();
    	item_details.setName("CFL Bulbs");
    	item_details.setItemDescription("Mango Juice");
    	item_details.setPrice("RS 250.00");
    	item_details.setImageNumber(7);
    	results.add(item_details);
    	
    	item_details = new ItemDetailsbulbs();
    	item_details.setName("Fluorescent Bulbs");
    	item_details.setItemDescription("Mango Juice");
    	item_details.setPrice("RS 250.00");
    	item_details.setImageNumber(8);
    	results.add(item_details);
    	
    	item_details = new ItemDetailsbulbs();
    	item_details.setName("Appliance Bulbs");
    	item_details.setItemDescription("Mango Juice");
    	item_details.setPrice("RS 250.00");
    	item_details.setImageNumber(9);
    	results.add(item_details);
    	return results;
    }
}