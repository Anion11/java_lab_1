package com.example.java_task01.controllers;
import com.example.java_task01.builder.Director;
import com.example.java_task01.IMT.Imt_class;
import com.example.java_task01.builder.Indicator;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class ImtController {
    private final Imt_class bmi = new Imt_class();
    public TextField mass;
    public TextField rost;
    public Button btnRes;
    public Label msg;
    public Indicator indicator;
    public boolean indicatorOk = false;
    public HBox panel;
    public void onCalcBMI(ActionEvent actionEvent) {
        if (indicatorOk) indicator.remove(panel);
        indicatorOk = true;
        Director director = new Director();
        bmi.setMass_p(mass.getText());
        bmi.setRost_p(rost.getText());
        Color color;
        if (bmi.getImt() < 16) color = Color.RED;
        else if (bmi.getImt() < 18.5) color = Color.rgb(255, 134, 134);
        else if (bmi.getImt() < 25) color = Color.rgb(2, 250, 15);
        else if (bmi.getImt() < 30) color = Color.rgb(255, 230, 230);
        else if (bmi.getImt() < 35) color = Color.rgb(246, 204, 204);
        else if (bmi.getImt() < 40) color = Color.rgb(255, 134, 134);
        else color = Color.RED;
        int currentValue = Math.min((int) bmi.getImt(), 50);
        indicator = new Indicator();
        indicator = director.Constr(color,currentValue*6, "" + bmi.getImt());
        indicator.show(panel);
        msg.setText(bmi.toString());
    }
}