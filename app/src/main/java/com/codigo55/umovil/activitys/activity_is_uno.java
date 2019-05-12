package com.codigo55.umovil.activitys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.codigo55.umovil.R;

public class activity_is_uno extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_is_uno);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        showToolbar(true);

    }
    public void showToolbar(boolean upButton) {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }
    //MEtodos
    public void next_ci(View view){
        Intent next_ci = new Intent(this,activity_ci.class);
        startActivity(next_ci);
    }
    public void next_pb(View view){
        Intent next_pb = new Intent(this,activity_pb.class);
        startActivity(next_pb);
    }

    public void next_mead(View view){
        Intent next_mead = new Intent(this,activity_mead.class);
        startActivity(next_mead);
    }
    public void next_fm(View view){
        Intent next_fm = new Intent(this,activity_fm.class);
        startActivity(next_fm);
    }
    public void next_iis(View view){
        Intent next_iis = new Intent(this,activity_iis.class);
        startActivity(next_iis);
    }
    public void next_cd(View view){
        Intent next_cd = new Intent(this,activity_cd.class);
        startActivity(next_cd);
    }

}
