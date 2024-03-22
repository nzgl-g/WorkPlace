package TP02_ex01;

public class Main {
    public static void main(String[] args) {
        C1 a=new C5();
        C1 b;
        C1 c=a;
        //error ->
        C1 d =new C4();
        b=a;
        b=new C6();
        c=b;
        //error ->
        d=b;
        C4 e;
        b=new C5();
        e= (C4) b;
    }
}
