package si3.projet2;


/**
*Cette classe représente le plateau d'un joueur de Dice Forge.
 */
public class PlateauDuJoueur {

        //l'Identifiant du joueur concerné.
        private int idJoueur;
        //Les points de gloire du joueur concerné.
        private int pointsDeGloire;
        //Les dés du joueur concerné.
        private De de1;
        private De de2;


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
        this.de1 = new De();
        this.de2 = new De();
    }

    /**
     * Retourne les points de gloire du joueur
     */

    public int getPointsDeGloire() {
        return pointsDeGloire;
    }

    /**
     * Retourne l'identifiant du joueur
     */
    public int getIdJoueur(){
        return idJoueur;
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

    /**
     * permet de définir les dés du joueur concerné
     * @param de1
     * @param de2
     */
    public void setDe(De de1,De de2 ){
        this.de1 = de1;
        this.de2 = de2;
    }
    /**
     * Retourne les dés du joueur concerné
     *
     */
    public De getDe(int idDe){
        if(idDe == 1){
            return de1;
        }
        else{
            return de2;
        }
    }

}
