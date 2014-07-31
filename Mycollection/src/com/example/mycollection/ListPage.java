package com.example.mycollection;

import java.util.ArrayList;
import java.util.Arrays;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class ListPage extends Activity implements
OnItemClickListener {

// Declaration of Variables
private ListView listView;
private ArrayAdapter<String> stringArrayAdapter;
String[] planets = { "Contact", "AdditionScreen", "Subtraction", "LoginSreen", "Countries",
"Home", "", "Counter" };


	
	
	@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.list);

// Initialization
listView = (ListView) findViewById(R.id.listView1);
ArrayList<String> planetList = new ArrayList<String>();
planetList.addAll(Arrays.asList(planets));

// Design the ListView
stringArrayAdapter = new ArrayAdapter<String>(this,
R.layout.support_simple_spinner_dropdown_item, planetList);
listView.setAdapter(stringArrayAdapter);
listView.setOnItemClickListener(this);

}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
	long id) {
	String ListData = listView.getItemAtPosition(position).toString();
	switch (position) {
	case 0:
	startActivity(new Intent(getApplicationContext(),CounterScreen.class));
	break;
	case 1:
	startActivity(new Intent(getApplicationContext(),Subtraction.class));
	break;
	case 2:
	startActivity(new Intent(getApplicationContext(),LoginScreen.class));
	        break;
	        
	case 3:
	   	startActivity(new Intent(getApplicationContext(),ListPage.class));
	       break;

	case 4:
	        startActivity(new Intent(getApplicationContext(),AdditionScreen.class));
	       break;

	




	
}

	}

}

