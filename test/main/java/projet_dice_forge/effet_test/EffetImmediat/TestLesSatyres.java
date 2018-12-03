
package main.java.projet_dice_forge.effet_test.EffetImmediat;
import main.java.projet_dice_forge.Bot.Bot;
import main.java.projet_dice_forge.Bot.Emeline;

import main.java.projet_dice_forge.Gestion_du_Jeu.Jeu;
import main.java.projet_dice_forge.Partie_Iles.Iles;
import main.java.projet_dice_forge.Ressource.Ressource;


import main.java.projet_dice_forge.effet.EffetImmediat.LesSatyres;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;


public class TestLesSatyres {
    @Test
    public void TestLesSatyres() {

        LesSatyres lesSatyres = new LesSatyres();
        Ressource[] ressources = lesSatyres.getPrix();

        assertEquals(ressources[0].getTypeRessource(), "FragementLunaire");
        assertEquals(ressources[0].getNbRessources(), 3);
        assertEquals(lesSatyres.getPointDeGloire().getNbRessources(), 6);
    }

    @Test
    public void activerEffetCarte(){
        Bot joueur1 = new Emeline(1);
        Bot joueur2 = new Emeline(2);

        Bot listJoueurs[]={joueur1,joueur2};
        Jeu jeu = new Jeu(2,listJoueurs);
        LesSatyres lesSatyres = new LesSatyres();
        Iles ile = new Iles();
        ile.ajouterCarte(lesSatyres,2);
        assertTrue(!lesSatyres.isActiverOuPas());

        joueur1.acheterCarte(ile,lesSatyres);
        joueur1.activerEffetCarteImmRealJoueur();
        assertTrue(lesSatyres.isActiverOuPas());


        assertEquals(6,joueur1.getPointDeGloireCarte());
    }

    /**
     * on vérifie si les faces choisis sont conforme donc si les faces appliquées au joueur sont bien présent dans la liste de face
     * qui représente les faces obtenues par les dé de tout les joueurs
     */
    public void faceConfirme(){

        //a faire

    }
}
