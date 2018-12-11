package main.java.projet_dice_forge.Ressource;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class FragmentLunaireTest {
    FragementLunaire fragementLunaire = new FragementLunaire(4);
    @Test
    void getNombreRessourceTest(){
        assertEquals(fragementLunaire.getNbRessources(),4);
        assertFalse(fragementLunaire.getNbRessources()==66);

    }

    @Test
    void getTypeRessourceTest(){
        assertEquals(fragementLunaire.getTypeRessource(),"FragementLunaire");
        assertFalse(fragementLunaire.getTypeRessource().equals("Bonjour"));
    }

    @Test
    void getIdRessourceTest(){
        assertEquals(fragementLunaire.getIdRessource(),4);
        assertFalse(fragementLunaire.getIdRessource()==1);
    }
    @Test
    void setRessourceTest(){
        fragementLunaire.setRessources(98);
        assertEquals(fragementLunaire.getNbRessources(),98);
        assertFalse(fragementLunaire.getNbRessources()==4);
    }

    @Test
    void AjouterRessourceTest(){
        fragementLunaire.ajoutRessources(2);
        assertEquals(fragementLunaire.getNbRessources(),6);
        fragementLunaire.ajoutRessources(12);
        assertEquals(fragementLunaire.getNbRessources(),6);
        fragementLunaire.ajoutRessources(1);
        assertEquals(fragementLunaire.getNbRessources(),6);
    }

    @Test
    void EnleverRessourceTest(){
        fragementLunaire.enleverRessources(2);
        assertEquals(fragementLunaire.getNbRessources(),2);
        fragementLunaire.enleverRessources(1);
        assertEquals(fragementLunaire.getNbRessources(),1);
        fragementLunaire.enleverRessources(5);
        assertEquals(fragementLunaire.getNbRessources(),1);
    }
}
