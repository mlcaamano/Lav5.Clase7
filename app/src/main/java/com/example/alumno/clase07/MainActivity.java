package com.example.alumno.clase07;

import android.content.SharedPreferences;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    //Para poner una constante
    // o pulica         para una clave el final
    private     static  final String RECORDARME="recordarme";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actiobar = getSupportActionBar();

        actiobar.setDisplayHomeAsUpEnabled(true);

        SharedPreferences pref = getSharedPreferences("miconfing", MODE_PRIVATE);

        boolean recuerdo = pref.getBoolean(RECORDARME, false);

        Log.d("Shared", "True");

        //Crear un dialogo



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()==R.id.asas){
            Log.d("Click", "Opcion de menu");
            SharedPreferences pref = getSharedPreferences("miconfing", MODE_PRIVATE);

            MiDialogFragment dialog = new MiDialogFragment();
            dialog.show(getSupportFragmentManager(), "dialogo");

            pref.edit().putBoolean(RECORDARME, true);
            pref.edit().commit();
        }

        if(item.getItemId()==android.R.id.home)
        {
            Log.d("Click", "Back");
            finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
