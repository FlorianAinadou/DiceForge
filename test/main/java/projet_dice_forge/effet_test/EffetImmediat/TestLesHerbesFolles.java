package main.java.projet_dice_forge.effet_test.EffetImmediat;
import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.Partie_Iles.CarteEffetImmediat;
import main.java.projet_dice_forge.Partie_Iles.PlateauDesIles;
import main.java.projet_dice_forge.effet.EffetImmediat.LesHerbesFolles;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestLesHerbesFolles {
    public Joueur joueur1;
    public Joueur joueur2;
    public PlateauDesIles plateauDesIles;
    public (LesHerbesFolles).CarteEffetImmediat carte = new CarteEffetImmediat;




    @Test
    public void activerEffetCarte(){

        joueur1.getListeCarteEffetImmediat().add(carte);
        /*
        joueur1.activerEffetCarteImmediat();
        assertNotEquals(joueur1.getPlateauDuJoueur().getFragmentLunaire(),joueur2.getPlateauDuJoueur().getFragmentLunaire());
        assertNotEquals(joueur1.getPlateauDuJoueur().getOr(),joueur2.getPlateauDuJoueur().getOr());
        */


    }



}
