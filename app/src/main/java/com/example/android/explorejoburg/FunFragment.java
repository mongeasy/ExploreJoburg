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
public class FunFragment extends Fragment {

    public FunFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.dest_list, container, false);

        // Custom ArrayList to store History destination sites
        final ArrayList<Destination> destinationsList = new ArrayList<>();
        destinationsList.add(new Destination("Gold Reef City", "More than 30 roller"
                + " coasters & thrill rides an interactive history of gold mining & a 4D theater."
                , R.drawable.gold_reef_city));
        destinationsList.add(new Destination("Johannesburg Zoo",
                "55-hectare zoo housing many rare African species & a successful white lion"
                        + " breeding program.", R.drawable.johannesburg_zoo));
        destinationsList.add(new Destination("Braamfontein", "Braamfontein is a central"
                + " suburb of Johannesburg, in South Africa, seat of the Constitutional Court of" +
                " South Africa and some of South Africa's major corporations such as Liberty Holdings"
                + " Limited", R.drawable.braamfontein));
        destinationsList.add(new Destination("Johannesburg Botanical Gardens", "This " +
                "125-hectare park features various gardens, plus picnicking, a fountain & a restaurant."
                , R.drawable.joburg_botanical_gardens));
        destinationsList.add(new Destination("Sci-Bono Discovery Centre", "Children's" +
                " interactive museum offering exhibits & workshops in science, technology & math."
                , R.drawable.scibono_discovery_centre));

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
