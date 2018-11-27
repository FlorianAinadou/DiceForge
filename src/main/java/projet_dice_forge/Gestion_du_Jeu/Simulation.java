package main.java.projet_dice_forge.Gestion_du_Jeu;


import main.java.projet_dice_forge.Partie_Iles.Carte;
import main.java.projet_dice_forge.Partie_Iles.PlateauDesIles;
import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.effet.LeMarteauDuForgeron;
import main.java.projet_dice_forge.effet.LesHerbesFolles;

public class Simulation {

    /**
     * Crée une nouvelle partie de Dice Forge
     */
    public Simulation(){


        Joueur joueur1 = new Joueur(1);
        Joueur joueur2 = new Joueur(2);
        Tour tour = new Tour(joueur1,joueur2);


        if (joueur1.getPlateauDuJoueur().getPointsDeGloire() > joueur2.getPlateauDuJoueur().getPointsDeGloire()){
            System.out.println(" Le gagnant est le joueur1 avec "+ joueur1.getPlateauDuJoueur().getPointsDeGloire() +" points de gloire.");
            //System.out.println("or " + joueur1.getPlateauDuJoueur().getOr());
        }
        else if (joueur1.getPlateauDuJoueur().getPointsDeGloire() < joueur2.getPlateauDuJoueur().getPointsDeGloire()){
            System.out.println(" Le gagnant est le joueur2 avec "+ joueur2.getPlateauDuJoueur().getPointsDeGloire() +" points de gloire.");
            //System.out.println("or " + joueur2.getPlateauDuJoueur().getOr());
        }
        else{
            System.out.println("Egalité. " +joueur2.getPlateauDuJoueur().getPointsDeGloire() + " points de gloire partout.");
            //System.out.println("or " + joueur1.getPlateauDuJoueur().getOr());
        }




        /**
         * Cette partie commenter me permet de tester si mes effets de cartes implémenté marche bien
         * Carte LeMarteauDuForgeron
         */
        /*
        Joueur joueur =new Joueur(1);
        PlateauDesIles plateau = new PlateauDesIles();
        Carte carte = new LeMarteauDuForgeron();
        joueur.acheterCarte(plateau.getIlesN1(),carte);
        joueur.afficherCarteJoueur();
       // System.out.println(Liste);
        ((LeMarteauDuForgeron) carte).activerEffetCarte(joueur,3);
        System.out.println(joueur.getPlateauDuJoueur().getFragmentLunaire());
        System.out.println(joueur.getPlateauDuJoueur().getOr());
        */



    }
}
