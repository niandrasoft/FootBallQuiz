package com.niandrasoft.footballquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenuActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu_activity);

        //set the BUTTON
        Button btnNewGame = (Button) findViewById(R.id.btnNewGame);
        Button btnSettings = (Button) findViewById(R.id.btnSettings);
        Button btnRatings = (Button) findViewById(R.id.btnRatings);
        Button btnHelp = (Button) findViewById(R.id.btnHelp);
        Button btnExit = (Button) findViewById(R.id.btnExit);
        Button btnMoreApps = (Button) findViewById(R.id.btnMoreApps);
        Button btnBackToHelp = (Button) findViewById(R.id.btnBackToHelp);






    }//end onCreate method

    public void onClickNewGame(View view) {
        Intent i = new Intent(this, NewGameActivity.class);
        startActivity(i);
    }

    public void onClickSettings(View view) {
        Intent i = new Intent(this, SettingsActivity.class);
        startActivity(i);
    }

    public void onClickRatings(View view){
        Intent i = new Intent (this, RatingsActivity.class);
        startActivity(i);
    }

    public void onClickHelp(View view) {
        Intent i = new Intent (this, HelpActivity.class);
        startActivity(i);
    }

    public void onClickExit(View view) {
        finishAffinity();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Intent svc=new Intent(this, SoundService.class);
        stopService(svc);
    }
}
