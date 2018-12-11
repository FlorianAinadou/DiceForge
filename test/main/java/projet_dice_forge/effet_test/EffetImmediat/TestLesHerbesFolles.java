package main.java.projet_dice_forge.effet_test.EffetImmediat;


import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.Partie_Iles.Iles;
import main.java.projet_dice_forge.Ressource.Ressource;
import main.java.projet_dice_forge.effet.EffetImmediat.LesHerbesFolles;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestLesHerbesFolles {


    @Test
    public void LesHerbesFolles(){
        LesHerbesFolles lesHerbesFolles = new LesHerbesFolles();
        Ressource[] ressources = lesHerbesFolles.getPrix();

        assertEquals(ressources[0].getTypeRessource(),"FragementSolaire" );
        assertEquals(ressources[0].getNbRessources(), 1);
        assertEquals(lesHerbesFolles.getPointDeGloire().getNbRessources(),2);
    }

    @Test
    public void activerEffetCarte(){
        Joueur joueur = new Joueur(1);
        LesHerbesFolles lesHerbesFolles = new LesHerbesFolles();
        Iles ile = new Iles();

        ile.ajouterCarte(lesHerbesFolles);
        assertEquals(lesHerbesFolles.isActiverOuPas(),false);

        joueur.acheterCarte(ile,lesHerbesFolles);
        assertEquals(lesHerbesFolles.isActiverOuPas(),true);
        joueur.activerEffetCarteImmediat();
        assertEquals(3,joueur.getPlateauDuJoueur().getOr());
        assertEquals(3,joueur.getPlateauDuJoueur().getFragmentLunaire());

        assertEquals(lesHerbesFolles.isActiverOuPas(),false);
        assertEquals(2,joueur.getPlateauDuJoueur().getPointsDeGloire());


    }

}