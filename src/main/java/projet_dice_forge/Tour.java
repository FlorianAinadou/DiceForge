package main.java.projet_dice_forge;

public class Tour {

    private PlateauDuJoueur joueur1;
    private PlateauDuJoueur joueur2;
    private De de1;
    private De de2;
    private int nbTour =9;

    /**
     * Crée une nouvelle série de tour avec les actions nécessaires
     */

    public Tour(PlateauDuJoueur joueur1,PlateauDuJoueur joueur2 ){
        for (int tour =0; tour<nbTour; tour++){
            System.out.println("Tour " + (tour+1));
            FaveurdesDieux(joueur1);
            FaveurdesDieux(joueur2);
        }
    }
    /**
     * Lancer des dés et augmentation des ressources lors de la faveur des dieux
     */
    public void FaveurdesDieux(PlateauDuJoueur joueur){
        this.de1 = joueur.getDe(1);
        this.de2 = joueur.getDe(2);

        int val1=de1.lancerLeDe().getNb();
        int val2=de2.lancerLeDe().getNb();
        joueur.setPointsDeGloire(joueur.getPointsDeGloire()+val1+val2);

        System.out.print(" Le joueur " + joueur.getIdJoueur() + " lance les dés    ");
        System.out.print("Dé 1: " + val1 + "   ");
        System.out.print("Dé 2: " + val2 + "   ");


        System.out.println("Nombre de points de gloire actuels: " + joueur.getPointsDeGloire());
    }

}
