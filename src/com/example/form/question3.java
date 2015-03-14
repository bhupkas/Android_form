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

public class question3 extends Activity{
	
	private Button nextbtn;
	
	private RadioGroup Button_group;
	private RadioButton selected;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.q3);
	
		addListenerOnButton();
		
	}
	
	public void addListenerOnButton() {
		  
	    final Context context = this;  
	    nextbtn = (Button) findViewById(R.id.next);
	    Button_group = (RadioGroup) findViewById(R.id.group1);
		nextbtn.setOnClickListener(new OnClickListener() {
	 
			@Override
			public void onClick(View v) {
	 
					int selectedId = Button_group.getCheckedRadioButtonId();  
					if(selectedId != -1)	
					{
						View radioButton = Button_group.findViewById(selectedId);
						selectedId = Button_group.indexOfChild(radioButton);
					}
	                Log.e("Debug",Integer.toString(selectedId));
				
	                int val1 = getIntent().getIntExtra("q1",-1);
	                int val2 = getIntent().getIntExtra("q2",-1);
	                
					Intent intent = new Intent(context, question4.class);
					
					intent.putExtra("q1",val1);
					intent.putExtra("q2", val2);
					intent.putExtra("q3",selectedId);
					
	                startActivity(intent);   
				

			}
	 
		});
	 
	  }
	
	
}
