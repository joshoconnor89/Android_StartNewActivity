package com.example.joshuaoconnor.startnewactivity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //this function will be called when you click on the button
    //This OnClick option has been set in the activity_main.xlm file
    public void newActivityOnClick(View V){
        // Create an Intent, which will be use for TestActivity and Start the Activity
        //Below //TestActivity.Class is the activity Class, which we will start from here.
        Intent intent=new Intent(getApplicationContext(),TestActivity.class);
        startActivity(intent);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.test, menu);
        return true;
    }
}
