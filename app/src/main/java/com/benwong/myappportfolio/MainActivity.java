package com.benwong.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button button, button1, button2, button3, button4, button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button);
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);

        button.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                Toast.makeText(getApplicationContext(), "This button will launch my SPOTIFY STREAMERS APP", Toast.LENGTH_LONG).show();
                break;
            case  R.id.button1:
                Toast.makeText(getApplicationContext(), "This button will launch my FOOTBALL SCORES APP", Toast.LENGTH_LONG).show();
                break;
            case R.id.button2:
                Toast.makeText(getApplicationContext(), "This button will launch my LIBRARY APP", Toast.LENGTH_LONG).show();
                break;
            case R.id.button3:
                Toast.makeText(getApplicationContext(), "This button will launch my BUILD IT BIGGER APP", Toast.LENGTH_LONG).show();
                break;
            case R.id.button4:
                Toast.makeText(getApplicationContext(), "This button will launch my XYZ READER APP", Toast.LENGTH_LONG).show();
                break;
            case R.id.button5:
                Toast.makeText(getApplicationContext(), "This button will launch my CAPSTONE: MY OWN APP", Toast.LENGTH_LONG).show();
                break;

        }
    }
}
