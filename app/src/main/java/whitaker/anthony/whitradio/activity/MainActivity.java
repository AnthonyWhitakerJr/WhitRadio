package whitaker.anthony.whitradio.activity;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import whitaker.anthony.whitradio.R;
import whitaker.anthony.whitradio.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        MainFragment mainFragment = (MainFragment)fragmentManager.findFragmentById(R.id.container_main);

        if(mainFragment == null) {
            mainFragment = MainFragment.newInstance(null, null);
            fragmentManager.beginTransaction().add(R.id.container_main, mainFragment).commit();
        }
    }
}
