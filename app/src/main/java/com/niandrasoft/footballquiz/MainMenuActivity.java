package com.niandrasoft.footballquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainMenuActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu_activity);
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
