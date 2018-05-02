package com.example.leon.joguinho;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.DisplayMetrics;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class Joguinho extends SurfaceView implements Runnable {

    boolean rodando;
    boolean fimJogo = false;
    int posX, posY;
    double velocidadeQueda = 3;

    Thread thread = null;
    SurfaceHolder holder;
    Paint paint;
    Personagem personagem;

    public Joguinho(Context context){
        super(context);
        holder = getHolder();
        paint = new Paint();
    }

    public void pular(int velocidadePulo){
        posY -= 100 + velocidadePulo;

    }

    public void cair(double velocidade){
        posY += velocidade;
    }

    public void resume()
    {
        rodando = true;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        while (rodando){
            if(!holder.getSurface().isValid()){
                continue;
            }

            Canvas canvas = holder.lockCanvas();
            canvas.drawColor(Color.WHITE);

            cair(velocidadeQueda);
            personagem = new Personagem(canvas, paint, posX, posY);

            holder.unlockCanvasAndPost(canvas);

            if(fimJogo){
                rodando = false;
            }
        }
    }
}
