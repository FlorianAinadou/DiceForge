package main.java.projet_dice_forge.Gestion_du_Jeu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanning scanning = new Scanning();
        Jeu jeu;

        jeu = new Jeu(scanning.getNumPlayer(), scanning.whoAreThePlayers());
        jeu.lancerNPartie(scanning.getNumberOfGame());



    }
}
