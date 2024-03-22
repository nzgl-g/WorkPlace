package TP01_EX01;

public class TestEtudiant {
    public static void main(String[] arg) {
        Etudiant etud1 = new Etudiant(32016609,"Ahmed");
        Etudiant etud2 = new Etudiant(299,"Ahmed");
        etud1.setSpécialité("Informatique");
        Etudiant etud3 = new Etudiant(288,"Ali","Math");
        etud2.setSpécialité(etud1.getSpécialité());
        System.out.println(etud1.getNom()+" "+etud1.getNom());
        System.out.println(etud2.getNom()+" "+etud2.getNom());
        etud2.setSpécialité("Droit");
    }
}