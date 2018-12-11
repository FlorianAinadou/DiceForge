package main.java.projet_dice_forge.Bot;

import main.java.projet_dice_forge.Partie_Bassin.*;
import main.java.projet_dice_forge.Partie_Iles.*;
import main.java.projet_dice_forge.Plateau_Joueur.*;
import main.java.projet_dice_forge.Ressource.*;
import main.java.projet_dice_forge.effet.EffetImmediat.LecoffreDuForgeron;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmelineTest {

    Emeline bot = new Emeline(1);
    Temple temple= new Temple();
    PlateauDesIles plateauDesIles= new PlateauDesIles(1);


    @Test
    void accederAuMeilleurBassin() {
        Emeline bot = new Emeline(1);
        Temple temple= new Temple();
        PlateauDesIles plateauDesIles= new PlateauDesIles(1);
        bot.getPlateauDuJoueur().ajouterOr(4);
        bot.accederAuMeilleurBassin(temple);

    }

    @Test
    void quelleFaceChanger() {
        Emeline bot = new Emeline(1);
        Temple temple= new Temple();
        PlateauDesIles plateauDesIles= new PlateauDesIles(1);
        bot.getPlateauDuJoueur().ajouterOr(4);
        assertEquals(bot.quelleFaceChanger(bot.DeClaire), bot.DeClaire.getface(1));
    }

    @Test
    void quelleFaceAcheter() {
        Emeline bot = new Emeline(1);
        Temple temple= new Temple();
        PlateauDesIles plateauDesIles= new PlateauDesIles(1);
        bot.getPlateauDuJoueur().ajouterOr(4);
        Face face= new Face();
        face.AjouterRessource(new Or(6));
        assertEquals(bot.quelleFaceAcheter(temple.getBassin(4).getListFace()), face);
    }

    @Test
    void quelDeChanger() {
        Emeline bot = new Emeline(1);
        Temple temple= new Temple();
        PlateauDesIles plateauDesIles= new PlateauDesIles(1);
        Face face=bot.quelleFaceAcheter(temple.getBassin(4).getListFace());
        bot.acheterFace(temple, face, bot.DeClaire.getface(1),bot.DeClaire.getIdDe());
        assertEquals(2,bot.quelDeChanger().getIdDe());
    }

    @Test
    void quelEstLeMeilleurBassin() {
        Emeline bot = new Emeline(1);
        Temple temple= new Temple();
        PlateauDesIles plateauDesIles= new PlateauDesIles(1);
        bot.getPlateauDuJoueur().ajouterOr(4);
        assertEquals(4,bot.quelEstLeMeilleurBassin(temple));
    }

    @Test
    void quelleCarteAcheter() {
    }

    @Test
    void puisjeAcheterLaCarteLaaPlusChere() {
        Emeline bot = new Emeline(1);
        Temple temple= new Temple();
        PlateauDesIles plateauDesIles= new PlateauDesIles(1);
        bot.getPlateauDuJoueur().ajouterFragSol(6);
        bot.getPlateauDuJoueur().ajouterFragLun(6);
        assertTrue( bot.puisjeAcheterLaCarteLaaPlusChere(plateauDesIles));
    }

    @Test
    void dansQuelleIleAller() {
        Emeline bot = new Emeline(2);
        PlateauDesIles plateauDesIles= new PlateauDesIles(1);
        bot.getPlateauDuJoueur().ajouterFragSol(0);
        bot.getPlateauDuJoueur().ajouterFragLun(1);
        assertEquals(1, bot.dansQuelleIleAller(plateauDesIles));
    }

    @Test
    void puisJeAcheterUneCarte() {
        Emeline bot = new Emeline(2);
        PlateauDesIles plateauDesIles= new PlateauDesIles(1);
        bot.getPlateauDuJoueur().ajouterFragSol(0);
        bot.getPlateauDuJoueur().ajouterFragLun(1);
        assertTrue(bot.puisJeAcheterUneCarte(plateauDesIles));
    }

//On vérfie qu'en cas d'absence de la carte "Le coffre du forgeron dans l'ile, le resultat retouné par la méthode soit false"
    @Test
    void puisJeAcheterLeCoffre() {
        Emeline bot = new Emeline(1);
        PlateauDesIles plateauDesIles= new PlateauDesIles(1);
        plateauDesIles.getIlesNb(1).enleverCarte(new LecoffreDuForgeron());
        plateauDesIles.getIlesNb(1).enleverCarte(new LecoffreDuForgeron());
        bot.getPlateauDuJoueur().ajouterFragSol(0);
        bot.getPlateauDuJoueur().ajouterFragLun(1);
        assertTrue(!bot.puisJeAcheterLeCoffre(plateauDesIles));
    }
}