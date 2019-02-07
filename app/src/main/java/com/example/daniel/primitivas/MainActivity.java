package com.example.daniel.primitivas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickRecta(View view)
    {
        LineaSimple graficas = new LineaSimple(this);
        setContentView(graficas);
    }
    public  void onClickBresenham(View view)
    {
        Bresenham bresenham = new Bresenham(this);
        setContentView(bresenham);
    }
    public void onClickCirculo(View view)
    {
        Circulo circulo = new Circulo(this);
        setContentView(circulo);
    }
    public void onClickElipse(View view)
    {
        Elipse elipse = new Elipse(this);
        setContentView(elipse);
    }
    public void onClickFigura(View view)
    {
        Figura elipse = new Figura(this);
        setContentView(elipse);
    }

}
