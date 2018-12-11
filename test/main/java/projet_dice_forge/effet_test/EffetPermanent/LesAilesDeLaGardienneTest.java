package main.java.projet_dice_forge.effet_test.EffetPermanent;

import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.Partie_Iles.Iles;
import main.java.projet_dice_forge.effet.EffetPermanent.LesAilesDeLaGardienne;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class LesAilesDeLaGardienneTest {

    @Test
    public void LesAilesDeLaGardienne() {
        LesAilesDeLaGardienne lesAilesDeLaGardienne = new LesAilesDeLaGardienne();
        assertEquals(lesAilesDeLaGardienne.getIdCarte(), 12);
        assertEquals(lesAilesDeLaGardienne.getPointDeGloire().getNbRessources(), 2);
    }

    @Test
    public  void activerEffetCartePerm() {
        Joueur joueur = new Joueur(1);
        Iles ile = new Iles();
        LesAilesDeLaGardienne lesAilesDeLaGardienne = new LesAilesDeLaGardienne();
        ile.ajouterCarte(lesAilesDeLaGardienne);
        joueur.acheterCarte(ile,lesAilesDeLaGardienne);
        for(int i =0; i<9;i++ ){
             int temp[]= new int[]{ joueur.getPlateauDuJoueur().getOr(), joueur.getPlateauDuJoueur().getFragmentSolaire(),joueur.getPlateauDuJoueur().getFragmentLunaire()};
             joueur.activerEffetCartePermanent();
             if(joueur.getPlateauDuJoueur().getOr()==temp[0]+3){
                 assertEquals(temp[1],joueur.getPlateauDuJoueur().getFragmentSolaire());
                 assertEquals(temp[2],joueur.getPlateauDuJoueur().getFragmentLunaire());
             }
            if(joueur.getPlateauDuJoueur().getFragmentSolaire()==temp[1]+3){
                assertEquals(temp[0],joueur.getPlateauDuJoueur().getOr());
                assertEquals(temp[2],joueur.getPlateauDuJoueur().getFragmentLunaire());
            }
            if(joueur.getPlateauDuJoueur().getFragmentLunaire()==temp[2]+3){
                assertEquals(temp[0],joueur.getPlateauDuJoueur().getOr());
                assertEquals(temp[1],joueur.getPlateauDuJoueur().getFragmentSolaire());
            }
        }
    }
}