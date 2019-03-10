package com.example.android.explorejoburg;

public class Destination {

    // store the name of the place
    private String mPlace;
    // store the description of the place
    private String mDescription;
    // store the image of the place
    private int mImageResourceId;

    /**
     * default constructor
     */
    public Destination() {
    }

    /**
     * Constructor to initialize 3 object instances
     *
     * @param place           name of the place
     * @param description     a summary of the place
     * @param imageResourceId image of the place
     */
    public Destination(String place, String description, int imageResourceId) {
        mPlace = place;
        mDescription = description;
        mImageResourceId = imageResourceId;
    }

    /*
     * Method to get the name of the place
     */
    public String getmPlace() {
        return mPlace;
    }

    /*
     * Method to get the description of the place
     */
    public String getmDescription() {
        return mDescription;
    }

    /*
     * Method to get the corresponding image of the place
     */
    public int getmImageResourceId() {
        return mImageResourceId;
    }
}
