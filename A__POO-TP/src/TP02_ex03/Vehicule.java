package TP02_ex03;

public class Vehicule {
    protected int nbDeRoues;
    protected int vitesse;

    public Vehicule(int roues, int vitesseInitiale) {
        nbDeRoues = roues;
        vitesse = vitesseInitiale;
    }

    public void accelere(int dv) {
        vitesse += dv;
        System.out.println("je bouge! Nouvelle vitesse : " + vitesse);
    }
}