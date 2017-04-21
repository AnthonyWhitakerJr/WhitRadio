package whitaker.anthony.whitradio.activity;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import whitaker.anthony.whitradio.R;
import whitaker.anthony.whitradio.fragment.DetailFragment;
import whitaker.anthony.whitradio.fragment.MainFragment;
import whitaker.anthony.whitradio.model.Station;

public class MainActivity extends AppCompatActivity {

    private static MainActivity mainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainActivity = this;

        FragmentManager fragmentManager = getSupportFragmentManager();
        MainFragment mainFragment = (MainFragment)fragmentManager.findFragmentById(R.id.container_main);

        if(mainFragment == null) {
            mainFragment = MainFragment.newInstance(null, null);
            fragmentManager.beginTransaction().add(R.id.container_main, mainFragment).commit();
        }
    }

    public void loadDetailsScreen(Station selectedStation) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container_main, new DetailFragment()).addToBackStack(null).commit();
    }

    public static MainActivity getMainActivity() {
        return mainActivity;
    }
}
