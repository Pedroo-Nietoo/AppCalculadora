package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnIgual, btnVezes, btnDivide, btnMenos, btnMais, btnLimpa;
    TextView telaResultado;
    ArrayList<Integer> valores = new ArrayList<Integer>();
    int numeroArrumado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        getWindow().setStatusBarColor(Color.rgb(80, 80, 80));
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnIgual = findViewById(R.id.btnIgual);
        btnVezes = findViewById(R.id.btnVezes);
        btnDivide = findViewById(R.id.btnDivide);
        btnMais = findViewById(R.id.btnMais);
        btnMenos = findViewById(R.id.btnMenos);
        btnLimpa = findViewById(R.id.btnLimpa);
        telaResultado = findViewById(R.id.telaResultado);
    }

    public void arrumarNumeros() {
        String x = "";
        for (Integer num : valores) {
            x += num.toString();
        }
        numeroArrumado = Integer.parseInt(x);
    }

    public boolean verificarNumeros() {
        if(valores.isEmpty()){
            return false;
        } else {
            return true;
        }
    }

    public void limpar(View v) {
        valores.clear();
        telaResultado.setText(null);
    }

    public void somar(View v) {
        if(verificarNumeros()){
            telaResultado.setText(numeroArrumado + "+");
        } else {
            telaResultado.setText(null);
        }
    }

    public void subtrair(View v) {
        if(verificarNumeros()){
            telaResultado.setText(numeroArrumado + "-");
        } else {
            telaResultado.setText(null);
        }
    }

    public void multiplicar(View v) {
        if(verificarNumeros()){
            telaResultado.setText(numeroArrumado + "X");
        } else {
            telaResultado.setText(null);
        }
    }

    public void dividir(View v) {
        if(verificarNumeros()){
            telaResultado.setText(numeroArrumado + "/");
        } else {
            telaResultado.setText(null);
        }
    }

    public void addZero(View v) {
        valores.add(0);
        arrumarNumeros();
        telaResultado.setText(numeroArrumado + "");
    }

    public void addUm(View v) {
        valores.add(1);
        arrumarNumeros();
        telaResultado.setText(numeroArrumado + "");
    }

    public void addDois(View v) {
        valores.add(2);
        arrumarNumeros();
        telaResultado.setText(numeroArrumado + "");
    }

    public void addTres(View v) {
        valores.add(3);
        arrumarNumeros();
        telaResultado.setText(numeroArrumado + "");
    }

    public void addQuatro(View v) {
        valores.add(4);
        arrumarNumeros();
        telaResultado.setText(numeroArrumado + "");
    }

    public void addCinco(View v) {
        valores.add(5);
        arrumarNumeros();
        telaResultado.setText(numeroArrumado + "");
    }

    public void addSeis(View v) {
        valores.add(6);
        arrumarNumeros();
        telaResultado.setText(numeroArrumado + "");
    }

    public void addSete(View v) {
        valores.add(7);
        arrumarNumeros();
        telaResultado.setText(numeroArrumado + "");
    }

    public void addOito(View v) {
        valores.add(8);
        arrumarNumeros();
        telaResultado.setText(numeroArrumado + "");
    }

    public void addNove(View v) {
        valores.add(9);
        arrumarNumeros();
        telaResultado.setText(numeroArrumado + "");
    }
}