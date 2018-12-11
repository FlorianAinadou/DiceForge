package main.java.projet_dice_forge.Plateau_Joueur;

import main.java.projet_dice_forge.Ressource.FragementLunaire;
import main.java.projet_dice_forge.Ressource.FragementSolaire;
import main.java.projet_dice_forge.Ressource.Or;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class FaceTest {


    @Test
    public  void ajouterRessource() {
        Face face= new Face();
        face.AjouterRessource(new Or(2));
        assertNotNull(face.getRessource());
    }


    @Test
    public void getValeurFace() {
        Face face= new Face();
        face.AjouterRessource(new Or(2));
        face.AjouterRessource(new FragementLunaire(2));
        face.AjouterRessource(new FragementSolaire(1));
        assertEquals(5,face.getValeurFace());
    }
}