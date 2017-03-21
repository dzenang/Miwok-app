package com.example.android.miwok;

/**
 * Created by dzenang on 29.1.2017.
 *
 * {@link Word} Represents a vocabulary word that user wants to learn.
 * Contains a default translation android a Miwok translation for that word.
 */

public class Word {

    /*state variables*/
    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mAudioResourceId;

    /*constructors*/
    public Word(String miwokTranslation, String defaultTranslation, int audioResourceId){
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mAudioResourceId = audioResourceId;
    }

    public Word(String miwokTranslation, String defaultTranslation, int audioResourceId, int imageResourceId){
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mAudioResourceId = audioResourceId;
        mImageResourceId = imageResourceId;
    }

    /*getters*/
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getImageResourceId() {return mImageResourceId;}

    public int getAudioResourceId() {return mAudioResourceId;}

    /* Returns whether or not there is an image for this word. */
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
