package com.example.leon.joguinho;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuInicialActivity extends AppCompatActivity {

    Button btnPlay;
    ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_inicial);

        btnPlay = findViewById(R.id.btnPlay);
        layout = findViewById(R.id.layout);

        btnPlay.setBackgroundColor(getResources().getColor(R.color.btnPlayColor));
        layout.setBackgroundColor(getResources().getColor(R.color.background));

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
