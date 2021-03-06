package com.example.andersonjunior;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public int numberSorted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        executeInStart();
    }

    //metodo abstraído para o setOnClickListener para nao depender do onClick que já é deprecated.
    public void executeInStart(){
        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView campoResultado = findViewById(R.id.resultado);
                Random rand = new Random();
                numberSorted = rand.nextInt(11);

                //entender o por que daquele erro ao passar uma string para esse campo.
                campoResultado.setText(""+numberSorted);
                campoResultado.getCurrentTextColor();
            }
        });
    }

    public void mudarParaOutraTela(View view){
        setContentView(R.layout.news);
    }

    public void voltarTelaAnterior(View view){
        setContentView(R.layout.activity_main);
    }
}