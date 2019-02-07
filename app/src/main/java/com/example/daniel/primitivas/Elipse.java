package com.example.daniel.primitivas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class Elipse extends View {
    Paint paint = new Paint();
    public Elipse (Context context)
    {
        super(context);
        paint.setColor(Color.BLACK);
    }
    @Override
    public void onDraw(Canvas canvas)
    {
        int xc = 500, yc = 500, width = 200, height = 300;
        int a2 = width * width;
        int b2 = height * height;
        int fa2 = 4 * a2, fb2 = 4 * b2;
        int x, y, sigma;
        for (x = 0, y = height, sigma = 2*b2+a2*(1-2*height); b2*x <= a2*y; x++)
        {
            canvas.drawPoint(xc + x, yc + y,paint);
            canvas.drawPoint(xc - x, yc + y,paint);
            canvas.drawPoint(xc + x, yc - y,paint);
            canvas.drawPoint(xc - x, yc - y,paint);
            if (sigma >= 0)
            {
                sigma += fa2 * (1 - y);
                y--;
            }
            sigma += b2 * ((4 * x) + 6);
        }
        for (x = width, y = 0, sigma = 2*a2+b2*(1-2*width); a2*y <= b2*x; y++)
        {
            canvas.drawPoint(xc + x, yc + y,paint);
            canvas.drawPoint(xc - x, yc + y,paint);
            canvas.drawPoint(xc + x, yc - y,paint);
            canvas.drawPoint(xc - x, yc - y,paint);
            if (sigma >= 0)
            {
                sigma += fb2 * (1 - x);
                x--;
            }
            sigma += a2 * ((4 * y) + 6);
        }
    }

}
