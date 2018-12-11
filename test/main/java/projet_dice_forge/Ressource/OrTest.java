package main.java.projet_dice_forge.Ressource;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class OrTest {
    Or or = new Or(6);


    @Test
    void getNombreRessourceTest(){
        assertEquals(or.getNbRessources(),6);
        assertFalse(or.getNbRessources()==66);

    }

    @Test
    void getTypeRessourceTest(){
        assertEquals(or.getTypeRessource(),"Or");
        assertFalse(or.getTypeRessource().equals("Bonjour"));
    }

    @Test
    void getIdRessourceTest(){
        assertEquals(or.getIdRessource(),1);
        assertFalse(or.getIdRessource()==4);
    }
    @Test
    void setRessourceTest(){
        or.setRessources(98);
        assertEquals(or.getNbRessources(),98);
        assertFalse(or.getNbRessources()==6);
    }

    @Test
    void AjouterRessourceTest(){
        or.ajoutRessources(2);
        assertEquals(or.getNbRessources(),8);
        or.ajoutRessources(12);
        assertEquals(or.getNbRessources(),12);
        or.ajoutRessources(1);
        assertEquals(or.getNbRessources(),12);
    }

    @Test
    void EnleverRessourceTest(){
        or.enleverRessources(5);
        assertEquals(or.getNbRessources(),1);
        or.enleverRessources(1);
        assertEquals(or.getNbRessources(),0);
        or.enleverRessources(5);
        assertEquals(or.getNbRessources(),0);
    }
}
