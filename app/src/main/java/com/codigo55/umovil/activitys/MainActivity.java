package com.codigo55.umovil.activitys;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.codigo55.umovil.R;
import com.codigo55.umovil.activitys.activity_ii;
import com.codigo55.umovil.activitys.activity_is;
import com.codigo55.umovil.activitys.activity_no;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    //MEtodos
    public void next(View view){
        Intent next = new Intent(this, activity_is.class);
        startActivity(next);
    }
    public void next2(View view){
        Intent next2 = new Intent(this, activity_no.class);
        startActivity(next2);
    }
    public void next_ii(View view){
        Intent next_ii = new Intent(this, activity_ii.class);
        startActivity(next_ii);
    }
}