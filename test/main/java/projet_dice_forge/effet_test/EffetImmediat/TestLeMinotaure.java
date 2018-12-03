

package main.java.projet_dice_forge.effet_test.EffetImmediat;

import main.java.projet_dice_forge.Bot.Bot;
import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.Gestion_du_Jeu.Jeu;
import main.java.projet_dice_forge.Partie_Iles.Iles;
import main.java.projet_dice_forge.Ressource.Ressource;
import main.java.projet_dice_forge.effet.EffetImmediat.LaPince;
import main.java.projet_dice_forge.effet.EffetImmediat.LeMinotaure;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
        Bot joueur1 = new Bot(1);
        Bot joueur2 = new Bot(2);
        Bot joueur3 = new Bot(3);
        Bot listJoueurs[]={joueur1,joueur2,joueur3};
        Jeu jeu = new Jeu(3,listJoueurs);
        LeMinotaure leMinotaure = new LeMinotaure();
        Iles ile = new Iles();
        ile.ajouterCarte(leMinotaure,2);

        assertTrue(!leMinotaure.isActiverOuPas());
        joueur1.acheterCarte(ile,leMinotaure);

        joueur1.activerEffetCarteImmRealJoueur();


        assertTrue(leMinotaure.isActiverOuPas());


        assertEquals(8,joueur1.getPointDeGloireCarte());






    }
}

