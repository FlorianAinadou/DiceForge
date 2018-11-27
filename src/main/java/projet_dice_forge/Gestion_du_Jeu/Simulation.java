package main.java.projet_dice_forge.Gestion_du_Jeu;


import main.java.projet_dice_forge.Partie_Iles.Carte;
import main.java.projet_dice_forge.Partie_Iles.PlateauDesIles;
import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.Effet.EffetPermanent.LeMarteauDuForgeron;
import main.java.projet_dice_forge.Effet.EffetImmediat.LesHerbesFolles;
import main.java.projet_dice_forge.Effet.EffetImmediat.LesSabotsDargent;

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

        Joueur joueur =new Joueur(1);
        PlateauDesIles plateau = new PlateauDesIles();
        Carte carte = new LesHerbesFolles();
        joueur.acheterCarte(plateau.getIlesN7(),carte);
        //joueur.afficherCarteJoueur();


        joueur.activerEffetCarteImmediat();
        System.out.println("Lune:"+ joueur.getPlateauDuJoueur().getFragmentLunaire());
        System.out.println("Solaire:"+joueur.getPlateauDuJoueur().getFragmentSolaire());
        System.out.println("Or :"+ joueur.getPlateauDuJoueur().getOr());
        System.out.println("Gloire :"+ joueur.getPlateauDuJoueur().getPointsDeGloire());




    }
}
