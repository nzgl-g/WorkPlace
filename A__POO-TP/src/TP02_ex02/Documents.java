package TP02_ex02;
public class Documents {
    private String titre;
    private int nbr=0;
    public Documents(String titre){
        this.titre=titre;
        nbr++;
    }
    public  Documents(){}
    public void affiche(){

    }



    //getters and setters
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getNbr() {
        return nbr;
    }
}
