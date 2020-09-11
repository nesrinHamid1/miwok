package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class Family_members extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list_layout);
        setContentView(R.layout.word_list_layout);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new FamilyFragment())
                .commit();

    }

}