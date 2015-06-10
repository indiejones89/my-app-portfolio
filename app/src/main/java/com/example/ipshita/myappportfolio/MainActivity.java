package com.example.ipshita.myappportfolio;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


/**
 * The MainActivity is the launcher activity which displays six buttons.
 * On clicking each button a specific Toast message is displayed.
 */
public class MainActivity extends Activity {

    // Variables used for the Toast Message

    String text = "This button will launch my ";
    int duration = Toast.LENGTH_SHORT;
    Toast toast;
    String appName = "";

    // Variables used in Log messages inside showMessage()
    private static final String SHOW_MESSAGE_TAG = "showMessage()";
    String logMessage = "Button clicked : ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    /**
     * show Toast message when user clicks on the view
     *
     * @param view
     */
    public void displayMessage(View view) {


        int viewId = view.getId();
        if (viewId == R.id.media_streamer_button) {
            appName = "Spotify Streamer app!";
            toast = Toast.makeText(this, text + appName, duration);
            toast.show();
            Log.d(SHOW_MESSAGE_TAG, logMessage + appName);
        } else if (viewId == R.id.scores_app_button) {
            appName = "Scores app!";
            toast = Toast.makeText(this, text + appName, duration);
            toast.show();
            Log.d(SHOW_MESSAGE_TAG, logMessage + appName);
        } else if (viewId == R.id.library_app_button) {
            appName = "Library app!";
            toast = Toast.makeText(this, text + appName, duration);
            toast.show();
            Log.d(SHOW_MESSAGE_TAG, logMessage + appName);
        } else if (viewId == R.id.build_it_bigger_button) {
            appName = "Build it bigger app!";
            toast = Toast.makeText(this, text + appName, duration);
            toast.show();
            Log.d(SHOW_MESSAGE_TAG, logMessage + appName);
        } else if (viewId == R.id.bacon_reader_button) {
            appName = "Bacon Reader app!";
            toast = Toast.makeText(this, text + appName, duration);
            toast.show();
            Log.d(SHOW_MESSAGE_TAG, logMessage + appName);
        } else if (viewId == R.id.capstone_button) {
            appName = "Capstone app!";
            toast = Toast.makeText(this, text + appName, duration);
            toast.show();
            Log.d(SHOW_MESSAGE_TAG, logMessage + appName);
        }

    }
}
