package main.java.projet_dice_forge.Plateau_Joueur;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlateauDuJoueurTest {


    @Test
    void ajouterOr() {
        PlateauDuJoueur plateau= new PlateauDuJoueur(1);
        plateau.ajouterOr(14);
        assertEquals(12, plateau.getOr());
    }

    @Test
    void enleverOr() {
        PlateauDuJoueur plateau= new PlateauDuJoueur(1);
        plateau.enleverOr(5);
        assertEquals(0,plateau.getOr());
    }

    @Test
    void ajouterPointDeGloire() {
        PlateauDuJoueur plateau= new PlateauDuJoueur(1);
        plateau.ajouterPointDeGloire(5);
        assertEquals(5,plateau.getPointsDeGloire());
    }


    @Test
    void setMaxOr() {
        PlateauDuJoueur plateau= new PlateauDuJoueur(1);
        plateau.setMaxOr(5);
        assertEquals(5,plateau.getMaxOr());
    }


    @Test
    void enleverFragmentSolaire() {
        PlateauDuJoueur plateau= new PlateauDuJoueur(1);
        plateau.ajouterFragSol(6);
        plateau.enleverFragmentSolaire(5);
        assertEquals(1,plateau.getFragmentSolaire());
    }

    @Test
    void enleverFragmentLunaire() {
        PlateauDuJoueur plateau= new PlateauDuJoueur(1);
        plateau.ajouterFragLun(6);
        plateau.enleverFragmentLunaire(5);
        assertEquals(1,plateau.getFragmentLunaire());
    }


    @Test
    void setMaxFragSol() {
        PlateauDuJoueur plateau= new PlateauDuJoueur(1);
        plateau.setMaxFragSol(5);
        assertEquals(5,plateau.getMaxFragSol());
    }

    @Test
    void setMaxFragLun() {
        PlateauDuJoueur plateau= new PlateauDuJoueur(1);
        plateau.setMaxFragLun(5);
        assertEquals(5,plateau.getMaxFragLun());
    }

    @Test
    void ajouterFragLun() {
        PlateauDuJoueur plateau= new PlateauDuJoueur(1);
        plateau.ajouterFragLun(6);
        assertEquals(6,plateau.getFragmentLunaire());
    }

    @Test
    void ajouterFragSol() {
        PlateauDuJoueur plateau= new PlateauDuJoueur(1);
        plateau.ajouterFragSol(6);
        assertEquals(6,plateau.getFragmentSolaire());
    }
}