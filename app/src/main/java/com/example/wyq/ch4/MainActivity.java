package com.example.wyq.ch4;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //加载Fragment
        getFragmentManager().beginTransaction()
                .replace(android.R.id.content, new PreFragment())
                .commit();
    }
}
