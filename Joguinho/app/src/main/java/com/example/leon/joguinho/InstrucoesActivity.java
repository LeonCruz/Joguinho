package com.example.leon.joguinho;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InstrucoesActivity extends AppCompatActivity {

    ConstraintLayout layout;
    Button btnPlay2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instrucoes);

        layout =  findViewById(R.id.layoutInstrucoes);
        btnPlay2 = findViewById(R.id.btnPlay2);

        layout.setBackgroundColor(getResources().getColor(R.color.background));
        btnPlay2.setBackgroundColor(getResources().getColor(R.color.btnColor));

        btnPlay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
