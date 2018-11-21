package main.java.projet_dice_forge.Gestion_du_Jeu;


import main.java.projet_dice_forge.Partie_Iles.PlateauDesIles;
import main.java.projet_dice_forge.Bot.Joueur;

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


    PlateauDesIles plateauDesIles = new PlateauDesIles();



    }
}
