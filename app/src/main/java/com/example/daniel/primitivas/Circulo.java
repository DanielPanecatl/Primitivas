package com.example.daniel.primitivas;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;
public class Circulo extends View {
    Paint paint = new Paint();
    public Circulo(Context context)
    {
        super(context);
        paint.setColor(Color.BLACK);
    }
    @Override
    public void onDraw(Canvas canvas)
    {
        int Xc = 500, Yc = 500 ,R= 400;
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
    }
}