package whitaker.anthony.whitradio.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import whitaker.anthony.whitradio.R;
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
        View stationCard = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_station, parent, false);
        return new StationViewHolder(stationCard, parent.getContext());
    }

    @Override
    public void onBindViewHolder(StationViewHolder holder, int position) {
        Station station = stations.get(position);
        holder.updateUI(station);
    }

    @Override
    public int getItemCount() {
        return stations.size();
    }
}
