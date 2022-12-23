package com.company;

public class Circle extends Shape {
    protected double radius;
Circle (double radius,String color,boolean filled){

this.radius=radius;
this.color=color;
this.filled=filled;
}
Circle (double radius){this.radius=radius;}
public double getRadius(){return this.radius;}
public void setRadius(double radius){this.radius=radius;}
public String toString(){
    return"Circle :" +
            "color:"+this.color+
            "radius:"+this.radius+
            "filled:"+this.filled;
    }
public  double getArea(){return 3.14*radius*radius;}
public  double getPerimetr(){return 2*3.14*radius;}

}
