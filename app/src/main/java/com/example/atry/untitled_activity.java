

package com.example.atry;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

public class untitled_activity extends Activity {


private Button button;
	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.untitled);


		button = (Button) findViewById(R.id.getstarted);


		button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				openhomescreen_activity();
			}


		});
		
		

	
	}
	public void openhomescreen_activity(){
		Intent intent = new Intent(this, Homescreen.class);
		startActivity(intent);
	}
}
	
	