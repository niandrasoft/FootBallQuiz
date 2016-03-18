package com.niandrasoft.footballquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NewGameActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_game);
    }



    public void onClickBasic(View view){
        startActivity(new Intent(NewGameActivity.this, BasicActivity.class));
    }

    public void onClickMedium(View view){
        startActivity(new Intent(NewGameActivity.this, MediumActivity.class));
    }

    public void onClickAdvanced(View view){
        startActivity(new Intent(NewGameActivity.this, AdvancedActivity.class));
    }

    public void onClickBack(View view) {
        Intent in = new Intent(this, MainMenuActivity.class);
        startActivity(in);
    }


}
