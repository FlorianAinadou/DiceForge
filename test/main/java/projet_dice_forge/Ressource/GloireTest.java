package main.java.projet_dice_forge.Ressource;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class GloireTest {
    Gloire gloire = new Gloire(4);


    @Test
    public void getNombreRessourceTest(){
        assertEquals(gloire.getNbRessources(),4);
        assertFalse(gloire.getNbRessources()==66);

    }

    @Test
    public void getTypeRessourceTest(){
        assertEquals(gloire.getTypeRessource(),"Gloire");
        assertFalse(gloire.getTypeRessource().equals("Bonjour"));
    }

    @Test
    public void getIdRessourceTest(){
        assertEquals(gloire.getIdRessource(),2);
        assertFalse(gloire.getIdRessource()==4);
    }
    @Test
    public void setRessourceTest(){
        gloire.setRessources(98);
        assertEquals(gloire.getNbRessources(),98);
        assertFalse(gloire.getNbRessources()==6);
    }

    @Test
    public  void AjouterRessourceTest(){
        gloire.ajoutRessources(2);
        assertEquals(gloire.getNbRessources(),6);
        gloire.ajoutRessources(12);
        assertEquals(gloire.getNbRessources(),18);
        gloire.ajoutRessources(1);
        assertEquals(gloire.getNbRessources(),19);
    }

    @Test
    public  void EnleverRessourceTest(){
        gloire.setRessources(0);
        gloire.ajoutRessources(4);
        gloire.enleverRessources(2);
        assertEquals(gloire.getNbRessources(),2);
        gloire.enleverRessources(1);
        assertEquals(gloire.getNbRessources(),1);
        gloire.ajoutRessources(5);
        gloire.enleverRessources(5);
        assertEquals(gloire.getNbRessources(),1);
    }
}

