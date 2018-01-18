package com.example.android.quakereport;

/**
 * Created by SMDEEPAK on 10-01-2018.
 */

public class Word {

    private String nPlace, nUrl;
    private double nMag;
    private long nDateTime;

    public Word(double mag, String place, long dateTime, String url){

        nMag = mag;
        nPlace = place;
        nDateTime = dateTime;
        nUrl = url;

    }

    public double getMag(){
        return nMag;
    }

    public String getPlace(){
        return nPlace;
    }

    public long getTimeInMilliseconds(){
        return nDateTime;
    }

    public String getUrl(){ return  nUrl; }

}
