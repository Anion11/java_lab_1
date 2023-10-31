package com.example.java_task01;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class Indicator {
    private final HBox panel = new HBox();
    public void add(Pane pane){
        panel.getChildren().add(pane);
    }
    public void remove(Pane pane){
        pane.getChildren().remove(panel);
    }
    public void show(Pane pane){
        pane.getChildren().add(panel);
    }
}
