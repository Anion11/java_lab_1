package com.example.java_task01;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;


public class HelloController {
    private final Imt_class bmi = new Imt_class();
    public TextField mass;
    public TextField rost;
    public Button btnRes;
    public Label msg;
    public Circle circle;
    public Rectangle progressBar;

    public void onCalcBMI(ActionEvent actionEvent) {
        bmi.setMass_p(mass.getText());
        bmi.setRost_p(rost.getText());
        if (bmi.getImt() < 16) progressBar.setFill(Color.RED);
        else if (bmi.getImt() < 18.5) progressBar.setFill(Color.rgb(255, 134, 134));
        else if (bmi.getImt() < 25) progressBar.setFill(Color.rgb(255, 255, 255));
        else if (bmi.getImt() < 30) progressBar.setFill(Color.rgb(255, 230, 230));
        else if (bmi.getImt() < 35) progressBar.setFill(Color.rgb(246, 204, 204));
        else if (bmi.getImt() < 40) progressBar.setFill(Color.rgb(255, 134, 134));
        else progressBar.setFill(Color.RED);;
        circle.setTranslateX(circle.getCenterX() + (bmi.getImt()*6));
        msg.setText(bmi.toString());
    }
}