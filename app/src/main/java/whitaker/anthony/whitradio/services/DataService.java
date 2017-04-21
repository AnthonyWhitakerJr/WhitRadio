package whitaker.anthony.whitradio.services;

import java.util.ArrayList;

import whitaker.anthony.whitradio.R;
import whitaker.anthony.whitradio.model.Station;

/**
 * @author Anthony Whitaker.
 */
public class DataService {
    private static final DataService sharedInstance = new DataService();

    public static DataService getInstance() {
        return sharedInstance;
    }

    private DataService() {
    }

    public ArrayList<Station> getFeaturedStations() {
        ArrayList<Station> list = new ArrayList<>();
        list.add(new Station(R.string.station_travel, R.drawable.flightplanmusic));
        list.add(new Station(R.string.station_bike, R.drawable.bicyclemusic));
        list.add(new Station(R.string.station_kids, R.drawable.kidsmusic));

        return list;
    }

    public ArrayList<Station> getRecentStations() {
        ArrayList<Station> list = new ArrayList<>();
        list.add(new Station(R.string.station_travel, R.drawable.flightplanmusic));
        list.add(new Station(R.string.station_bike, R.drawable.bicyclemusic));
        list.add(new Station(R.string.station_kids, R.drawable.kidsmusic));

        return list;
    }

    public ArrayList<Station> getPartyStations() {
        ArrayList<Station> list = new ArrayList<>();
        list.add(new Station(R.string.station_travel, R.drawable.flightplanmusic));
        list.add(new Station(R.string.station_bike, R.drawable.bicyclemusic));
        list.add(new Station(R.string.station_kids, R.drawable.kidsmusic));

        return list;
    }
}
