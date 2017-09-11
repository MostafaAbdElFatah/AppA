package com.mostafaabdel_fatah.appa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startActivity1_btnClicked(View view) {
        Intent intent = new Intent(MainActivity.this,ActivityOne.class);
        startActivity(intent);
    }

    public void startActivity2_btnClicked(View view) {
        Intent intent = new Intent(MainActivity.this,ActivityTwo.class);
        startActivity(intent);
    }

}
