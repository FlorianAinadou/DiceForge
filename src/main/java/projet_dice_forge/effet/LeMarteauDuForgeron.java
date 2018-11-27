package main.java.projet_dice_forge.effet;

import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.Partie_Iles.Carte;

public class LeMarteauDuForgeron extends Carte {
    private int nbOrDep=0;



    public LeMarteauDuForgeron() {
        super(3, new int[]{1}, new String[]{"fragementLunaire"}, 2, false);
    }

    public void activerEffetCarte(Joueur joueur,int nbPierreOr) {
        this.nbOrDep=nbOrDep+nbPierreOr;
        joueur.getPlateauDuJoueur().enleverOr(nbPierreOr);

        if(nbOrDep>=15){
            joueur.getPlateauDuJoueur().ajouterPointDeGloire(10);
        }
        else if(nbPierreOr >= 30){
            joueur.getPlateauDuJoueur().ajouterPointDeGloire(15);
            joueur.getListeCarte().remove(joueur.ChercherCarte(3));
        }
    }
}
