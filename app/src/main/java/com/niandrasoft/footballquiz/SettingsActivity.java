package com.niandrasoft.footballquiz;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class SettingsActivity extends Activity implements View.OnClickListener{

    //private Boolean b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);


        CheckBox box = (CheckBox) findViewById(R.id.check1);

        if(isServiceRunning()){
            box.setChecked(true);
        }else{
            box.setChecked(false);
        }


    }//end of onCreate method


    private boolean isServiceRunning() {
        ActivityManager manager = (ActivityManager)getSystemService(ACTIVITY_SERVICE);
        for (ActivityManager.RunningServiceInfo service : manager.getRunningServices(Integer.MAX_VALUE)) {
            if ("com.niandrasoft.footballquiz.SoundService".equals(service.service.getClassName())) {
                return true;
            }
        }
        return false;
    }

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

    public void onOffMusic(View view) {
        Boolean b = ((CheckBox) findViewById(R.id.check1)).isChecked();
        if(b == true){
            Intent svc = new Intent(SettingsActivity.this, SoundService.class);
            startService(svc);
        }else{
            Intent svc = new Intent(SettingsActivity.this, SoundService.class);
            stopService(svc);
        }
    }//end of onOffMusic method


    @Override
    protected void onPause() {
        super.onPause();

        Boolean check = ((CheckBox) findViewById(R.id.check1)).isChecked();

        SharedPreferences pref = getSharedPreferences("SettingsActivity", MODE_PRIVATE);
        SharedPreferences.Editor edit = pref.edit();
        edit.putBoolean("checkbox1", check);
        edit.commit();
    }//end of onPause


    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences pref = getSharedPreferences("SettingsActivity", MODE_PRIVATE);
        Boolean bb = pref.getBoolean("checkbox1", false);
        if (bb) {
            if(bb!=false){
                CheckBox box = (CheckBox) findViewById(R.id.check1);
                box.setChecked(true);
            }else{
                CheckBox box = (CheckBox) findViewById(R.id.check1);
                box.setChecked(false);
            }
        }
    }//end of onResume




}//end of class
