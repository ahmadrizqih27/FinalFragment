package com.example.ahmad.finalfragment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    //intent pindah ke mainActivity
    public void Masuk(View view) {
        Intent intent = new Intent(Home.this, MainActivity.class);
        startActivity(intent);
    }
}
