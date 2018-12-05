package main.java.projet_dice_forge.effet_test.EffetImmediat;

import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.Partie_Iles.Iles;
import main.java.projet_dice_forge.Plateau_Joueur.De;
import main.java.projet_dice_forge.Plateau_Joueur.Face;
import main.java.projet_dice_forge.Ressource.Or;
import main.java.projet_dice_forge.Ressource.Ressource;
import main.java.projet_dice_forge.effet.EffetImmediat.LaPince;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


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
        De de = new De("claire");
        Face face = new Face();
        face.AjouterRessource(new Or(1));
        de.ajouterUneFace(face,5);
        joueur.setDe(de,de);
        LaPince laPince = new LaPince();
        Iles ile = new Iles();
        ile.ajouterCarte(laPince);

        assertTrue(!laPince.isActiverOuPas());
        joueur.acheterCarte(ile,laPince);

        joueur.activerEffetCarteImmediat();
        assertNotNull(joueur.getListeCarteEffetImmediat());
        /*
        Nous Reste à prouver si cela marche bien
        fixé des dé
         */

        assertFalse(laPince.isActiverOuPas());
        assertEquals(joueur.getPlateauDuJoueur().getOr(),4);


        assertEquals(8,joueur.getPointDeGloireCarte());




    }
}