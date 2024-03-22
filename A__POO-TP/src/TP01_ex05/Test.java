package TP01_ex05;

import TP01_ex02_ex03.Point;

public class Test {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        String s1 = "A";
        String s2 = "B";
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);

        System.out.println("Avant changement: " + x + " " + y + " " + s1 + " " + s2 + " " + p1.getX() + " " + p1.getY() + " " + p2.getX() + " " + p2.getY());
        change(x, y, s1, s2, p1, p2);
        System.out.println("Après changement: " + x + " " + y + " " + s1 + " " + s2 + " " + p1.getX() + " " + p1.getY() + " " + p2.getX() + " " + p2.getY());
    }

    public static void change(int a, int b, String n, String m, Point p, Point q) {
        System.out.println("Début changement: " + a + " " + b + " " + n + " " + m + " " + p.getX() + " " + p.getY() + " " + q.getX() + " " + q.getY());
        a = 30;
        b = 40;
        n = "C";
        m = "D";
        p.setX(10);
        q = new Point(5, 6);
        System.out.println("Fin changement: " + a + " " + b + " " + n + " " + m + " " + p.getX() + " " + p.getY() + " " + q.getX() + " " + q.getY());
    }
}
//the purpose of this exercice is all about primitive data types and reference data types
//primitive data types (always begins with tiny character)
//reference data types (always begins with big character)
//in primitive data types once they typed in methods java creates a copy of this data type unlike the reference data types and objects