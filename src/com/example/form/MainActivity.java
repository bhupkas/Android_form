package com.example.form;

import android.app.Activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
 
public class MainActivity extends Activity {
 

private Button btnDisplay;
 
  @Override
  public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_main);
	
	addListenerOnButton();
 
  }
 
  public void addListenerOnButton() {
	  
    final Context context = this;  
    btnDisplay = (Button) findViewById(R.id.btnDisplay);
	btnDisplay.setOnClickListener(new OnClickListener() {
 
		@Override
		public void onClick(View v) {
			    Intent intent = new Intent(context, question1.class);
                startActivity(intent);   
		}
 
	});
 
  }
}