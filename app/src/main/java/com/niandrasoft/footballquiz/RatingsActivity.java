package com.niandrasoft.footballquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RatingsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ratings);
    }

    public void onClickBack(View view) {
        Intent in = new Intent(this, MainMenuActivity.class);
        startActivity(in);
    }
}
