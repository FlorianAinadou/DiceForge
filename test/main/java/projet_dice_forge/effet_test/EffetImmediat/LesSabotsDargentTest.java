package main.java.projet_dice_forge.effet_test.EffetImmediat;

import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.Partie_Iles.Iles;
import main.java.projet_dice_forge.Ressource.Ressource;
import main.java.projet_dice_forge.effet.EffetPermanent.LesSabotsDargent;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class LesSabotsDargentTest {

     @Test
     void LesSabotsDargent(){
         LesSabotsDargent lesSabotsDargent = new LesSabotsDargent();
         Ressource[] ressources = lesSabotsDargent.getPrix();
        assertEquals(ressources[0].getTypeRessource(),"FragementLunaire" );
        assertEquals(ressources[0].getNbRessources(), 2);
        assertEquals(lesSabotsDargent.getPointDeGloire().getNbRessources(),2);
     }

     @Test
    void activerEffetCarte(){
         Joueur joueur = new Joueur(1);
         LesSabotsDargent lesSabotsDargent = new LesSabotsDargent();
         Iles ile = new Iles();
         ile.ajouterCarte(lesSabotsDargent);
         assertEquals(lesSabotsDargent.isActiverOuPas(),false);
         joueur.acheterCarte(ile,lesSabotsDargent);
         joueur.activerEffetCarteImmediat();
         assertEquals(1,joueur.getPlateauDuJoueur().getOr());
         assertEquals(lesSabotsDargent.isActiverOuPas(),true);


     }

}
