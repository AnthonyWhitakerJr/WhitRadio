package whitaker.anthony.whitradio.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;

import whitaker.anthony.whitradio.holder.StationViewHolder;
import whitaker.anthony.whitradio.model.Station;

/**
 * @author Anthony Whitaker.
 */
public class StationAdapter extends RecyclerView.Adapter<StationViewHolder> {

    private ArrayList<Station> stations;

    public StationAdapter(ArrayList<Station> stations) {
        this.stations = stations;
    }

    @Override
    public StationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(StationViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
