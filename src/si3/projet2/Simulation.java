package si3.projet2;

public class Simulation {

    /**
     * Crée une nouvelle partie de Dice Forge
     */
    public Simulation(){
        PlateauDuJoueur joueur1 = new PlateauDuJoueur(1);
        PlateauDuJoueur joueur2 = new PlateauDuJoueur(2);
        Tour tour = new Tour(joueur1,joueur2);
        System.out.println("joueur1 :"+ joueur1.getPointsDeGloire());
        System.out.println("joueur2 :" +joueur2.getPointsDeGloire());


    }
}
