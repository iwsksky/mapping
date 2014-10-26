package com.example.camera;

import android.support.v7.app.ActionBarActivity;
import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.app.ActionBar.Tab;
import android.app.ActionBar.TabListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Start extends ActionBarActivity{
	public String str;

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
				Intent intent = new Intent(Start.this, GV.class);
				startActivity(intent);
				// TODO Auto-generated method stub
				
			}
		});
		Imagelist il= new Imagelist();
		TextView tv = (TextView)findViewById(R.id.textView2);
		str=String.valueOf(Imagelist.plus(15, 3));
		tv.setText(str);
		
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
	public int plus(int a,int b){
		return a+b;
	}
}
