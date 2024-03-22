package Abstraction.AbstactClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        Lamborgini lambo = new Lamborgini();
        lambo.setcarColor("yello");
        lambo.setEngineCapacity(6.8);
        String model;
        lambo.setModel( model = scan.nextLine());
        lambo.setHorsePower(800);

}}
