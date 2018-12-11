package main.java.projet_dice_forge.effet_test.EffetImmediat;

import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.Partie_Iles.Iles;
import main.java.projet_dice_forge.Plateau_Joueur.De;
import main.java.projet_dice_forge.Plateau_Joueur.Face;
import main.java.projet_dice_forge.Ressource.Or;
import main.java.projet_dice_forge.Ressource.Ressource;
import main.java.projet_dice_forge.effet.EffetPermanent.LesSabotsDargent;

import org.junit.Test;
import static org.junit.Assert.assertEquals;



class LesSabotsDargentTest {

     @Test
     public void LesSabotsDargent(){
         LesSabotsDargent lesSabotsDargent = new LesSabotsDargent();
         Ressource[] ressources = lesSabotsDargent.getPrix();
        assertEquals(ressources[0].getTypeRessource(),"FragementLunaire" );
        assertEquals(ressources[0].getNbRessources(), 2);
        assertEquals(lesSabotsDargent.getPointDeGloire().getNbRessources(),2);
     }

     @Test
    public void activerEffetCarte(){
         Joueur joueur = new Joueur(1);
         De de = new De("claire");
         Face face = new Face();
         Or or = new Or(1);
         face.AjouterRessource(or);
         de.ajouterUneFace(face,5);
         joueur.setDe(de,de);
         LesSabotsDargent lesSabotsDargent = new LesSabotsDargent();
         Iles ile = new Iles();
         ile.ajouterCarte(lesSabotsDargent);
         assertEquals(lesSabotsDargent.isActiverOuPas(),false);
         joueur.acheterCarte(ile,lesSabotsDargent);
         joueur.activerEffetCartePermanent();
         assertEquals(1,joueur.getPlateauDuJoueur().getOr());
         assertEquals(lesSabotsDargent.isActiverOuPas(),true);
     }

}
