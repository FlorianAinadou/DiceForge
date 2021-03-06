package main.java.projet_dice_forge.effet_test.EffetImmediat;

import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.Partie_Iles.Iles;
import main.java.projet_dice_forge.effet.EffetImmediat.LaMeduse;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;


public class TestLaMeduse {

    @Test
    public void LaMeduse(){
        Joueur joueur = new Joueur(1);
        LaMeduse laMeduse = new LaMeduse();LaMeduse laMeduse1 = new LaMeduse();
        Iles iles = new Iles();
        iles.ajouterCarte(laMeduse);iles.ajouterCarte(laMeduse1);

        joueur.acheterCarte(iles,laMeduse); // achat d'une première carte par le joueur
        assertNotNull(joueur.getListeCarteEffetImmediat()); // vérification liste contient le
        assertTrue(joueur.getListeCarteEffetImmediat().get(0).isActiverOuPas());
        assertEquals(14,joueur.getPlateauDuJoueur().getPointsDeGloire());
        joueur.activerEffetCarteImmediat();
        assertFalse(joueur.getListeCarteEffetImmediat().get(0).isActiverOuPas());


        joueur.acheterCarte(iles,laMeduse1);
        assertTrue(joueur.getListeCarteEffetImmediat().get(1).isActiverOuPas());
        assertFalse(joueur.getListeCarteEffetImmediat().get(0).isActiverOuPas());
        joueur.activerEffetCarteImmediat();
        assertFalse(joueur.getListeCarteEffetImmediat().get(1).isActiverOuPas());
        assertEquals(28,joueur.getPlateauDuJoueur().getPointsDeGloire());

    }
}
