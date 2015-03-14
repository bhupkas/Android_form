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

public class question1 extends Activity{

	private RadioGroup Button_group;
	private RadioButton selected;
	
	private Button nextbtn;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.q1);
		
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
					
					Intent intent = new Intent(context, question2.class);
					intent.putExtra("q1",selectedId);
					startActivity(intent);   
				       
					
					
				}
		 
			});
		 
		  }
}
