package com.niandrasoft.footballquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HelpActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
    }

    public void onClickAboutGame(View view){
        Intent i = new Intent(this, AboutGameActivity.class);
        startActivity(i);
    }


    public void onClickRules(View view){
        Intent i = new Intent(this, RulesActivity.class);
        startActivity(i);
    }

    public void onClickBack(View view) {
        Intent in = new Intent(this, MainMenuActivity.class);
        startActivity(in);
    }
}
