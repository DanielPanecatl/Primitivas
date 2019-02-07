package com.example.daniel.primitivas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class Bresenham extends View {
    Paint paint = new Paint();
    public Bresenham(Context contex)
    {
        super(contex);
        paint.setColor(Color.BLACK);
    }
    @Override
    public void onDraw(Canvas g)
    {
        int x0 = 600, y0 = 400, x1 = 100, y1 = 200;
        int x, y, dx, dy, xend, p, incE, incNE;
        dx = Math.abs(x1 - x0);
        dy = Math.abs(y1 - y0);
        p = 2*dy - dx;
        incE = 2*dy;
        incNE = 2*(dy-dx);
        if (x0 > x1) {
            x = x1;
            y = y1;
            xend = x0;
        }
        else {
            x = x0;
            y = y0;
            xend = x1;
        }
        g.drawPoint(x0, y0,paint);
        while (x <= xend){
            g.drawPoint(x,y,paint);
            x = x + 1;
            if (p < 0)
                p = p + incE;
            else {
                y = y + 1;
                p = p + incNE;
            }
            g.drawPoint( x0, y0,paint);
        }
    }
}
