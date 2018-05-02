package com.example.leon.joguinho;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener{

    Joguinho joguinho;
    Personagem personagem;
    int largura;
    int altura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        joguinho = new Joguinho(this);
        joguinho.setOnTouchListener(this);

        pegarDimensaoTela();

        joguinho.posX = largura/2;
        joguinho.posY = altura/4;

        setContentView(joguinho);
    }

    protected void onResume(){
        super.onResume();
        joguinho.resume();
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        int distanciaPulo = 0;
        joguinho.pular(distanciaPulo);
        joguinho.pontos++;

        joguinho.velocidadeQueda += .5;
        distanciaPulo += 15;

        return false;
    }

    private void pegarDimensaoTela(){
        DisplayMetrics dm = new DisplayMetrics();
        this.getWindowManager().getDefaultDisplay().getMetrics(dm);
        largura = dm.widthPixels;
        altura = dm.heightPixels;
    }
}
