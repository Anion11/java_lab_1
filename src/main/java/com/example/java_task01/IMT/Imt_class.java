package com.example.java_task01.IMT;

public class Imt_class {
    private double mass_p;
    private double rost_p;
    public Imt_class(){
        this.mass_p = 0;
        this.rost_p = 0;
    }
    public Imt_class(double massa,double rost){
        this.mass_p = massa;
        this.rost_p = rost;
    }
    public void setMass_p(String mass){
        mass_p = Double.parseDouble(mass);
    }
    public void setRost_p(String rost){
        rost_p = Double.parseDouble(rost);
    }
    public double getImt(){
        return (mass_p/(rost_p*rost_p)*10000);
    }

    public String toString(){
        String message = "";
        if (getImt() < 16) message = "Выраженный дефицит массы тела";
        else if (getImt() < 18.5) message = "Недостаточная (дефицит) масса тела";
        else if (getImt() < 25) message = "Норма";
        else if (getImt() < 30) message = "Избыточная масса тела (предожирение)";
        else if (getImt() < 35) message = "Ожирение 1 степени";
        else if (getImt() < 40) message = "Ожирение 2 степени";
        else message = "Ожирение 3 степени";
        return "Ваш ИМТ равен " + getImt() + ", что означает, что у вас " + message;
    }
}
