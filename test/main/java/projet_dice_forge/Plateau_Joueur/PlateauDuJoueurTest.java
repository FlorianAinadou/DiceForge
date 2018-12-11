package main.java.projet_dice_forge.Plateau_Joueur;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

class PlateauDuJoueurTest {
    PlateauDuJoueur plateauDuJoueur = new PlateauDuJoueur(9);


    @Test
    void ajouterOr() {
        plateauDuJoueur.ajouterOr(6);
        assertEquals(6, plateauDuJoueur.getOr());
        plateauDuJoueur.ajouterOr(14);
        assertEquals(12, plateauDuJoueur.getOr());
    }

    @Test
    void enleverOr() {
        plateauDuJoueur.ajouterOr(6);
        plateauDuJoueur.enleverOr(5);
        assertEquals(1, plateauDuJoueur.getOr());

    }

    @Test
    void ajouterPointDeGloire() {
        plateauDuJoueur.ajouterPointDeGloire(5);
        assertEquals(5,plateauDuJoueur.getPointsDeGloire());
    }


    @Test
    void setMaxOr() {
        plateauDuJoueur.setMaxOr(5);
        assertEquals(5,plateauDuJoueur.getMaxOr());
    }


    @Test
    void enleverFragmentSolaire() {
        plateauDuJoueur.ajouterFragSol(6);
        plateauDuJoueur.enleverFragmentSolaire(5);
        assertEquals(1,plateauDuJoueur.getFragmentSolaire());
    }

    @Test
    void enleverFragmentLunaire() {
        plateauDuJoueur.ajouterFragLun(6);
        plateauDuJoueur.enleverFragmentLunaire(5);
        assertEquals(1,plateauDuJoueur.getFragmentLunaire());
    }


    @Test
    void setMaxFragSol() {
        plateauDuJoueur.setMaxFragSol(5);
        assertEquals(5,plateauDuJoueur.getMaxFragSol());
    }

    @Test
    void setMaxFragLun() {
        plateauDuJoueur.setMaxFragLun(5);
        assertEquals(5,plateauDuJoueur.getMaxFragLun());
    }

    @Test
    void ajouterFragLun() {
        plateauDuJoueur.ajouterFragLun(3);
        assertEquals(3,plateauDuJoueur.getFragmentLunaire());
        plateauDuJoueur.ajouterFragLun(6);
        assertEquals(6,plateauDuJoueur.getFragmentLunaire());
    }

    @Test
    void ajouterFragSol() {
        plateauDuJoueur.ajouterFragSol(3);
        assertEquals(3,plateauDuJoueur.getFragmentSolaire());
        plateauDuJoueur.ajouterFragSol(6);
        assertEquals(6,plateauDuJoueur.getFragmentSolaire());
    }
}