package main.java.projet_dice_forge.Plateau_Joueur;

import main.java.projet_dice_forge.Ressource.FragementLunaire;
import main.java.projet_dice_forge.Ressource.FragementSolaire;
import main.java.projet_dice_forge.Ressource.Or;


import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class FaceTest {


    @Test
    void ajouterRessource() {
        Face face= new Face();
        face.AjouterRessource(new Or(2));
        assertNotNull(face.getRessource());
    }

    @Test
    void afficherFace() {
        Face face= new Face();
        face.AjouterRessource(new Or(2));
        assertEquals("2 Or \n", face.afficherFace());
    }

    @Test
    void getValeurFace() {
        Face face= new Face();
        face.AjouterRessource(new Or(2));
        face.AjouterRessource(new FragementLunaire(2));
        face.AjouterRessource(new FragementSolaire(1));
        assertEquals(5,face.getValeurFace());
    }
}