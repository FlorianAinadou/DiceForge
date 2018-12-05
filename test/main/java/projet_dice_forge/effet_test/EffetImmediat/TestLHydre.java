package main.java.projet_dice_forge.effet_test.EffetImmediat;

import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.Partie_Iles.Iles;
import main.java.projet_dice_forge.Ressource.Ressource;
import main.java.projet_dice_forge.effet.EffetImmediat.LHydre;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestLHydre {
    @Test
    public void LHydre(){
        LHydre hydre = new LHydre();
        Ressource[] ressources = hydre.getPrix();

        assertEquals(ressources[0].getTypeRessource(),"FragementLunaire" );
        assertEquals(ressources[0].getNbRessources(), 5);
        assertEquals(ressources[1].getTypeRessource(),"FragementSolaire" );
        assertEquals(ressources[1].getNbRessources(), 5);
        assertEquals(hydre.getPointDeGloire().getNbRessources(),26);
    }

    @Test
    public void activerEffetCarte(){
        Joueur joueur = new Joueur(1);
        LHydre hydre = new LHydre();
        Iles ile = new Iles();

        ile.ajouterCarte(hydre);
        assertEquals(hydre.isActiverOuPas(),false);

        joueur.acheterCarte(ile,hydre);

        joueur.activerEffetCarteImmediat();

        assertEquals(hydre.isActiverOuPas(),false);
        assertEquals(26,joueur.getPointDeGloireCarte());



    }
}


