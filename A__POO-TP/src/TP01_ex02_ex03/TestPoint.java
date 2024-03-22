package TP01_ex02_ex03;

public class TestPoint{

    public static void main(String[] args) {
        Point bottomLeft=new Point(4,5);
        Point topRight=new Point(bottomLeft.getX()+2, bottomLeft.getY()+3);
        /*Point topRight = new Point();
        topRight.setX(bottomLeft.getX()+2);
        topRight.setY(bottomLeft.getY()+3);*/
        printCoordinates(bottomLeft);
        printCoordinates(topRight);
    }
    public static void printCoordinates(Point p){
        System.out.println("the coordinates r: X: "+p.getX()+"\t\t Y: "+p.getY());
    }
}
