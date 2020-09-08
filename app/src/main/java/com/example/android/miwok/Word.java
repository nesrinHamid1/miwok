package com.example.android.miwok;
/**
 * {@link Word} represent
 */
public class Word {
    private String mMiwokWord;
    private String mDefaultWord;

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
}
