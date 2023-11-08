package com.example.java_task01.builder;

import javafx.scene.paint.Color;

public class Director {
    BuilderIndicatorMini builder = new BuilderIndicatorMini();
    public Indicator Constr(Color color, double centerX, String bmi){
        builder.lineBounds(300, 15, color);
        builder.lineCircle(11, centerX);
        builder.addText(bmi);
        return builder.Build();
    }
}
