package com.gb_androidteam.habits.viewandcontroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gb_androidteam.habits.R;

// Скорее всего понадобится для показа оповещения, но не уверен

public class AlarmedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alerted);
    }
}
