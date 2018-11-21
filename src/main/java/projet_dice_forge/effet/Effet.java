package main.java.projet_dice_forge.effet;



import main.java.projet_dice_forge.Partie_Iles.Carte;
import main.java.projet_dice_forge.Plateau_Joueur.Joueur;


public class Effet  {
     Joueur joueur;
     Carte carte;

    Effet(Joueur joueur, Carte carte){
        this.joueur=joueur;
        this.carte=carte;
    }


    void attributionPointDeGloire(){
        int pointDeGloireCarte= carte.getPointDeGloire();
        joueur.getPlateauDuJoueur().ajouterPointDeGloire(pointDeGloireCarte);

    }


    public void setCarte(Carte carte) {
        this.carte = carte;
    }

    public void setJoueur(Joueur joueur) {
        this.joueur = joueur;
    }

    public Carte getCarte() {
        return carte;
    }

    public Joueur getJoueur() {
        return joueur;
    }
    void AppliqueEffetCarte(){

    }
}
