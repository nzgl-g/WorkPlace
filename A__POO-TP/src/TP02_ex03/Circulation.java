package TP02_ex03;

public class Circulation {
    public static void main(String[] args) {
        Object a = new Automobile(0, 50);//Object is te super class of all classes in java
        Object v = new Velo(0, "VTT");
        Vehicule vh = new Vehicule(3, 10);
        Conducteur c = new Conducteur("Karim", "1234567", 20);
        c.conduit((Vehicule) a);
        c.conduit((Vehicule) v);
        vh.accelere(10);
        ((Automobile) vh).faitLePlein(10);//Error on casting
    }
}
