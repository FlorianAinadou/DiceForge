package main.java.projet_dice_forge.effet.EffetImmediat;


import main.java.projet_dice_forge.Bot.Bot;
import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.Gestion_du_Jeu.Jeu;
import main.java.projet_dice_forge.Partie_Iles.CarteEffetImmediat;
import main.java.projet_dice_forge.Partie_Iles.CarteEffetImmediatRelJoueur;
import main.java.projet_dice_forge.Plateau_Joueur.Face;
import main.java.projet_dice_forge.Ressource.FragementSolaire;
import main.java.projet_dice_forge.Ressource.Gloire;
import main.java.projet_dice_forge.Ressource.Ressource;

import java.util.ArrayList;

public class LeMinotaure extends CarteEffetImmediatRelJoueur {
    public LeMinotaure() {
        super(9, new Ressource[]{new FragementSolaire(3)}, new Gloire(8), false);
    }

    public void activerEffetImmCarteRealJoueur(Joueur joueur) {

        if (this.isActiverOuPas()) {
            for (Joueur joueur1 : joueur.getAdversaires()) {

                Face claire = joueur1.lanceLeDeClaire();
                Face sombre = joueur1.lanceLeDeSombre();

                for (Ressource ressource : claire.getRessource()) {
                    if (ressource.getIdRessource() == 2) {
                        joueur1.getPlateauDuJoueur().enleverPointDeGloire(claire.getValeurFace());
                    }

                }

                for (Ressource ressource : sombre.getRessource()) {
                    if (ressource.getIdRessource() == 2) {
                        joueur1.getPlateauDuJoueur().enleverPointDeGloire(sombre.getValeurFace());
                    }

                }
            }
        } else {
            System.out.println("lol");
        }
    }
}
