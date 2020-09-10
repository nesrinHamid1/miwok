package com.example.android.miwok;
/**
 * {@link Word} represent
 */
public class Word {
    private String mMiwokWord;
    private String mDefaultWord;
    private int mid;
    private int mAudio;

    public Word (String miwokWord, String defaultWord, int id, int audio){
        mMiwokWord = miwokWord;
        mDefaultWord = defaultWord;
        mid = id;
        mAudio = audio;
    }

    public Word (String miwokWord, String defaultWord, int audio){
        mMiwokWord = miwokWord;
        mDefaultWord = defaultWord;
        mAudio = audio;
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

    public int getAudio(){
        return mAudio;
    }
}
