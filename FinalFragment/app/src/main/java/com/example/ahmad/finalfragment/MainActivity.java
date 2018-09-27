package com.example.ahmad.finalfragment;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BodyPartsFragments bodyParts;
        FragmentManager fm = getSupportFragmentManager();

        //untuk mengambil data dari body fragment dengan getBodys
        bodyParts = new BodyPartsFragments();
        bodyParts.setImgId(BodyImageAssets.getBodys());
        bodyParts.setIndexImg(0);
        //untuk menambilkan fragment ke activityMain.xml
        fm.beginTransaction().add(R.id.body_Container, bodyParts).commit();

        //untuk mengambil data dari body fragment dengan getLegss
        bodyParts = new BodyPartsFragments();
        bodyParts.setImgId(BodyImageAssets.getLegss());
        bodyParts.setIndexImg(0);
        //untuk menambilkan fragment ke activityMain.xml
        fm.beginTransaction().add(R.id.leg_Container, bodyParts).commit();
    }
}
