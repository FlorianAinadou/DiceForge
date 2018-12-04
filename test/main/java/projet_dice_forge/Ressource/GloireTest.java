package main.java.projet_dice_forge.Ressource;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class GloireTest {
    Gloire gloire = new Gloire(4);


    @Test
    void getNombreRessourceTest(){
        assertEquals(gloire.getNbRessources(),4);
        assertFalse(gloire.getNbRessources()==66);

    }

    @Test
    void getTypeRessourceTest(){
        assertEquals(gloire.getTypeRessource(),"Gloire");
        assertFalse(gloire.getTypeRessource().equals("Bonjour"));
    }

    @Test
    void getIdRessourceTest(){
        assertEquals(gloire.getIdRessource(),2);
        assertFalse(gloire.getIdRessource()==4);
    }
    @Test
    void setRessourceTest(){
        gloire.setRessources(98);
        assertEquals(gloire.getNbRessources(),98);
        assertFalse(gloire.getNbRessources()==6);
    }

    @Test
    void AjouterRessourceTest(){
        gloire.ajoutRessources(2);
        assertEquals(gloire.getNbRessources(),6);
        gloire.ajoutRessources(12);
        assertEquals(gloire.getNbRessources(),18);
        gloire.ajoutRessources(1);
        assertEquals(gloire.getNbRessources(),19);
    }

    @Test
    void EnleverRessourceTest(){
        gloire.enleverRessources(2);
        assertEquals(gloire.getNbRessources(),2);
        gloire.enleverRessources(1);
        assertEquals(gloire.getNbRessources(),1);
        gloire.enleverRessources(5);
        assertEquals(gloire.getNbRessources(),1);
    }
}

