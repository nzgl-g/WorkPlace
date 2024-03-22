package TP01_EX01;

public class Etudiant {
     private int matricule;
     private String nom;
     private String spécialité;
    public Etudiant(int m, String n){
        this.matricule=m;
        this.nom=n;
    }
    public Etudiant(int matricule, String nom, String s){
        this.matricule=matricule;
        this.nom=nom;
        this.spécialité=s;
    }
    public int getMatricule() {
        return matricule;
    }

    public String getNom() {
        return nom;
    }
    public String getSpécialité() {
        return spécialité;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setSpécialité(String spécialité) {
        this.spécialité = spécialité;
    }
}

