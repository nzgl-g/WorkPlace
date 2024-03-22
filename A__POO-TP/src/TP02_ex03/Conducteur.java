package TP02_ex03;

public class Conducteur {
    private String nom;
    private String numeroPermis;
    private int acceleration;

    public Conducteur(String nom, String numeroPermis, int acceleration) {
        this.nom = nom;
        this.numeroPermis = numeroPermis;
        this.acceleration = acceleration;
    }

    public void conduit(Vehicule v) {
        System.out.println("je suis " + nom + " et je conduis un véhicule ");
        v.accelere(acceleration);
    }
}