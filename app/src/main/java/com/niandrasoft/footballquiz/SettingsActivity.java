package com.niandrasoft.footballquiz;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class SettingsActivity extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

    }//end of onCreate method

    @Override
    public void onClick(View v) {
    }


    public void onClickBack(View view) {
        Intent in = new Intent(this, MainMenuActivity.class);
        startActivity(in);
    }

    public void onClickMoreApps(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/search?q=quiz&c=apps&docType=1&sp=CAFiBgoEcXVpenoFGADAAQKKAQIIAQ%3D%3D:S:ANO1ljLzOyY"));
        startActivity(i);

    }
}
