package com.example.android.miwok;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    // created a consteror for the word adapter class
    //were i passed the context of the applecation
    // and the arraylist and the type for that list is a custom class called word
    private int mColor;

    public WordAdapter (Activity context, ArrayList<Word> wordList, int color){
        // i passed a zero in resource because this is a custom adapter for two TextViews the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0
        super(context,0,wordList);
        mColor = color;
    }

    @Override

    public View getView(int position,View convertView,ViewGroup parent) {
        // i created a view called listItemView
        View listItemView = convertView;

        if (listItemView == null){
            //  Check if the existing view is being reused, otherwise inflate the view
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.itme_list, parent, false);

        }

        //created a word opject to assign the words to the right view
        final Word w = getItem(position);

        //created A textview to pass the miwok Word to the top view called item view in item list layout
        TextView miwokWordView = (TextView) listItemView.findViewById(R.id.item);

        //here i am assiging the text for the view from the word class by using the getter for the object i am using
        miwokWordView.setText(w.getMiwokWord());

        //created A textview to pass the default Word to the top view called item view in item list layout
        TextView defaultWordView = (TextView) listItemView.findViewById(R.id.sub_item);

        //here i am assiging the text for the view from the word class by using the getter for the object i am using
        defaultWordView.setText(w.getDefaultWord());

        ImageView itemImage = (ImageView) listItemView.findViewById(R.id.item_image);
        itemImage.setImageResource(w.getId());
        // Return the whole list item layout (containing 2 TextViews)
        // so that it can be shown in the ListView
        View listView = listItemView.findViewById(R.id.textContnor);
        int color = ContextCompat.getColor(getContext(),mColor);
        listView.setBackgroundColor(color);

        final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(),w.getAudio());
        listItemView.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(),w.getAudio());
                mediaPlayer.start();
            }
        });

        return listItemView;
    }


}
