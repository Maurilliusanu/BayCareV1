package com.example.nadus.baycare;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    String cur="patient";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //final ImageView org = (ImageView) findViewById(R.id.org);
        final ImageView patient = (ImageView) findViewById(R.id.patient);
        Button next = (Button) findViewById(R.id.next);

        getSupportActionBar().setTitle("Who are you?");


    }
}
