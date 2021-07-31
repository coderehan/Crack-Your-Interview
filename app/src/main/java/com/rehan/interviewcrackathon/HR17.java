package com.rehan.interviewcrackathon;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class HR17 extends AppCompatActivity {
ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h_r17);

        actionBar=getSupportActionBar();
        actionBar.setTitle("Best Answer");
    }
}
