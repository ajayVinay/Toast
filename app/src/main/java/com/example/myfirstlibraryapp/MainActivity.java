package com.example.myfirstlibraryapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.rssfeedlibrary.ToasterMessage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ToasterMessage t = new ToasterMessage();
        t.s(getApplicationContext(),"hello dunia walo ");



    }
}
