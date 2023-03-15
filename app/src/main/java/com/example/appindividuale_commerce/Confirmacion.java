package com.example.appindividuale_commerce;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Confirmacion extends AppCompatActivity {

    public TextView nombreconf;
    public TextView correoconf;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacion);

        nombreconf = findViewById(R.id.NombreConf);

        Bundle RecibirDatos = getIntent().getExtras();
        String info = RecibirDatos.getString("KeyDatos");

        nombreconf.setText(info);




    }
}