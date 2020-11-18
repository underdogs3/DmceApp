package com.example.dmceapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.homeAppBar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu) {
     super.onCreateOptionsMenu(menu);
     getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }
}