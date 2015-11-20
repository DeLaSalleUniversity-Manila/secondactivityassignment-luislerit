package com.example.luis.weekday_jamalu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.content.Intent;
import android.view.MenuItem;
import android.widget.TextView;

public class secondactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);

        handleIntent();
    }


    private void handleIntent(){
        Intent i = getIntent();
        String day_out = i.getStringExtra("message");
        TextView tv_out = (TextView) findViewById(R.id.textViewResult);
        tv_out.setText(day_out);
    }
}