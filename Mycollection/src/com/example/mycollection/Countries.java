package com.example.mycollection;


import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.support.v7.appcompat.R.string;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

public class Countries extends Activity {
	Spinner country;
	

	@Override
	
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.countries);
//Spinner element

 country = (Spinner) findViewById(R.id.collapseActionView);
//item on click
Countries.setOnItemSelectedListener((OnItemSelectedListener) this);
//drop down items
List<String> list = new ArrayList<String>();
		list.add("Kenya");
		list.add("Australia");
		list.add("USA");
		list.add("Canada");
		list.add("Netherlands");
		list.add("Algeria");
	    list.add("Germany");
		list.add("Congo");
	    list.add("Combola");
	    list.add("Sijuingine");
        list.add("Nimechoka");
		        
		
		//design
		ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
		dataAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
		Countries.setAdapter(dataAdapter);}
		private static void setAdapter(ArrayAdapter<String> dataAdapter) {
		// TODO Auto-generated method stub
		
	}
		//onClick dropDown
		public void addListenerOnSpinnerItemSelection(){
			//initialization
			
			Countries.setOnItemSelectedListener(new OnItemSelectedListener() {

				@Override
				public void onItemSelected(AdapterView<?> parent, View view,
						int position, long id) {
					//show the selected item
					Toast.makeText(parent.getContext(),"OnItemSelectedListener:"+parent.getItemAtPosition(position)
					.toString(),Toast.LENGTH_SHORT).show();
					
					
				}
	
				@Override
				public void onNothingSelected(AdapterView<?> parent) {
					// TODO Auto-generated method stub
					
				}
			});;
		
		}
		private static void setOnItemSelectedListener(
				OnItemSelectedListener onItemSelectedListener) {
			// TODO Auto-generated method stub
			
		}} 
	

