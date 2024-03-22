package TP01_ex02_ex03;
public class Point {
    private float x;
    private float y;
    public Point(){

    }

    public Point(float x,float y){
        this.x+=x;
        this.x+=y;
    }

    //getters and setters
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

}
