package com.example.appindividuale_commerce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.net.PasswordAuthentication;

public class Registro extends AppCompatActivity {

    public EditText Nombresr;
    public EditText Correor;
    public Button IraConfiguracion;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        Nombresr = findViewById(R.id.Nombres);
        Correor = findViewById(R.id.CorreoElectronico);
        IraConfiguracion = findViewById(R.id.SiguienteaConfirmacion);

        IraConfiguracion.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Bundle EnviarDatos = new Bundle();
                EnviarDatos.putString("KeyDatos",Nombresr.getText().toString());

                Intent intent = new Intent(Registro.this, Confirmacion.class);
                intent.putExtras(EnviarDatos);
                startActivity(intent);


            }
        });






    }

}