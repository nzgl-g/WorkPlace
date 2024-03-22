package TP01_ex02_ex03;

public class Rectangle {
    private Point bottomLeft;
    private Point topRight;
    private Point topLeft;
    private Point bottomRight;
    private int nbrClass =0;
    public Rectangle(float bottomLeftX, float bottomLeftY, float topRightX, float topRightY) {
        //Additional Constructor
        this.bottomLeft = new Point(bottomLeftX, bottomLeftY);
        this.topRight = new Point(topRightX, topRightY);
    }
    public Rectangle(Point bottomLeft, Point topRight){
        nbrClass++;
        this.bottomLeft = bottomLeft;
        this.topRight= topRight;
        this.bottomRight=new Point(bottomLeft.getX()+largeur(),bottomLeft.getY());
        this.topLeft=new Point(topRight.getX()-largeur(),topRight.getY());
    }

    //Mthodes
    public float longer(Point topCoordinate, Point bottomCoordinate){
        return Math.abs(this.bottomLeft.getY()-this.topRight.getY());
    }
    public float largeur(){
        return Math.abs(this.bottomLeft.getX()-this.topRight.getX());
    }
    public float surface(){
        return longer(bottomLeft,topRight);
    }

    //Getters & Setters
    public Point getBottomLeft() {
        return bottomLeft;
    }

    public void setBottomLeft(Point bottomLeft) {
        this.bottomLeft = bottomLeft;
    }

    public Point getTopRight() {
        return topRight;
    }

    public void setTopRight(Point topRight) {
        this.topRight = topRight;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public Point getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(Point bottomRight) {
        this.bottomRight = bottomRight;
    }

    public int getNbrClass() {
        return nbrClass;
    }

    public void setNbrClass(int nbrClass) {
        this.nbrClass = nbrClass;
    }
}
