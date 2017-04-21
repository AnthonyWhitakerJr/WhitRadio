package whitaker.anthony.whitradio.holder;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import whitaker.anthony.whitradio.R;
import whitaker.anthony.whitradio.model.Station;

/**
 * @author Anthony Whitaker.
 */
public class StationViewHolder extends RecyclerView.ViewHolder {

    private ImageView stationImageView;
    private TextView titleTextView;
    private Context context;

    public StationViewHolder(View itemView, @NonNull Context context) {
        super(itemView);

        this.context = context;

        this.stationImageView = (ImageView)itemView.findViewById(R.id.stationImage);
        this.titleTextView = (TextView)itemView.findViewById(R.id.stationText);
    }

    public void updateUI(@NonNull Station station) {
        stationImageView.setImageResource(station.getImageId());
        titleTextView.setText(context.getString(station.getTitleId()));
    }
}
