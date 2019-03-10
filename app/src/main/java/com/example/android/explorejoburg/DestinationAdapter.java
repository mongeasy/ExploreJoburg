package com.example.android.explorejoburg;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link DestinationAdapter}
 * responsible for generating corresponding resources for each item layout
 */
public class DestinationAdapter extends ArrayAdapter<Destination> {

    private Context mContext;
    private ArrayList<Destination> mDestinationsList;


    /**
     * Constructor to match superclass {@link ArrayAdapter}
     */
    public DestinationAdapter(@NonNull Context context, @NonNull ArrayList<Destination> destinations) {
        super(context, 0, destinations);
        mContext = context;
        mDestinationsList = destinations;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_items, parent, false);
        }

        // create Destination class object and get its position
        Destination currentDestination = mDestinationsList.get(position);

        // find the view on the list
        TextView nameOfPlace = listItemView.findViewById(R.id.name_of_place);
        // get the name of the place
        nameOfPlace.setText(currentDestination.getmPlace());

        // find the view on the list
        TextView description = listItemView.findViewById(R.id.description);
        // get the description of the place
        description.setText(currentDestination.getmDescription());

        // find the view on the list
        ImageView imageOfPlace = listItemView.findViewById(R.id.image_of_place);
        // get the image of the place
        imageOfPlace.setImageResource(currentDestination.getmImageResourceId());

        return listItemView;
    }
}
