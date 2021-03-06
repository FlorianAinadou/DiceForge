package main.java.projet_dice_forge.effet_test.EffetImmediat;

import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.Partie_Iles.Iles;
import main.java.projet_dice_forge.Ressource.Ressource;
import main.java.projet_dice_forge.effet.EffetImmediat.LEnigme;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestLEnigme {


    @Test
    public void LEnigme(){
        LEnigme enigme = new LEnigme();
        Ressource[] ressources = enigme.getPrix();

        assertEquals(ressources[0].getTypeRessource(),"FragementSolaire" );
        assertEquals(ressources[0].getNbRessources(), 6);
        assertEquals(enigme.getPointDeGloire().getNbRessources(),10);
    }

    @Test
    public void activerEffetCarte(){
        Joueur joueur = new Joueur(1);
        LEnigme enigme = new LEnigme();
        Iles ile = new Iles();

        ile.ajouterCarte(enigme);


        joueur.acheterCarte(ile,enigme);
        assertEquals(enigme.isActiverOuPas(),true);
        joueur.activerEffetCarteImmediat();

        /*
        Nous Reste à prouver si cela marche bien
        fixé des dé
         */

        assertFalse(enigme.isActiverOuPas());
        assertTrue(10 <= joueur.getPlateauDuJoueur().getPointsDeGloire() && joueur.getPlateauDuJoueur().getPointsDeGloire() <= 14);



    }
}

