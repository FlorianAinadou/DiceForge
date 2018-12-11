package main.java.projet_dice_forge.Ressource;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class FragementSolaireTest {

    FragementSolaire fragementSolaire = new FragementSolaire(4);

    @Test
    public void getNombreRessourceTest(){
        assertEquals(fragementSolaire.getNbRessources(),4);
        assertFalse(fragementSolaire.getNbRessources()==66);

    }

    @Test
    public void getTypeRessourceTest(){
        assertEquals(fragementSolaire.getTypeRessource(),"FragementSolaire");
        assertFalse(fragementSolaire.getTypeRessource().equals("Bonjour"));
    }

    @Test
    public void getIdRessourceTest(){
        assertEquals(fragementSolaire.getIdRessource(),3);
        assertFalse(fragementSolaire.getIdRessource()==4);
    }
    @Test
    public void setRessourceTest(){
        fragementSolaire.setRessources(98);
        assertEquals(fragementSolaire.getNbRessources(),98);
        assertFalse(fragementSolaire.getNbRessources()==6);
    }

    @Test
    public void AjouterRessourceTest(){
        fragementSolaire.ajoutRessources(2);
        assertEquals(fragementSolaire.getNbRessources(),6);
        fragementSolaire.ajoutRessources(12);
        assertEquals(fragementSolaire.getNbRessources(),6);
        fragementSolaire.ajoutRessources(1);
        assertEquals(fragementSolaire.getNbRessources(),6);
    }

    @Test
    public void EnleverRessourceTest(){
        fragementSolaire.setRessources(0);
        fragementSolaire.ajoutRessources(8);
        fragementSolaire.enleverRessources(2);
        assertEquals(fragementSolaire.getNbRessources(),4);
        fragementSolaire.enleverRessources(1);
        assertEquals(fragementSolaire.getNbRessources(),3);
        fragementSolaire.ajoutRessources(2);
        fragementSolaire.enleverRessources(5);
        assertEquals(fragementSolaire.getNbRessources(),0);
    }
}
