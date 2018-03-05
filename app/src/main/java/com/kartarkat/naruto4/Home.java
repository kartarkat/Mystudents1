package com.kartarkat.naruto4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void morn(View v) {
        Intent intent = new Intent(this, Mrng.class);
        startActivity(intent);}


    public void team(View v) {
        Intent intent = new Intent(this, Team.class);
        startActivity(intent);}



    public void after(View v) {
        Intent intent = new Intent(this, Aft.class);
        startActivity(intent);}


    public void output(View v) {
        Intent intent = new Intent(this, Out.class);
        startActivity(intent);}

}
