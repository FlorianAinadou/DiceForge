package main.java.projet_dice_forge.Plateau_Iles;

import main.java.projet_dice_forge.Partie_Bassin.Bassin;
import main.java.projet_dice_forge.Partie_Bassin.Temple;
import main.java.projet_dice_forge.Plateau_Joueur.Face;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TempleTest {
    Temple temple = new Temple();

    @Test
    void getBassinTest(){
        assertEquals(temple.getBassin(2).getCout(),2 );
        assertEquals(temple.getBassin(3).getCout(),3 );
        assertEquals(temple.getBassin(4).getCout(),4);
        assertEquals(temple.getBassin(5).getCout(),5 );
        assertEquals(temple.getBassin(6).getCout(),6);
        assertEquals(temple.getBassin(8).getCout(),8 );
        assertEquals(temple.getBassin(12).getCout(),12 );

    }
    @Test
    void getListFaceTest(){
        assertEquals(temple.getBassin(2).getListFace(), temple.getFaceFromBassin(2));
        assertEquals(temple.getBassin(3).getListFace(), temple.getFaceFromBassin(3));
        assertEquals(temple.getBassin(4).getListFace(), temple.getFaceFromBassin(4));
        assertEquals(temple.getBassin(5).getListFace(), temple.getFaceFromBassin(5));
        assertEquals(temple.getBassin(6).getListFace(), temple.getFaceFromBassin(6));
        assertEquals(temple.getBassin(8).getListFace(), temple.getFaceFromBassin(8));
        assertEquals(temple.getBassin(12).getListFace(), temple.getFaceFromBassin(12));
    }
}
