package main.java.projet_dice_forge.effet.EffetImmediat;

import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.Partie_Iles.Carte;
import main.java.projet_dice_forge.Partie_Iles.CarteEffetImmediat;
import main.java.projet_dice_forge.Ressource.FragementLunaire;
import main.java.projet_dice_forge.Ressource.Gloire;
import main.java.projet_dice_forge.Ressource.Ressource;

public class LecoffreDuForgeron extends CarteEffetImmediat {

    public LecoffreDuForgeron() {
        super(2, new Ressource[] {new FragementLunaire(1) }, new Gloire(2), false);
    }

    public void activerEffetCarte(Joueur joueur) {
        if (this.isActiverOuPas()) {
            int maxOr = joueur.getPlateauDuJoueur().getMaxOr()+4;
            int maxLun = joueur.getPlateauDuJoueur().getMaxFragLun()+3;
            int maxSolail = joueur.getPlateauDuJoueur().getMaxFragSol()+3;
            joueur.getPlateauDuJoueur().setMaxOr(maxOr);
            joueur.getPlateauDuJoueur().setMaxFragLun(maxLun);
            joueur.getPlateauDuJoueur().setMaxFragSol(maxSolail);

        }
    }
}
