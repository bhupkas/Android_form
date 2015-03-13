package com.example.form;
 
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
 
public class MainActivity extends Activity {
 
  private RadioGroup Button_group1;
  private RadioGroup Button_group2;
  private RadioGroup Button_group3;
  private RadioGroup Button_group4;
  private RadioButton selected1;
  private RadioButton selected2;
  private RadioButton selected3;
  private RadioButton selected4;
  private Button btnDisplay;
 
  @Override
  public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_main);
 
	addListenerOnButton();
 
  }
 
  public void addListenerOnButton() {
 
	Button_group1 = (RadioGroup) findViewById(R.id.group1);
	Button_group2 = (RadioGroup) findViewById(R.id.group2);
	Button_group3 = (RadioGroup) findViewById(R.id.group3);
	Button_group4 = (RadioGroup) findViewById(R.id.group4);
	btnDisplay = (Button) findViewById(R.id.btnDisplay);
 
	btnDisplay.setOnClickListener(new OnClickListener() {
 
		@Override
		public void onClick(View v) {
 
		        // get selected radio button from radioGroup
			int selectedId1 = Button_group1.getCheckedRadioButtonId();
			int selectedId2 = Button_group2.getCheckedRadioButtonId();
			int selectedId3 = Button_group3.getCheckedRadioButtonId();
			int selectedId4 = Button_group4.getCheckedRadioButtonId();
 
			// find the radiobutton by returned id
		        selected1 = (RadioButton) findViewById(selectedId1);
		        selected2 = (RadioButton) findViewById(selectedId2);
		        selected3 = (RadioButton) findViewById(selectedId3);
		        selected4 = (RadioButton) findViewById(selectedId4);
		       
		        final String msg;
		        msg = "";
		        msg.concat((String)selected1.getText());
		        msg.concat(" ");
		        msg.concat((String)selected2.getText());
		        msg.concat(" ");
		        msg.concat((String)selected3.getText());
		        msg.concat(" ");
		        msg.concat((String)selected4.getText());
		        
		        
			Toast.makeText(MainActivity.this,
				selected1.getText(), Toast.LENGTH_SHORT).show();
 
		}
 
	});
 
  }
}