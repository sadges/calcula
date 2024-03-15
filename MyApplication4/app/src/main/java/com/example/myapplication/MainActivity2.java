package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView dinero;
    private EditText peso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dinero = findViewById(R.id.resultado);
        peso = findViewById(R.id.caja1);

    }

    public void convertirAPesoColombiano(View view) {

        String pesoColombianoString = peso.getText().toString();


        if (!pesoColombianoString.isEmpty()) {
            double peso = Double.parseDouble(pesoColombianoString);
            double Dolar = 4000;
            double valor = peso / Dolar;
            dinero.setText(String.format("$", valor) + "dólares");
        } else {
            dinero.setText("Ingrese un valor válido de peso colombiano");
        }
    }

    public void convertirAEuro(View view) {

        String pesoColombianoString = peso.getText().toString();


        if (!pesoColombianoString.isEmpty()) {
            double peso = Double.parseDouble(pesoColombianoString);
            double Euro = 4200.0;
            double valor = peso / Euro;
            dinero.setText(String.format("€", valor) + " euros");
        } else {
            dinero.setText("Ingrese un valor válido");
        }

    }
    public void anterior(View view) {
        Intent anterior = new Intent(MainActivity2.this, MainActivity.class);
        startActivity(anterior);
    }
}