package com.example.mycollection;




import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

//declaration.

public class LoginScreen extends Activity {
	EditText etusername;
	EditText etpassword;
	Button btntoast;
	Button btnback;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login_screen);
		//initializing of values
		
				etusername=(EditText) findViewById(R.id.etusername);
				etpassword=(EditText) findViewById(R.id.etpassword);
				
				btntoast=(Button) findViewById(R.id.btntoast);
		        btntoast.setOnClickListener((OnClickListener) this);
		        
		        btnback=(Button) findViewById(R.id.btnback);
		        btnback.setOnClickListener((OnClickListener) this);
		
	}

	
}
