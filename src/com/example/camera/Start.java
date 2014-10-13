package com.example.camera;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Start extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_start);
		//button1
		Button btn = (Button)findViewById(R.id.button1);
		btn.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(Start.this, SimpleCameraSumpleActivity.class);
				startActivity(intent);}});
		//button2
		Button btn2 = (Button)findViewById(R.id.button2);
	
		btn2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Start.this, Thumbnail.class);
				startActivity(intent);
				// TODO Auto-generated method stub
				
			}
		});
		
		Button btn3 = (Button)findViewById(R.id.button3);
		
		btn3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Start.this, Imagelist.class);
				startActivity(intent);
				// TODO Auto-generated method stub
				
			}
		});
		
	}
}
