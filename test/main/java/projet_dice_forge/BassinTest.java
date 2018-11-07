package main.java.projet_dice_forge;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
public class BassinTest {
    Bassin bassinTest1 = new Bassin(2);
    Face faceTest1 = new Face(2,"Or");
    ArrayList<Face> ListFaceTest = new ArrayList<>();
    Face faceTest2=new Face(3,"gloire");
    Joueur joueurTest1 = new Joueur(1);


    @Test
    void getcout(){
        assertEquals(2,bassinTest1.getCout());
        assertFalse(bassinTest1.getCout()==10);

    }

    @Test
    void setCout(){
        bassinTest1.setCout(90);
        assertEquals(90,bassinTest1.getCout());
        assertFalse(bassinTest1.getCout()==2);
    }

    @Test
    void AjouterFaceBassin(){
        bassinTest1.AjouterFaceBassin(faceTest1,3);
        ListFaceTest.add(0,faceTest1);
        ListFaceTest.add(1,faceTest1);
        ListFaceTest.add(2,faceTest1);
        Bassin bassinTest2 = new Bassin(2,ListFaceTest);
        assertEquals(bassinTest1.getListFace(),bassinTest2.getListFace());

        bassinTest2.AjouterFaceBassin(faceTest2,1);
        assertFalse(bassinTest1.getListFace().equals(bassinTest2.getListFace()));

        bassinTest2.AjouterFaceBassin(faceTest1,1);
        bassinTest1.AjouterFaceBassin(faceTest1,1);
        bassinTest1.AjouterFaceBassin(faceTest2,1);
        assertFalse(bassinTest1.getListFace()==bassinTest2.getListFace());

    }

    @Test
    void EnleverFaceBasinTest(){
        bassinTest1.AjouterFaceBassin(faceTest1,3);
        bassinTest1.EnleverFaceBassin(faceTest1);
        ListFaceTest.add(0,faceTest1);
        ListFaceTest.add(1,faceTest1);
        ListFaceTest.add(2,faceTest1);
        Bassin bassinTest2 = new Bassin(2,ListFaceTest);
        assertFalse(bassinTest1.getListFace()== bassinTest2.getListFace());
        bassinTest2.getListFace().remove(0);
        assertEquals(bassinTest2.getListFace(),bassinTest1.getListFace());
    }

    @Test
    void AcheterFaceTest(){
        joueurTest1.getPlateauDuJoueur().setOr(10);
        bassinTest1.AjouterFaceBassin(faceTest1,3);
        bassinTest1.AcheterFace(faceTest1,joueurTest1);
        ListFaceTest.add(0,faceTest1);
        ListFaceTest.add(0,faceTest1);
        Bassin bassinTest2 = new Bassin(2,ListFaceTest);
        assertEquals(bassinTest2.getListFace(),bassinTest1.getListFace());
        assertEquals(8,joueurTest1.getPlateauDuJoueur().getOr());
    }

    @Test
    void TailleBassinTest(){
        bassinTest1.AjouterFaceBassin(faceTest1,3);
        assertEquals(3,bassinTest1.getListFace().size());
        bassinTest1.AjouterFaceBassin(faceTest1,3);
        assertEquals(6,bassinTest1.TailleBassin());
        bassinTest1.EnleverFaceBassin(faceTest1);
        assertEquals(5,bassinTest1.TailleBassin());
    }
}
