package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    private TextView espacio;
    private EditText cambio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        espacio= findViewById(R.id.resultado);
        cambio= findViewById(R.id.caja1);

    }
    public void Kilobytes(View view) {
        String inputString = cambio.getText().toString();
        if (!inputString.isEmpty()) {
            double input = Double.parseDouble(inputString);
            double kb = input * 1024;
            espacio.setText("Kilobytes: " + kb);
        }
    }

    public void Gigabytes(View view) {
        String inputString = cambio.getText().toString();
        if (!inputString.isEmpty()) {
            double input = Double.parseDouble(inputString);
            double gb = input / 1024;
            espacio.setText("Gigabytes: " +gb);
        }
    }

    public void Bytes(View view) {
        String inputString = cambio.getText().toString();

        if (!inputString.isEmpty()) {
            double input = Double.parseDouble(inputString);
            double bytes = input * 1024 * 1024;
            espacio.setText("Bytes: " + bytes);
        }
    }

    public void anterior(View view) {
        Intent anterior = new Intent(MainActivity3.this, MainActivity.class);
        startActivity(anterior);
    }
}