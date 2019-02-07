package com.example.daniel.primitivas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;
public class LineaSimple extends View {
    Paint paint = new Paint();

    public LineaSimple(Context context) {
        super(context);
        paint.setColor(Color.BLACK);
    }
    @Override
    public void onDraw(Canvas g){
        int x0 = 600 , y0=400, x1=100, y1 = 200;
        int dx = x1 - x0;
        int dy = y1 - y0;
        if (dx != 0){
            float m = (float) dy / (float) dx;
            float b = y0 - m*x0;
            if(x1 > x0)
                dx = 1;
            else
                dx = -1;
            while (x0 != x1) {
                x0 += dx;
                y0 = Math.round(m*x0 + b);
                g.drawPoint(x0,y0,paint);
            }
        }
    }
}
