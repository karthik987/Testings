package com.example.testingapp;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;


public class Main extends Activity {
	Context context=Main.this;
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	
	TextView text=new TextView(context);
	text.setText("Testing CI in Jenkines");
	text.setTextColor(Color.RED);
	setContentView(text);
}
}
