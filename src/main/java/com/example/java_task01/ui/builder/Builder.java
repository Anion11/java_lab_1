package com.example.java_task01.ui.builder;

import com.example.java_task01.ui.Indicator;
import javafx.scene.paint.Color;

public interface Builder {
    public void lineBounds(int width, int height, Color color);
    public void lineCircle(int radix, double CenterX);
    public Indicator Build();
}
