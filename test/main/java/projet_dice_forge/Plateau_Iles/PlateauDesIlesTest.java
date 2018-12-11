package main.java.projet_dice_forge.Plateau_Iles;

import main.java.projet_dice_forge.Partie_Iles.PlateauDesIles;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;



import static org.junit.jupiter.api.Assertions.*;

public class PlateauDesIlesTest {
    PlateauDesIles plateauDesIles =new PlateauDesIles(2);


import static org.junit.jupiter.api.Assertions.assertEquals;

class PlateauDesIlesTest {
    PlateauDesIles plateauDesIles =new PlateauDesIles(2);

    @Test
   public void plateauDesIles(){
        assertEquals(plateauDesIles.getNbIle(),7);
        assertEquals(plateauDesIles.getIlesNb(1),plateauDesIles.getIlesN1());
    }
}
