package main.java.projet_dice_forge.effet_test.EffetImmediat;
import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.Partie_Iles.Iles;
import main.java.projet_dice_forge.Ressource.Ressource;
import main.java.projet_dice_forge.effet.EffetImmediat.LePasseur;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TestLePasseur {

        @Test
        public void LHydre(){
            LePasseur lePasseur  = new LePasseur();
            Ressource[] ressources = lePasseur.getPrix();


            assertEquals(ressources[0].getTypeRessource(),"FragementLunaire" );
            assertEquals(ressources[0].getNbRessources(), 4);
            assertEquals(lePasseur.getPointDeGloire().getNbRessources(),12);
        }

        @Test
        public void activerEffetCarte(){
            Joueur joueur = new Joueur(1);
            LePasseur lePasseur  = new LePasseur();
            Iles ile = new Iles();

            ile.ajouterCarte(lePasseur);
            assertEquals(lePasseur.isActiverOuPas(),false);

            joueur.acheterCarte(ile,lePasseur);
            assertEquals(lePasseur.isActiverOuPas(),true);
            joueur.activerEffetCarteImmediat();

            assertEquals(lePasseur.isActiverOuPas(),false);
            assertEquals(12,joueur.getPlateauDuJoueur().getPointsDeGloire());



        }
}


