package com.example.android.explorejoburg;


import android.os.Bundle;
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
public class FoodFragment extends Fragment {


    public FoodFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate view
        View rootView = inflater.inflate(R.layout.dest_list, container, false);

        // Custom ArrayList to store History destination sites
        final ArrayList<Destination> destinationsList = new ArrayList<>();

        // Custom ArrayList to store History destination sites
        destinationsList.add(new Destination("Neighbourgoods Market",
                "Bustling outdoor market, open Saturdays, with a wide range of international"
                        + " eats, cocktails & more.", R.drawable.neighbourgoods_market));
        destinationsList.add(new Destination("Vilakazi Street", "Both Nelson Mandela " +
                "and Archbishop Emeritus Desmond Tutu lived here – how many places can claim that two" +
                " Nobel Prize winners lived in the same street. In fact, Tutu, as he is more fondly " +
                "known, still lives here with his wife Leah, and when he's in town he is said to " +
                "stroll the streets.", R.drawable.vilakazi_street));
        destinationsList.add(new Destination("Nelson Mandela Square", "Nelson Mandela" +
                " Square is a public square and shopping centre in Sandton, Johannesburg, South Africa." +
                " The square was formerly known as Sandton Square and was ", R.drawable.nelson_mandela_square));
        destinationsList.add(new Destination("Montecasino", "Leisure complex designed" +
                " like an Italian village, housing a casino, 2 theaters, cinemas and a mall."
                , R.drawable.montecasino));

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
