package com.company;

public class MovableRectangle  extends MovablePoint implements Movable{
private MovablePoint topLeft;
private MovablePoint bottomRight;

MovableRectangle(int x1,int y1,int x2,int y2,int xSpeed,int ySpeed){
    
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
    public  boolean isSpeedEquals(){
    if (this.topLeft.xSpeed==this.bottomRight.xSpeed &&  this.topLeft.ySpeed==this.bottomRight.ySpeed ){
        return true;
    }
    return  false;
    }

    @Override
    public  String toString(){
    return "MovableRectangle{ topLeft x ="+this.topLeft.x+"\n"+"topLeft y="+topLeft.y+
            "\n"+"xSpeed x="+topLeft.xSpeed+"\n"+"ySpeed x ="+topLeft.ySpeed+
            "\n"+"xSpeed y="+bottomRight.xSpeed+"\n"+"ySpeed y ="+bottomRight.ySpeed+
            "\n"+"bottomRight x ="+bottomRight.x+"\n"+"bottomRight y ="+bottomRight.y;
    }

}
