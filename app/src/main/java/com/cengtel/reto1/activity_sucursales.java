package com.cengtel.reto1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class activity_sucursales extends AppCompatActivity {
    int[] viewArray = {R.id.aeropuerto_btn, R.id.northpoint_btn, R.id.santafe_btn};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sucursales);

        for (int i=0; i < viewArray.length; i++){
            Button b = (Button) findViewById(viewArray[i]);
            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "Implementado en V2", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}