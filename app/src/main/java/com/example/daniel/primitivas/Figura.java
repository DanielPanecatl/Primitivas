package com.example.daniel.primitivas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class Figura extends View {
    Paint paint = new Paint();
    public Figura(Context context)
    {
        super(context);
        paint.setColor(Color.BLACK);
    }
    @Override
    public void onDraw(Canvas canvas)
    {
        int Xc = 500, Yc = 500 ,R= 500;
        int x = 0, y = R, p = 1-R;
        while (x < y)
        {
            if (p < 0) {
                x=x+1;
                p = p + 2 * x + 1;
            }
            else {
                x = x + 1;
                y = y - 1;
                p = p + 2 * (x-y)+1;
            }
            canvas.drawPoint(Xc+x,Yc+y,paint);
            canvas.drawPoint(Xc-x,Yc+y,paint);
            canvas.drawPoint(Xc+x,Yc-y,paint);
            canvas.drawPoint(Xc-x,Yc-y,paint);

            canvas.drawPoint(Xc+y,Yc+x,paint);
            canvas.drawPoint(Xc-y,Yc+x,paint);
            canvas.drawPoint(Xc+y,Yc-x,paint);
            canvas.drawPoint(Xc-y,Yc-x,paint);
        }
        ojoDerecho(canvas);
        ojoIzq(canvas);
        boca(canvas);
    }

    public void ojoDerecho(Canvas canvas) {
        int Xc = 400, Yc = 500, R = 100;
        int x = 0, y = R, p = 1 - R;
        while (x < y) {
            if (p < 0) {
                x = x + 1;
                p = p + 2 * x + 1;
            } else {
                x = x + 1;
                y = y - 1;
                p = p + 2 * (x - y) + 1;
            }
            canvas.drawPoint(Xc + x, Yc + y, paint);
            canvas.drawPoint(Xc - x, Yc + y, paint);
            canvas.drawPoint(Xc + x, Yc - y, paint);
            canvas.drawPoint(Xc - x, Yc - y, paint);

            canvas.drawPoint(Xc + y, Yc + x, paint);
            canvas.drawPoint(Xc - y, Yc + x, paint);
            canvas.drawPoint(Xc + y, Yc - x, paint);
            canvas.drawPoint(Xc - y, Yc - x, paint);
        }
    }

    public void ojoIzq(Canvas canvas) {
        int Xc = 600, Yc = 500, R = 100;
        int x = 0, y = R, p = 1 - R;
        while (x < y) {
            if (p < 0) {
                x = x + 1;
                p = p + 2 * x + 1;
            } else {
                x = x + 1;
                y = y - 1;
                p = p + 2 * (x - y) + 1;
            }
            canvas.drawPoint(Xc + x, Yc + y, paint);
            canvas.drawPoint(Xc - x, Yc + y, paint);
            canvas.drawPoint(Xc + x, Yc - y, paint);
            canvas.drawPoint(Xc - x, Yc - y, paint);

            canvas.drawPoint(Xc + y, Yc + x, paint);
            canvas.drawPoint(Xc - y, Yc + x, paint);
            canvas.drawPoint(Xc + y, Yc - x, paint);
            canvas.drawPoint(Xc - y, Yc - x, paint);
        }
    }
    public void boca(Canvas g)
    {
        int x0 = 400 , y0=200, x1=700, y1 = 200;
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
