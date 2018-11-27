package main.java.projet_dice_forge.effet;

import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.Partie_Iles.Carte;

public class LecoffreDuForgeron extends Carte {

    public LecoffreDuForgeron() {
        super(2, new int[]{1}, new String[]{"PierredeLune"}, 2, false,1);
    }

    public void activerEffetCarte(Joueur joueur) {
        if (this.isActiverOuPas()) {
            int maxOr = joueur.getPlateauDuJoueur().getMaxOr();
            int maxLun = joueur.getPlateauDuJoueur().getMaxFragLun();
            int maxSolail = joueur.getPlateauDuJoueur().getMaxFragSol();
            joueur.getPlateauDuJoueur().setMaxOr(maxOr);
            joueur.getPlateauDuJoueur().setFragmentLunaire(maxLun);
            joueur.getPlateauDuJoueur().setFragmentSolaire(maxSolail);

        }
    }
}
