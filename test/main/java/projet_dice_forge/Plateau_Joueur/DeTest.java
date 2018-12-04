package main.java.projet_dice_forge.Plateau_Joueur;



import main.java.projet_dice_forge.Ressource.FragementSolaire;
import main.java.projet_dice_forge.Ressource.Or;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;


class DeTest {
    De deTesteur= new De("sombre");
    De deTesteur2= new De("claire");

    @Test
    void ajouterUneFace() {
        assertNotNull(deTesteur);
        assertEquals(deTesteur.getface(0).getRessource().get(0).getTypeRessource(), "Or");
        assertEquals(deTesteur.getface(1).getRessource().get(0).getTypeRessource(), "Or");
        assertEquals(deTesteur.getface(2).getRessource().get(0).getTypeRessource(), "Or");
        assertEquals(deTesteur.getface(3).getRessource().get(0).getTypeRessource(), "Or");
        assertEquals(deTesteur.getface(4).getRessource().get(0).getTypeRessource(), "Gloire");
        assertEquals(deTesteur.getface(5).getRessource().get(0).getTypeRessource(), "FragementLunaire");
        assertEquals(deTesteur.getface(0).getRessource().get(0).getNbRessources(),1);
        assertEquals(deTesteur.getface(1).getRessource().get(0).getNbRessources(),1);
        assertEquals(deTesteur.getface(2).getRessource().get(0).getNbRessources(),1);
        assertEquals(deTesteur.getface(3).getRessource().get(0).getNbRessources(),1);
        assertEquals(deTesteur.getface(4).getRessource().get(0).getNbRessources(),2);
        assertEquals(deTesteur.getface(5).getRessource().get(0).getNbRessources(),1);

        Face face = new Face();
        face.AjouterRessource(new FragementSolaire(8));
        deTesteur.ajouterUneFace(face,0);
        assertEquals(deTesteur.getface(0).getRessource().get(0).getNbRessources(),8);
        assertEquals(deTesteur.getface(0).getRessource().get(0).getTypeRessource(), "FragementSolaire");

        assertEquals(deTesteur2.getface(0).getRessource().get(0).getTypeRessource(), "Or");
        assertEquals(deTesteur2.getface(1).getRessource().get(0).getTypeRessource(), "Or");
        assertEquals(deTesteur2.getface(2).getRessource().get(0).getTypeRessource(), "Or");
        assertEquals(deTesteur2.getface(3).getRessource().get(0).getTypeRessource(), "Or");
        assertEquals(deTesteur2.getface(4).getRessource().get(0).getTypeRessource(), "Or");
        assertEquals(deTesteur2.getface(5).getRessource().get(0).getTypeRessource(), "FragementSolaire");
        assertEquals(deTesteur2.getface(0).getRessource().get(0).getNbRessources(),1);
        assertEquals(deTesteur2.getface(1).getRessource().get(0).getNbRessources(),1);
        assertEquals(deTesteur2.getface(2).getRessource().get(0).getNbRessources(),1);
        assertEquals(deTesteur2.getface(3).getRessource().get(0).getNbRessources(),1);
        assertEquals(deTesteur2.getface(4).getRessource().get(0).getNbRessources(),1);
        assertEquals(deTesteur2.getface(5).getRessource().get(0).getNbRessources(),1);

    }

    /*@Test
    void ajouterToutLesFace() {
    }*/

    @Test
    void lancerLeDe() {
        assertNotNull(deTesteur.lancerLeDe());
    }

    @Test
    void getValeurDe() {
        assertEquals(7, deTesteur.getValeurDe());
        assertFalse(9== deTesteur.getValeurDe());
        assertEquals(6, deTesteur2.getValeurDe());
        assertFalse(9== deTesteur2.getValeurDe());

    }
}