package com.example.leon.joguinho;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Personagem {
    Canvas canvas;

    public Personagem(){};

    public Personagem(Canvas canvas, Paint paint, int posX, int posY){
        paint.setColor(Color.BLUE);
        canvas.drawCircle(posX, posY,100, paint);
    }

}
