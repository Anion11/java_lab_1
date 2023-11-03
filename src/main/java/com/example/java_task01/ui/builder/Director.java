package com.example.java_task01.ui.builder;

import com.example.java_task01.ui.builder.BuilderIndicatorMini;
import com.example.java_task01.ui.Indicator;
import javafx.scene.paint.Color;

public class Director {
    BuilderIndicatorMini builder = new BuilderIndicatorMini();
    public Indicator Constr(Color color, double centerX){
        builder.lineBounds(300, 15, color);
        builder.lineCircle(11, centerX);
        return builder.Build();
    }
}
