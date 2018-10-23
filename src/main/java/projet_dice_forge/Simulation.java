package main.java.projet_dice_forge;


public class Simulation {

    /**
     * Crée une nouvelle partie de Dice Forge
     */
    public Simulation(){
        PlateauDuJoueur joueur1 = new PlateauDuJoueur(1);
        PlateauDuJoueur joueur2 = new PlateauDuJoueur(2);
        Tour tour = new Tour(joueur1,joueur2);
        if (joueur1.getPointsDeGloire() > joueur2.getPointsDeGloire()){
            System.out.println(" Le gagnant est le joueur1 avec "+ joueur1.getPointsDeGloire() +" points de gloire.");
        }
        else if (joueur1.getPointsDeGloire() < joueur2.getPointsDeGloire()){
            System.out.println(" Le gagnant est le joueur2 avec "+ joueur2.getPointsDeGloire() +" points de gloire.");
        }
        else{
            System.out.println("Egalité. " +joueur2.getPointsDeGloire() + " points de gloire partout.");
        }




    }
}
