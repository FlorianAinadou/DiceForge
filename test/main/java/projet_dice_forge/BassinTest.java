package main.java.projet_dice_forge;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
public class BassinTest {
    Bassin bassinTest1 = new Bassin(2);
    Face faceTest1 = new Face(2,"Or");
    ArrayList<Face> ListFaceTest = new ArrayList<>();
    Face faceTest2=new Face(3,"gloire");


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
        bassinTest1.EnleverFaceBassin(faceTest1);
        ListFaceTest.add(0,faceTest1);
        ListFaceTest.add(1,faceTest1);
        ListFaceTest.add(2,faceTest1);
        Bassin bassinTest2 = new Bassin(2,ListFaceTest);
        assertFalse(bassinTest1.getListFace()== bassinTest2.getListFace());
        ListFaceTest.remove(faceTest1);
        assertEquals(bassinTest2.getListFace(),bassinTest1.getListFace());
    }
}
