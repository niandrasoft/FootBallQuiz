package com.niandrasoft.footballquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {
    Button clickButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clickButton=(Button)findViewById(R.id.button);

        Intent svc = new Intent(this, SoundService.class);
        startService(svc);
    }

    public void clickMe(View view){
        startActivity(new Intent(MainActivity.this, MainMenuActivity.class));
    }


    

}
