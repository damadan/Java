package com.company;

public class Ball {
    private String color;
    private int size;
    public Ball(String n, int a){
        color = n;
        size = a;
    }
    public Ball(String n){
        color = n;
        size = 0;

    }
    public Ball(){
        color = "не указано";
        size = 0;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getSize(){
        return this.size;
    }
    public String getColor() {
        return this.color;
    }

    public String toString(){
        return "size"+"  "+this.size+"\n"+"color "+this.color;
    }
    public void nicechoice() {
        if (this.color=="purple"||this.color=="green")
        {
            System.out.println("nice choice");
        }
else{
            System.out.println("strange choice");
        }
    }
}