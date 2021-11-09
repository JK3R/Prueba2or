package com.csto.prueba2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {


    Button Vol,Sate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Sate = (Button) findViewById(R.id.button4SateliteMain2);
        Vol = (Button)findViewById(R.id.button3VolverManin2);

    Vol.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent I = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(I);
        }
    });
    Sate.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent I = new Intent(getApplicationContext(),MapsActivity.class);
            startActivity(I);
        }
    });
    }
}