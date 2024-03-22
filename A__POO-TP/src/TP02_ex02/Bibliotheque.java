package TP02_ex02;

public class Bibliotheque {
    Documents[] documents;
    private int nbr;
    private int i=0;
    public Bibliotheque(int nbr){
        this.nbr=nbr;
        this.documents=new Documents[nbr];
    }
    public void ajouter(Documents d){
        documents[i]=d;
        i++;
    }
}
