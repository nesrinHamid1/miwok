package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list_layout);

        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("lutti", "one"));
        words.add(new Word("lutti", "one"));
        words.add(new Word("lutti", "one"));
        words.add(new Word("lutti", "one"));
        words.add(new Word("lutti", "one"));
        words.add(new Word("lutti", "one"));
        words.add(new Word("lutti", "one"));
        words.add(new Word("lutti", "one"));
        words.add(new Word("lutti", "one"));
        words.add(new Word("lutti", "one"));


        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}