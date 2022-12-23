package com.company;

public class MovablePoint implements Movable{
   int x,y,xSpeed,ySpeed;

    MovablePoint(int x,int y, int xSpeed,int ySpeed){
        this.x=x;
        this.xSpeed=xSpeed;
        this.y=y;
        this.ySpeed=ySpeed;
    }

    public MovablePoint() {
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
        return "MovablePoint{ x ="+x+"\n"+"y="+y+"\n"+"xSpeed="+xSpeed+"\n"+"ySpeed="+ySpeed;
    }
}

