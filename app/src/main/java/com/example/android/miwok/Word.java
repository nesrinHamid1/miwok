package com.example.android.miwok;
/**
 * {@link Word} represent
 */
public class Word {
    private String mMiwokWord;
    private String mDefaultWord;
    private int mid;

    public Word (String miwokWord, String defaultWord, int id){
        mMiwokWord = miwokWord;
        mDefaultWord = defaultWord;
        mid = id;
    }

    public Word (String miwokWord, String defaultWord){
        mMiwokWord = miwokWord;
        mDefaultWord = defaultWord;
    }

    public String getMiwokWord(){
        return mMiwokWord;
    }

    public String getDefaultWord(){
        return mDefaultWord;
    }

    public int getId(){
        return mid;
    }
}
