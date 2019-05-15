package com.codigo55.umovil.activitys;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.codigo55.umovil.R;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private NavigationView navigationView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setToolbar();

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout1);
        navigationView = (NavigationView) findViewById(R.id.navview);

        //Logica de las opciones del menu

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()) {

                  case R.id.menu_op1:
                      Intent i1 =new Intent(MainActivity.this,Activity_op1.class);
                      startActivity(i1);
                      break;
                      case R.id.menu_op2:
                          Intent i2 =new Intent(MainActivity.this,Activity_op2.class);
                          startActivity(i2);
                      break;
                      case R.id.menu_op3:
                          Intent i3 =new Intent(MainActivity.this,Activity_op3.class);
                          startActivity(i3);
                      break;

              }

               return  true;
            }
        });


    }

    //Metodo Toolbar

    private void  setToolbar(){
        Toolbar toolbar =(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_menu);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    //fin metodo Toolbar

    // Metodo Navigation drawer
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case android.R.id.home:
                //abrir el menu lateral
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);

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