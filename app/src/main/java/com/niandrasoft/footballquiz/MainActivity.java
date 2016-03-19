package com.niandrasoft.footballquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends Activity {
    Button clickButton;

    String[] facts = {"fact1", "fact2", "fact3", "fact4", "fact5", "fact6", "fact7", "fact8", "fact9",};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clickButton=(Button)findViewById(R.id.button);

        Intent svc = new Intent(MainActivity.this, SoundService.class);
        startService(svc);

        TextView t = (TextView) findViewById(R.id.factText);
        t.setText(randomArray().toString());

    }


    // method for displaying a random fact in main activity
    public String randomArray(){
        int idx = new Random().nextInt(facts.length - 1);
        String random = (facts[idx]);
        return random;
    }


    public void clickMe(View view){
        startActivity(new Intent(MainActivity.this, MainMenuActivity.class));
    }



    @Override
    protected void onDestroy() {
        super.onDestroy();
        Intent svc = new Intent(MainActivity.this, SoundService.class);
        stopService(svc);
    }
}
