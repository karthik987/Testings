package com.example.testingapp;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;


public class Main extends Activity {
	Context context=Main.this;
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	LinearLayout layout=new LinearLayout(context);
	layout.setGravity(Gravity.CENTER);
	layout.setOrientation(LinearLayout.VERTICAL);
	TextView text=new TextView(context);
	text.setText("Testing CI in Jenkines");
	text.setTextColor(Color.RED);
	layout.addView(text);
	TextView text1=new TextView(context);
	text1.setText("Developer Karthik");
	text1.setTextColor(Color.GREEN);
	layout.addView(text1);
	setContentView(layout);
}
}
