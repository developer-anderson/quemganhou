package com.example.anderson.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void mudarTela(View view)
    {
        Button transicao = findViewById(R.id.enviarDados);
        Intent intent = new Intent(getApplicationContext(), Main2Activity.class);

        startActivities(new Intent[]{intent});
    }
}
