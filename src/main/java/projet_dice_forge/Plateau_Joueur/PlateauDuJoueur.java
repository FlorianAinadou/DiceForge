package main.java.projet_dice_forge.Plateau_Joueur;


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

        private int fragmentSolaire;

        private int fragmentLunaire;

        private int maxOr = 25;

        private int maxGloire = 25;

        private int maxFragLun =25;

        private int maxFragSol=25;




    /**
     * Crée un plateau qui rassemble les informations correspondantes à un joueur
     *
     * @param idJoueur identifiant du joueur concerné.
     * @param pointsDeGloire ponits de goire du joueur concerné.
     * @param or ressoure or du joueur concerné.
     *
     */



    PlateauDuJoueur(int idJoueur, int pointsDeGloire, int or,int fragmentSolaire,int fragmentLunaire){
        this.pointsDeGloire=pointsDeGloire;
        this.idJoueur=idJoueur;
        this.or=or;
        this.fragmentSolaire=fragmentSolaire;
        this.fragmentLunaire=fragmentLunaire;

    }

    PlateauDuJoueur(int idJoueur){
        this.pointsDeGloire=0;
        this.idJoueur=idJoueur;
        this.or=0;
        this.fragmentSolaire=0;
        this.fragmentLunaire=0;
    }
    ////////////////////////////////////////*Traitement Point de gloire *///////////////////////////////////////////////////
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

    /**
     *getter et setter pour la ressource or
     */
    public int getOr(){
        return or;
    }

    public void setOr(int or){
        this.or=or;
    }

    public void setMaxOr(int maxOr) {
        this.maxOr = maxOr;
    }

    public int getMaxOr() {
        return maxOr;
    }
    /////////////////////////////////////////////Taitement Joueur/////////////////////////////////////////////////////

    /**
     * permet de définir le joueur concerné
     * @param idJoueur
     */
    public void setJoueur(int idJoueur) {
        this.idJoueur = idJoueur;
    }


    public int getIdJoueur(){return this.idJoueur;}

    ////////////////////////////////////////*Traitement fragement Lunaire et Solaire *///////////////////////////////////////////////////


    public int getFragmentLunaire() {
        return fragmentLunaire;
    }

    public int getFragmentSolaire() {
        return fragmentSolaire;
    }

    public void setFragmentSolaire(int fragmentSolaire) {
        this.fragmentSolaire = fragmentSolaire;
    }

    public void setFragmentLunaire(int fragmentLunaire) {
        this.fragmentLunaire = fragmentLunaire;
    }


    public int getMaxFragLun() {
        return maxFragLun;
    }

    public int getMaxFragSol() {
        return maxFragSol;
    }

    public void setMaxFragSol(int maxFragSol) {
        this.maxFragSol = maxFragSol;
    }

    public void setMaxFragLun(int maxFragLun) {
        this.maxFragLun = maxFragLun;
    }

    public void ajoutFragLun(int fragLun){
        if((this.fragmentLunaire + fragLun)> this.maxFragLun) {
            this.fragmentLunaire = this.maxFragLun;
        }
        else {
            this.fragmentLunaire += fragLun;
        }
    }

    public void ajoutFragSol(int fragSol){
        if((this.fragmentSolaire + fragSol)> this.maxFragSol) {
            this.fragmentSolaire = this.maxFragSol;
        }
        else {
            this.fragmentSolaire += fragSol;
        }
    }


}
