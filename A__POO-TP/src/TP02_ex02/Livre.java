package TP02_ex02;

public class Livre extends Documents{
    private String editeur;
    private String auteur;
    public Livre(String editeur,String auteur){
        this.auteur=auteur;
        this.editeur=editeur;
    }

    //Getters and setters
    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
}
