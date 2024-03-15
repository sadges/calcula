package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    private TextView mensaje;
    private EditText valor1;
    private EditText valor2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mensaje = findViewById(R.id.resultado);
        valor1 = findViewById(R.id.caja1);
        valor2 = findViewById(R.id.caja2);
    }
    public void irASecondActivity(View view) {
        Intent segundo = new Intent(this , MainActivity3.class);
        startActivity(segundo);
    }
    public void irAtercerActivity(View view) {
        Intent tercer = new Intent(MainActivity.this , MainActivity2.class);
        startActivity(tercer);
    }


    public void suma(View view) {
        int num1 = Integer.parseInt(valor1.getText().toString());
        int num2 = Integer.parseInt(valor2.getText().toString());
        mensaje.setText(String.valueOf(calcularSuma(num1, num2)));
    }

    public void resta(View view) {
        int num1 = Integer.parseInt(valor1.getText().toString());
        int num2 = Integer.parseInt(valor2.getText().toString());
        mensaje.setText(String.valueOf(calcularResta(num1, num2)));
    }

    public void multiplicacion(View view) {
        int num1 = Integer.parseInt(valor1.getText().toString());
        int num2 = Integer.parseInt(valor2.getText().toString());
        mensaje.setText(String.valueOf(calcularMultiplicacion(num1, num2)));
    }

    public void division(View view) {
        int num1 = Integer.parseInt(valor1.getText().toString());
        int num2 = Integer.parseInt(valor2.getText().toString());
        mensaje.setText(String.valueOf(calcularDivision(num1, num2)));
    }

    public void fibonacci(View view) {
        int n = Integer.parseInt(valor1.getText().toString());
        int resultado = calcularFibonacci(n);
        mensaje.setText(String.valueOf(resultado));
    }


    public static int calcularSuma(int num1, int num2) {
        return num1 + num2;
    }

    public static int calcularResta(int num1, int num2) {
        return num1 - num2;
    }

    public static int calcularMultiplicacion(int num1, int num2) {
        return num1 * num2;
    }

    public static double calcularDivision(int num1, int num2) {
        if (num2 != 0) {
            return (double) num1 / num2;
        } else {
            throw new IllegalArgumentException("Error: No se puede dividir entre cero");
        }
    }

    public static int calcularFibonacci(int n) {
        if (n <= 1)
            return n;
        int fibo = 1;
        int fiboPrev = 1;
        for (int i = 2; i < n; ++i) {
            int temp = fibo;
            fibo += fiboPrev;
            fiboPrev = temp;
        }
        return fibo;
    }

}
