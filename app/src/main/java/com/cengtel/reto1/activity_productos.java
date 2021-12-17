package com.cengtel.reto1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class activity_productos extends AppCompatActivity {

    int[] viewArray = {R.id.borrador_btn, R.id.lapiz_btn, R.id.cuaderno_btn, R.id.regla_btn, R.id.tajalapiz_btn, R.id.blog_btn};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos);

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