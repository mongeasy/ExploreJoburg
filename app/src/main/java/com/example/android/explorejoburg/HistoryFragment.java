package com.example.android.explorejoburg;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Objects;

/**
 * A simple {@link Fragment} subclass.
 */
public class HistoryFragment extends Fragment {

    public HistoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.dest_list, container, false);

        // Custom ArrayList to store History destination sites
        final ArrayList<Destination> destinationsList = new ArrayList<>();
        destinationsList.add(new Destination("Apartheid Museum",
                "Museum chronicling the story of 20th-century South Africa &" +
                        " the now-defunct apartheid system", R.drawable.apartheid_museum));
        destinationsList.add(new Destination("Constitution Hill", "Infamous century-old"
                + " prison, now a center with the High Court, tours & exhibitions on local history."
                , R.drawable.constitution_hill));
        destinationsList.add(new Destination("Hector Pieterson Museum", "Museum " +
                "chronicling the 1976 Soweto student uprising & named for its first victim, a " +
                "12-year-old boy.", R.drawable.hector_pieterson_museum));
        destinationsList.add(new Destination("Mandela House", "The Nelson Mandela " +
                "National Museum, commonly referred to as Mandela House, is the house on Vilakazi " +
                "Street, Orlando West, Soweto, South Africa, where Nelson Mandela lived from 1946 to" +
                " 1962.", R.drawable.mandela_house));

        // Array adapter inflating custom list
        DestinationAdapter adapter = new DestinationAdapter(Objects.requireNonNull(getActivity())
                , destinationsList);

        // Find ListView that is attached to the rootView
        ListView listView = rootView.findViewById(R.id.destinations_list);

        // Attach adapter onto ListView object
        listView.setAdapter(adapter);

        // return the view
        return rootView;
    }
}
