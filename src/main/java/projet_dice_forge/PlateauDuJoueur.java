package main.java.projet_dice_forge;


/**
*Cette classe représente le plateau d'un joueur de Dice Forge.
 */
public class PlateauDuJoueur{

        //l'Identifiant du joueur concerné.
        private int idJoueur;
        //Les points de gloire du joueur concerné.
        private int pointsDeGloire;
        //L'or dont dispose le joueur concerné.
        private int or;




    /**
     * Crée un plateau qui rassemble les informations correspondantes à un joueur
     *
     * @param idJoueur identifiant du joueur concerné.
     * @param pointsDeGloire ponits de goire du joueur concerné.
     * @param or ressoure or du joueur concerné.
     *
     */



    PlateauDuJoueur(int idJoueur, int pointsDeGloire, int or){
        this.pointsDeGloire=pointsDeGloire;
        this.idJoueur=idJoueur;
        this.or=or;

    }

    PlateauDuJoueur(int idJoueur){
        this.pointsDeGloire=0;
        this.idJoueur=idJoueur;
        this.or=0;
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

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    ////////////////////////////////////////*Traitement Point d'Or *///////////////////////////////////////////////////



    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * permet de définir le joueur concerné
     * @param idJoueur
     */
    public void setJoueur(int idJoueur) {
        this.idJoueur = idJoueur;
    }


    public int getIdJoueur(){return this.idJoueur;}

    /**
     *getter et setter pour la ressource or
     */
    public int getOr(){
        return or;
    }

    public void setOr(int or){
        this.or=or;
    }



}
