package com.example.mycollection;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class CounterScreen extends Activity implements OnClickListener {
    EditText etname,enternumber;
    TextView tvresults;
    Button btnincreament,btndecreament;
    String strname; 
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.counter);
        //initialization
        btnincreament = (Button) findViewById(R.id.btnCounterIncreament);
        btnincreament.setOnClickListener(this);
       
        btndecreament = (Button) findViewById(R.id.btnCounterdecreament);
        btndecreament.setOnClickListener(this);
       
        enternumber =  findViewById(R.id.enternumber);
        tvresults = (TextView) findViewById(R.id.tvresult);
       
    }

    @Override
    public void onClick(View v) {
    	int value = 0;
        String showText ="True";
        Intent intent = new Intent(this,CounterScreen.class);
        strname=etname.getText().toString();
       
        //strname = Integer.parseInt(strname);
                switch (v.getId()) {
                case R.id.btnCounterIncreament:
                   value = Integer.parseInt( enternumber.getText().toString());
                   ++value;
                   enternumber.setText(value);
					TextView tvresult;
					tvresults.setText(String.valueOf("ans"+value));
					
					
                    break;
                case R.id.btnCounterdecreament:
                	  value = Integer.parseInt( enternumber.getText().toString());
                      --value;
                    break;

                default:
                    break;}
                if (showText != null) {
                    tvresults.setText("results:" +enternumber);
                   
                }
                }
   

   
}
	
