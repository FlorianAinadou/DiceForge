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

        private int maxOr = 25;

        private int maxGloire = 25;




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

    public void ajouterOr(int or) {
        if((this.or + or)> this.maxOr) {
            this.or = this.maxOr;
        }
        else {
            this.or += or;
        }
    }

    public void enleverOr(int or) {
        if((this.or - or) >= 0 ) {
            this.or -= or;
        }
        else {
            System.out.println("Error : Vous avez tenter de retirer trop d'or");
            System.exit(0);
        }
    }

    public void ajouterPointDeGloire(int ptGloire) {
        if((this.pointsDeGloire + ptGloire)> this.maxGloire) {
            this.pointsDeGloire = this.maxGloire;
        }
        else {
            this.pointsDeGloire += ptGloire;
        }
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

    public void setOr(int or) {
        if (or >= 12) {
            this.or = 12;
        } else {
            this.or = or;
        }
    }

    void reset() {
        this.or = 0;
        this.pointsDeGloire = 0;
    }

}
