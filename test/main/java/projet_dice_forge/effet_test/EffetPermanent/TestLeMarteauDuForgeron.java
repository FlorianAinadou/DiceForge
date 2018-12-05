package main.java.projet_dice_forge.effet_test.EffetImmediat;

import main.java.projet_dice_forge.Ressource.Ressource;
import main.java.projet_dice_forge.effet.EffetImmediat.LecoffreDuForgeron;
import main.java.projet_dice_forge.effet.EffetPermanent.LeMarteauDuForgeron;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestLeMarteauDuForgeron {


    @Test
    public void LeCoffreDuForgeron() {
        LeMarteauDuForgeron leMarteauDuForgeron = new LeMarteauDuForgeron();
        Ressource[] ressources = leMarteauDuForgeron.getPrix();
        assertEquals(ressources[0].getTypeRessource(), "FragementLunaire");
        assertEquals(ressources[0].getNbRessources(), 1);
        assertEquals(leMarteauDuForgeron.getPointDeGloire().getNbRessources(), 0);
    }



}