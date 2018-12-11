package main.java.projet_dice_forge.Ressource;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class OrTest {
    Or or = new Or(6);


    @Test
    public void getNombreRessourceTest(){
        assertEquals(or.getNbRessources(),6);
        assertFalse(or.getNbRessources()==66);

    }

    @Test
    public void getTypeRessourceTest(){
        assertEquals(or.getTypeRessource(),"Or");
        assertFalse(or.getTypeRessource().equals("Bonjour"));
    }

    @Test
    public  void getIdRessourceTest(){
        assertEquals(or.getIdRessource(),1);
        assertFalse(or.getIdRessource()==4);
    }
    @Test
    public void setRessourceTest(){
        or.setRessources(98);
        assertEquals(or.getNbRessources(),98);
        assertFalse(or.getNbRessources()==6);
    }

    @Test
    public void AjouterRessourceTest(){
        or.ajoutRessources(2);
        assertEquals(or.getNbRessources(),8);
        or.ajoutRessources(12);
        assertEquals(or.getNbRessources(),12);
        or.ajoutRessources(1);
        assertEquals(or.getNbRessources(),12);
    }

    @Test
    public void EnleverRessourceTest(){
        or.setRessources(0);
        or.ajoutRessources(10);
        or.enleverRessources(5);
        assertEquals(or.getNbRessources(),5);
        or.enleverRessources(1);
        assertEquals(or.getNbRessources(),4);
        or.ajoutRessources(100);
        or.enleverRessources(5);
        assertEquals(or.getNbRessources(),7);
    }
}
