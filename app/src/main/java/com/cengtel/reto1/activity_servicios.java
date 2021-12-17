package com.cengtel.reto1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class activity_servicios extends AppCompatActivity {
    int[] viewArray = {R.id.impresion_btn, R.id.fotocopiado_btn, R.id.anillado_btn};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicios);

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