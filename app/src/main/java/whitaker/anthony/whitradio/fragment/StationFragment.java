package whitaker.anthony.whitradio.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import whitaker.anthony.whitradio.R;
import whitaker.anthony.whitradio.adapter.StationAdapter;
import whitaker.anthony.whitradio.services.DataService;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link StationFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class StationFragment extends Fragment {

    private static final String ARG_STATION_TYPE = "station_type";

    // TODO: Rename and change types of parameters
    private StationType stationType;

    enum StationType {
        FEATURED, RECENT, PARTY
    }


    public StationFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param stationType The radio station type.
     * @return A new instance of fragment StationFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static StationFragment newInstance(StationType stationType) {
        StationFragment fragment = new StationFragment();
        Bundle args = new Bundle();
        args.putSerializable(ARG_STATION_TYPE, stationType);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            stationType = (StationType)getArguments().getSerializable(ARG_STATION_TYPE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_station, container, false);

        RecyclerView recyclerView = (RecyclerView)view.findViewById(R.id.station_recycler);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);

        final StationAdapter adapter;
        switch (stationType) {
            case FEATURED:
                adapter = new StationAdapter(DataService.getInstance().getFeaturedStations());
                break;
            case RECENT:
                adapter = new StationAdapter(DataService.getInstance().getRecentStations());
                break;
            case PARTY:
                adapter = new StationAdapter(DataService.getInstance().getPartyStations());
                break;
            default:
                throw new IllegalStateException("Unrecognized station type");
        }

        recyclerView.setAdapter(adapter);

        return view;
    }

}
