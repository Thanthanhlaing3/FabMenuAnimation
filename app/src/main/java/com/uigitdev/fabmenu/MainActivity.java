package com.uigitdev.fabmenu;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    private MFabButtons mFab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setType();
    }

    private void setType() {
        FloatingActionButton fab_button_1 = findViewById(R.id.fab_button_1);
        FloatingActionButton fab_button_2 = findViewById(R.id.fab_button_2);
        FloatingActionButton fab_button_3 = findViewById(R.id.fab_button_3);
        FloatingActionButton fab_button_4 = findViewById(R.id.fab_button_4);
        mFab = new MFabButtons(MainActivity.this, fab_button_1, fab_button_2, fab_button_3, fab_button_4);
    }
}
