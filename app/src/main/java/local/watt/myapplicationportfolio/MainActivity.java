package local.watt.myapplicationportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private Button mSpotifyStreamerButton;
    private Button mScoresAppButton;
    private Button mLibraryAppButton;
    private Button mBuildItBiggerButton;
    private Button mXyzReaderButton;
    private Button mMyOwnAppButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSpotifyStreamerButton = (Button) findViewById(R.id.spotifyStreamerButton);
        mScoresAppButton = (Button) findViewById(R.id.superDuoButton);
        mLibraryAppButton = (Button) findViewById(R.id.libraryAppButton);
        mBuildItBiggerButton = (Button) findViewById(R.id.buildItBiggerButton);
        mXyzReaderButton = (Button) findViewById(R.id.xyzReaderButton);
        mMyOwnAppButton = (Button) findViewById(R.id.myOwnAppButton);

        mSpotifyStreamerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button launches the spotify streamer app", Toast.LENGTH_LONG).show();
            }
        });

        mScoresAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button launches the  scores app", Toast.LENGTH_LONG).show();
            }
        });

        mLibraryAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button launches the library app", Toast.LENGTH_LONG).show();
            }
        });

        mBuildItBiggerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button launches the build it bigger app", Toast.LENGTH_LONG).show();
            }
        });

        mXyzReaderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button launches the xyz reader app", Toast.LENGTH_LONG).show();
            }
        });

        mMyOwnAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button launches my capstone app", Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
