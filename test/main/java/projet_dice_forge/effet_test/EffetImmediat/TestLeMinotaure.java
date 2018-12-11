

package main.java.projet_dice_forge.effet_test.EffetImmediat;
import main.java.projet_dice_forge.Bot.Bot;
import main.java.projet_dice_forge.Bot.Emeline;

import main.java.projet_dice_forge.Gestion_du_Jeu.Jeu;
import main.java.projet_dice_forge.Partie_Iles.Iles;

import main.java.projet_dice_forge.Ressource.Ressource;
import main.java.projet_dice_forge.effet.EffetImmediat.LeMinotaure;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class TestLeMinotaure {
    @Test
    public void LeMinotaure() {

        LeMinotaure leMinotaure = new LeMinotaure();
        Ressource[] ressources = leMinotaure.getPrix();

        assertEquals(ressources[0].getTypeRessource(), "FragementSolaire");
        assertEquals(ressources[0].getNbRessources(), 3);
        assertEquals(leMinotaure.getPointDeGloire().getNbRessources(), 8);
    }

    @Test
    public void activerEffetCarte(){
        Bot joueur1 = new Emeline(1);
        Bot joueur2 = new Emeline(2);

        Bot listJoueurs[]={joueur1,joueur2};
        Jeu jeu = new Jeu(2,listJoueurs);
        LeMinotaure leMinotaure = new LeMinotaure();
        Iles ile = new Iles();
        ile.ajouterCarte(leMinotaure);

        joueur2.getPlateauDuJoueur().ajouterPointDeGloire(20);


        assertTrue(!leMinotaure.isActiverOuPas());
        joueur1.acheterCarte(ile,leMinotaure);
        //assertTrue(joueur1.get.get(0).isActiverOuPas());
        joueur1.activerEffetCarteImmRealJoueur();
        /*
        System.out.println(joueur1.getPlateauDuJoueur().getOr());
        */
        System.out.println(joueur2.getPlateauDuJoueur().getPointsDeGloire());

        assertFalse(joueur1.getListeCarteEffetImmRealJoueur().get(0).isActiverOuPas());


        assertEquals(8,joueur1.getPlateauDuJoueur().getPointsDeGloire());






    }
}

