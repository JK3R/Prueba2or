package com.csto.prueba2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner Ubicaciones;
    Button BTN;

    ArrayList<String> valores= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BTN = (Button)findViewById(R.id.button);

        valores.add(".....");
        valores.add("Linares");
        valores.add("Cerro san Cristobal");
        valores.add("Parque Ecuador");
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,valores);
        Ubicaciones.setAdapter(adaptador);

        BTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String UB = Ubicaciones.getSelectedItem().toString();

                if(Ubicaciones.getSelectedItem()=="..."){
                    Toast.makeText(getApplicationContext(),"DEBE SELECIONAR UNA OPCION",Toast.LENGTH_LONG).show();
                }
                if (Ubicaciones.getSelectedItem()=="Linares"){
                    Toast.makeText(getApplicationContext(),"SELECCIONO",Toast.LENGTH_LONG).show();
                    Intent I = new Intent(getApplicationContext(),MainActivity2.class);
                    I.putExtra("UBLNRS",UB);
                    startActivity(I);
                }
                if (Ubicaciones.getSelectedItem()=="Cerro San Cristobal"){
                    Toast.makeText(getApplicationContext(),"SELECCIONO",Toast.LENGTH_LONG).show();
                    Intent I = new Intent(getApplicationContext(),MainActivity3.class);
                    I.putExtra("UBCERRO",UB);
                    startActivity(I);
                }
                if (Ubicaciones.getSelectedItem()==("Parque Ecuador")){
                    Toast.makeText(getApplicationContext(), "SELECCIONO", Toast.LENGTH_LONG).show();
                    Intent I = new Intent(getApplicationContext(), MainActivity4.class);
                    I.putExtra("UBPARQUE",UB);
                    startActivity(I);
                }



            }
        });

    }
}