package main.java.projet_dice_forge.Effet.EffetImmediat;

import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.Partie_Iles.Carte;
import main.java.projet_dice_forge.Partie_Iles.CarteEffetImmediat;

public class LecoffreDuForgeron extends CarteEffetImmediat {

    public LecoffreDuForgeron() {
        super(2, new int[]{1}, new String[]{"PierredeLune"}, 2, false);
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
