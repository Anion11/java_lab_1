package com.example.java_task01;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;


public class HelloController {
    private final Imt_class bmi = new Imt_class();
    public TextField mass;
    public TextField rost;
    public Button btnRes;
    public Label msg;
    public Slider imt;

    public void onCalcBMI(ActionEvent actionEvent) {
        bmi.setMass_p(mass.getText());
        bmi.setRost_p(rost.getText());
        imt.setValue(bmi.getImt());
        msg.setText(bmi.toString());
    }
}