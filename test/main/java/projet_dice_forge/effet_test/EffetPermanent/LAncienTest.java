package main.java.projet_dice_forge.effet_test.EffetPermanent;

import main.java.projet_dice_forge.Ressource.Ressource;
import main.java.projet_dice_forge.effet.EffetImmediat.LecoffreDuForgeron;
import main.java.projet_dice_forge.effet.EffetPermanent.LAncien;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LAncienTest {

    @Test
    void LAncien(){
        LAncien lAncien = new LAncien();
        assertEquals(lAncien.getIdCarte(),10);

    }
}
