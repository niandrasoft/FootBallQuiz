package com.niandrasoft.footballquiz;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
    Button clickButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clickButton=(Button)findViewById(R.id.button);
    }

    public void clickMe(View view){
        Toast.makeText(this, "Best Game!",Toast.LENGTH_LONG).show();
    }


}
