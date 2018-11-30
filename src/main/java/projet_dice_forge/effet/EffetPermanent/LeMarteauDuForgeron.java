package main.java.projet_dice_forge.effet.EffetPermanent;

import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.Partie_Iles.Carte;
import main.java.projet_dice_forge.Partie_Iles.CarteEffetPermanent;

public class LeMarteauDuForgeron extends CarteEffetPermanent {
    private int nbOrDep=0;



    public LeMarteauDuForgeron() {
        super(3, new int[]{1}, new String[]{"PierredeLune"}, 2, false);
    }

    public void activerEffetCarte(Joueur joueur,int nbPierreOr) {
        if (this.isActiverOuPas()) {
            this.nbOrDep = nbOrDep + nbPierreOr;
            joueur.getPlateauDuJoueur().enleverOr(nbPierreOr);

            if (nbOrDep >= 15) {
                joueur.getPlateauDuJoueur().ajouterPointDeGloire(10);
            } else if (nbPierreOr >= 30) {
                joueur.getPlateauDuJoueur().ajouterPointDeGloire(15);
                joueur.getListeCarte().remove(joueur.ChercherCarte(3));
            }
        }
    }

    @Override
    public void activerEffetCarte(Joueur joueur) {

    }
}
