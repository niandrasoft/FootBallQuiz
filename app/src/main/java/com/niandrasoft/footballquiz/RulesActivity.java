package com.niandrasoft.footballquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RulesActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);


    }

    public void onClickBackToHelp(View view) {
        Intent in = new Intent(this, HelpActivity.class);
        startActivity(in);
    }
}
