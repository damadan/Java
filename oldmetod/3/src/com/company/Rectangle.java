package com.company;

public class Rectangle extends Shape{
    protected double length,width;
    Rectangle(double length,double width,String color,boolean filled){
        this.length=length;
        this.width=width;
        this.color=color;
        this.filled=filled;
    }
Rectangle(double length,double width){
        this.length=length;
        this.width=width;
}

    public Rectangle() {
    }

    public double getLength(){
        return length;
}
public double getWidth(){
        return this.width;
    }
public void  setLength(double length){this.length=length;}
public void  setWidth(double width){this.width=width;}
public double getArea(){
        return width*length;
}
public double getPerimetr(){
        return 2*(length+width);
    }
public String toString(){return "Rectangle:\n color="+color+"\n"+"length="+length +"\\n width="+width+"\\n filled="+filled;



    }

}
