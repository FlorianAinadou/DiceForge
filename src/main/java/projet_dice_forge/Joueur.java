package main.java.projet_dice_forge;

public class Joueur {
    private int id;
    private De DeClaire;
    private De DeSombre;
    private PlateauDuJoueur Plateau;


    public Joueur(int Idjoueur){
        this.id=Idjoueur;
        this.DeClaire=new De();
        this.DeSombre=new De();
        this.Plateau=new PlateauDuJoueur(Idjoueur);
    }

    public Joueur(int Idjoueur, De de1, De de2, PlateauDuJoueur Plateau){
        this.id=Idjoueur;
        this.DeClaire=de1;
        this.DeSombre=de2;
        this.Plateau=Plateau;
    }
    /**
     * permet de définir les dés du joueur concerné
     * @param de1
     * @param de2
     */
    public void setDe(De de1,De de2 ){
        this.DeClaire = de1;
        this.DeSombre = de2;
    }
    /**
     * Retourne les dés du joueur concerné
     *
     */
    public De getDe(int idDe){
        if(idDe == 1){
            return DeClaire;
        }
        else{
            return DeSombre;
        }
    }
    public  PlateauDuJoueur getPlateauDuJoueur(){
        return Plateau;
    }

    /**
     * Retourne l'identifiant du joueur
     */
    public int getIdJoueur(){
        return id;
    }
}
