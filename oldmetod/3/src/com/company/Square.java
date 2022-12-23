package com.company;

public class Square extends Rectangle{
   public double side;
    Square(double side){
        this.side=side;
    }
    Square(double side,String color,boolean filled){
        this.side=side;
        this.color=color;
        this.filled=filled;
    }
    public void setSide(double side){this.side=side;}
    public double getSide(){return this.side;}
    public void setLength (double side){
        this.side=side;
    }
    public void setWidth (double side){
        this.side=side;
    }
    public  String toString(){
        return "Square:\n"+"color="+color+"\n"+
                "side="+side+"\n"+"filled="+filled;
    }



}
