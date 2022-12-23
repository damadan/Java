package com.company;

public class MovableCiircle extends MovablePoint  implements Movable  {
    private  MovablePoint Center;
    private int radius;
MovableCiircle(int x,int y,int ySpeed,int xSpeed,int radius){
    this.radius=radius;
    this.y=y;
    this.x=x;
    this.xSpeed=xSpeed;
    this.ySpeed=ySpeed;
}
    @Override
    public void MoveUp() {

    }

    @Override
    public void MoveDown() {

    }

    @Override
    public void MoveRight() {

    }

    @Override
    public void MoveLeft() {

    }

    @Override
    public String toString(){
        return "MovableCircle{ x ="+x+"\n"+"y="+y+"\n"+"xSpeed="+xSpeed+"\n"+"ySpeed="+ySpeed+"\n"+"radius="+radius;
    }

}
