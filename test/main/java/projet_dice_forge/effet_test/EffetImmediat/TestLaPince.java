package main.java.projet_dice_forge.effet_test.EffetImmediat;

import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.Partie_Iles.Iles;
import main.java.projet_dice_forge.Ressource.Ressource;
import main.java.projet_dice_forge.effet.EffetImmediat.LaPince;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;



public class TestLaPince {


    @Test
    public void LaPince(){
        LaPince laPince = new LaPince();
        Ressource[] ressources = laPince.getPrix();

        assertEquals(ressources[0].getTypeRessource(),"FragementLunaire" );
        assertEquals(ressources[0].getNbRessources(), 6);
        assertEquals(laPince.getPointDeGloire().getNbRessources(),8);
    }

    @Test
    public void activerEffetCarte(){
        Joueur joueur = new Joueur(1);
        LaPince laPince = new LaPince();
        Iles ile = new Iles();
        ile.ajouterCarte(laPince);

        assertTrue(!laPince.isActiverOuPas());
        joueur.acheterCarte(ile,laPince);
        assertTrue(laPince.isActiverOuPas());
        joueur.activerEffetCarteImmediat();
        assertFalse(laPince.isActiverOuPas());
        /*
        Nous Reste à prouver si cela marche bien
        fixé des dé
         */


        assertTrue(8 <= joueur.getPlateauDuJoueur().getPointsDeGloire() && joueur.getPlateauDuJoueur().getPointsDeGloire() <= 12);


    }
}