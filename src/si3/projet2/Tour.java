package si3.projet2;

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
        for (int tour =0; tour<nbTour; tour ++){
            joueur1 = FaveurdesDieux(joueur1);
            joueur2 = FaveurdesDieux(joueur2);
        }
    }
    /**
     * Lancer des dés et augmentation des ressources lors de la faveur des dieux
     */
    public PlateauDuJoueur FaveurdesDieux(PlateauDuJoueur joueur){
        this.de1 = joueur.getDe(1);
        this.de2 = joueur.getDe(2);
        joueur = new PlateauDuJoueur(1, joueur.getPointsDeGloire()+de1.lancerLeDe().getNb()+de2.lancerLeDe().getNb());
        return joueur;
    }

}
