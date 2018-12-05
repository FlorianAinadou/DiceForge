package main.java.projet_dice_forge.effet_test.EffetPermanent;

import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.Partie_Iles.Iles;
import main.java.projet_dice_forge.Ressource.Ressource;
import main.java.projet_dice_forge.effet.EffetImmediat.LecoffreDuForgeron;
import main.java.projet_dice_forge.effet.EffetPermanent.LAncien;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LAncienTest {

    @Test
    void LAncien(){
        LAncien lAncien = new LAncien();
        assertEquals(lAncien.getIdCarte(),10);
        assertEquals(lAncien.getPointDeGloire().getNbRessources(),0);


    }
    @Test
    void activerEffetCartePerm(){
        Joueur joueur = new Joueur(1);
        LAncien lAncien = new LAncien();
        Iles ile = new Iles();
        ile.ajouterCarte(lAncien);
        joueur.acheterCarte(ile, lAncien);
        for(int i =0; i<9;i++) {
            joueur.getPlateauDuJoueur().ajouterOr(3);
            joueur.activerEffetCartePermanent();
            assertTrue(joueur.getListeCarteEffetPermanent().get(0).isActiverOuPas());
            assertEquals(0,joueur.getPlateauDuJoueur().getOr());
            assertEquals(4*(i+1), joueur.getPtGloire());
        }

    }
}
