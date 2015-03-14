package com.example.form;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

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

public class question4 extends Activity{

	private Button nextbtn;
	private RadioGroup Button_group;
	private RadioButton selected;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.q4);
	
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
	                int val3 = getIntent().getIntExtra("q3",-1);
	                int val4 = selectedId;
	                Log.e("Debug",Integer.toString(val1));
	                Log.e("Debug",Integer.toString(val2));
	                Log.e("Debug",Integer.toString(val3));
	                Log.e("Debug",Integer.toString(val4));
	                
	                try {
	                    String fpath = "/sdcard/answers.txt";
	                    File file = new File(fpath);
	                    // If file does not exists, then create it
	                    
                        file.createNewFile();
	                    
	                    FileWriter fw = new FileWriter(file.getAbsoluteFile());
	                    BufferedWriter bw = new BufferedWriter(fw);
	                    val1 = val1 + 1;
	                    val2 = val2 + 1;
	                    val3 = val3 + 1;
	                    val4 = val4 + 1;

	                    bw.write(Integer.toString(val1));
	                    bw.write(Integer.toString(val2));
	                    bw.write(Integer.toString(val3));
	                    bw.write(Integer.toString(val4));
	                    bw.close();
	                    Log.d("Debug","Success");
	                    
	                  } catch (IOException e) {
	                    e.printStackTrace();
	                    
	                  }
                    
	                
					Intent intent = new Intent(context, question1.class);
					
	                startActivity(intent);   
				

			}
	 
		});
	 
	  }

	
}
