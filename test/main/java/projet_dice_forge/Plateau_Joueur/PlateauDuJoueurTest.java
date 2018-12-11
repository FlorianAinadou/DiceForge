package main.java.projet_dice_forge.Plateau_Joueur;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PlateauDuJoueurTest {
    PlateauDuJoueur plateauDuJoueur = new PlateauDuJoueur(9);


    @Test
    public void ajouterOr() {
        plateauDuJoueur.ajouterOr(6);
        assertEquals(6, plateauDuJoueur.getOr());
        plateauDuJoueur.ajouterOr(14);
        assertEquals(12, plateauDuJoueur.getOr());
    }

    @Test
    public void enleverOr() {
        plateauDuJoueur.ajouterOr(6);
        plateauDuJoueur.enleverOr(5);
        assertEquals(1, plateauDuJoueur.getOr());

    }

    @Test
    public  void ajouterPointDeGloire() {
        plateauDuJoueur.ajouterPointDeGloire(5);
        assertEquals(5,plateauDuJoueur.getPointsDeGloire());
    }


    @Test
    public void setMaxOr() {
        plateauDuJoueur.setMaxOr(5);
        assertEquals(5,plateauDuJoueur.getMaxOr());
    }


    @Test
    public void enleverFragmentSolaire() {
        plateauDuJoueur.ajouterFragSol(6);
        plateauDuJoueur.enleverFragmentSolaire(5);
        assertEquals(1,plateauDuJoueur.getFragmentSolaire());
    }

    @Test
    public void enleverFragmentLunaire() {
        plateauDuJoueur.ajouterFragLun(6);
        plateauDuJoueur.enleverFragmentLunaire(5);
        assertEquals(1,plateauDuJoueur.getFragmentLunaire());
    }


    @Test
    public  void setMaxFragSol() {
        plateauDuJoueur.setMaxFragSol(5);
        assertEquals(5,plateauDuJoueur.getMaxFragSol());
    }

    @Test
    public void setMaxFragLun() {
        plateauDuJoueur.setMaxFragLun(5);
        assertEquals(5,plateauDuJoueur.getMaxFragLun());
    }

    @Test
    public void ajouterFragLun() {
        plateauDuJoueur.ajouterFragLun(3);
        assertEquals(3,plateauDuJoueur.getFragmentLunaire());
        plateauDuJoueur.ajouterFragLun(6);
        assertEquals(6,plateauDuJoueur.getFragmentLunaire());
    }

    @Test
    public  void ajouterFragSol() {
        plateauDuJoueur.ajouterFragSol(3);
        assertEquals(3,plateauDuJoueur.getFragmentSolaire());
        plateauDuJoueur.ajouterFragSol(6);
        assertEquals(6,plateauDuJoueur.getFragmentSolaire());
    }
}