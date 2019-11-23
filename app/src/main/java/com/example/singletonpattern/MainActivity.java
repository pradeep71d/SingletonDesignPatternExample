package com.example.singletonpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //since getInstance() is static hence it is called by Class Name.
        SingleObject ref=SingleObject.getInstance();//
        ref.show();
    }
}
