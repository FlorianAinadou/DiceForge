package main.java.projet_dice_forge.effet_test.EffetImmediat;


import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.Partie_Iles.Iles;
import main.java.projet_dice_forge.Ressource.Ressource;
import main.java.projet_dice_forge.effet.EffetImmediat.LecoffreDuForgeron;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class LeCoffreDuForgeronTest {

    @Test
    void LeCoffreDuForgeron(){
        LecoffreDuForgeron lecoffreDuForgeron = new LecoffreDuForgeron();
        Ressource[] ressources = lecoffreDuForgeron.getPrix();
        assertEquals(ressources[0].getTypeRessource(),"FragementLunaire" );
        assertEquals(ressources[0].getNbRessources(), 1);
        assertEquals(lecoffreDuForgeron.getPointDeGloire().getNbRessources(),2);
    }
    @Test
    void activerEffetCarte(){
        Joueur joueur = new Joueur(1);
        LecoffreDuForgeron lecoffreDuForgeron = new LecoffreDuForgeron();
        Iles ile = new Iles();
        ile.ajouterCarte(lecoffreDuForgeron);
        assertEquals(lecoffreDuForgeron.isActiverOuPas(),false);
        joueur.acheterCarte(ile,lecoffreDuForgeron);
        joueur.activerEffetCarteImmediat();
        assertEquals(joueur.getPlateauDuJoueur().getMaxOr(),16);
        assertEquals(joueur.getPlateauDuJoueur().getMaxFragLun(),9);
        assertEquals(joueur.getPlateauDuJoueur().getMaxFragSol(),9);


    }
}
