package com.company;

import java.awt.geom.Area;

public abstract class  Shape {
    protected String color;
    protected boolean filled;
    public Shape(String color,boolean filled){
        this.color=color;
        this.filled=filled;
    }

    protected Shape() {
    }

    public  String getColor(){
        return this.color;
    }
    public  boolean isFilled(){
        return this.filled;
    }
    public void setColor(String color){this.color=color;}
    public void setFilled(boolean filled){this.filled=filled;}
    public double getArea(){return 0.0;}
    public double getPerimetr(){return 0.0;}
    public String toString(){return "";}






}

