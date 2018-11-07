package main.java.projet_dice_forge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FaceTest {
    Face faceTest1= new Face(1,"or");
    Face faceTest2= new Face(1,"gloire");

    @Test

    void isFaceContainsGloire() {
        assertFalse(faceTest1.isFaceContainsGloire());
        assertTrue(faceTest2.isFaceContainsGloire());
    }

    @Test

    void isFaceContainsOr() {
        assertFalse(faceTest2.isFaceContainsOr());
        assertTrue(faceTest1.isFaceContainsOr());
    }
}