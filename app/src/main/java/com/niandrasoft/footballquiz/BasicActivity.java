package com.niandrasoft.footballquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BasicActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);
    }

    public void startGame(View view){
        startActivity(new Intent(BasicActivity.this, GamePlayActivity.class));
    }

    public void backToNewGame(View view){
        startActivity(new Intent(BasicActivity.this, NewGameActivity.class));
    }
}
