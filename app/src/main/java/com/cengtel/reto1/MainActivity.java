package com.cengtel.reto1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Add icon in the topbar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_logo2);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.share:
                Toast.makeText(getApplicationContext(), "Implementado en V2", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.favorite:
                Toast.makeText(getApplicationContext(), "Implementado en V2", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.productos:
                Intent actProductos = new Intent(getApplicationContext(), activity_productos.class);
                startActivity(actProductos);
                return true;
            case R.id.servicios:
                Intent actServicios = new Intent(getApplicationContext(), activity_servicios.class);
                startActivity(actServicios);
                return true;
            case R.id.surcursales:
                Intent actSucursales = new Intent(getApplicationContext(), activity_sucursales.class);
                startActivity(actSucursales);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}