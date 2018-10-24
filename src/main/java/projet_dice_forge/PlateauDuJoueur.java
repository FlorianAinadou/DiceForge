package main.java.projet_dice_forge;


/**
*Cette classe représente le plateau d'un joueur de Dice Forge.
 */
public class PlateauDuJoueur {

        //l'Identifiant du joueur concerné.
        private int idJoueur;
        //Les points de gloire du joueur concerné.
        private int pointsDeGloire;
        //Les dés du joueur concerné.


    /**
     * Crée un plateau qui rassemble les informations correspondantes à un joueur
     *
     * @param idJoueur identifiant du joueur concerné.
     * @param pointsDeGloire ponits de goire du joueur concerné.
     * de1 et de2 de nouveaux dés du joueur concerné.
     */



    PlateauDuJoueur(int idJoueur, int pointsDeGloire){
        this.pointsDeGloire=pointsDeGloire;
        this.idJoueur=idJoueur;
    }

    PlateauDuJoueur(int idJoueur){
        this.pointsDeGloire=0;
        this.idJoueur=idJoueur;
    }

    /**
     * Retourne les points de gloire du joueur
     */

    public int getPointsDeGloire() {
        return pointsDeGloire;
    }

    /**
     * Permet de modifier les points de gloire du joueur
     * @param pointsDeGloire
     */
    public void setPointsDeGloire(int pointsDeGloire) {
        this.pointsDeGloire = pointsDeGloire;
    }

    /**
     * permet de définir le joueur concerné
     * @param idJoueur
     */
    public void setJoueur(int idJoueur) {
        this.idJoueur = idJoueur;
    }



}
