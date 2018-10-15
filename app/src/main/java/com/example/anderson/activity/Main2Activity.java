package com.example.anderson.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class Main2Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        int numero = new Random().nextInt(20);
        ImageView resultado = findViewById(R.id.resultado);
        if (numero >= 10)
        {
            resultado.setImageResource(R.drawable.moeda_cara);
        }else{
            resultado.setImageResource(R.drawable.moeda_coroa);
        }

    }

    public void voltar(View view){
        Button voltar = findViewById(R.id.botao2);
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);

        startActivities(new Intent[]{intent});
    }
}
