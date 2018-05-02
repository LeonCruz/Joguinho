package com.example.leon.joguinho;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuInicialActivity extends AppCompatActivity {

    Button btnPlay;
    Button btnInstrucoes;
    ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_inicial);

        layout = findViewById(R.id.layout);
        btnPlay = findViewById(R.id.btnPlay);
        btnInstrucoes = findViewById(R.id.btnInstrucoes);

        layout.setBackgroundColor(getResources().getColor(R.color.background));
        btnPlay.setBackgroundColor(getResources().getColor(R.color.btnColor));
        btnInstrucoes.setBackgroundColor(getResources().getColor(R.color.btnColor));

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        btnInstrucoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), InstrucoesActivity.class);
                startActivity(intent);
            }
        });
    }
}
