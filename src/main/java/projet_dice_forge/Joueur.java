package main.java.projet_dice_forge;

public class Joueur {
    private int id;
    private PlateauDuJoueur plateau;
    private De deClaire;
    private De deSombre;


    public Joueur(int id,PlateauDuJoueur plateau,De deClaire,De deSombre) {
        this.id = id;
        this.plateau=plateau;
        this.deSombre=deSombre;
        this.deClaire=deClaire;
    }

    /**
     * permet de définir les dés du joueur concerné
     * @param de1
     * @param de2
     */
    public void setDe(De de1,De de2 ){
        this.deClaire = de1;
        this.deSombre = de2;
    }
    /**
     * Retourne les dés du joueur concerné
     *
     */
    public De getDe(int idDe){
        if(idDe == 1){
            return deClaire;
        }
        else{
            return deSombre;
        }
    }

}
