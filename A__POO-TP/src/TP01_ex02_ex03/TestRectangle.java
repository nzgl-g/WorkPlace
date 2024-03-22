package TP01_ex02_ex03;

public class TestRectangle {

    public static void main(String[] args) {
        Point bottomLeft = new Point(4, 5);
        Point topRight = new Point();
        topRight.setX(bottomLeft.getX() + 2);
        topRight.setY(bottomLeft.getY() + 3);
        Rectangle rectangle = new Rectangle(bottomLeft, topRight);
        System.out.println("Surface of the rectangle: " + rectangle.surface());
    }
}
