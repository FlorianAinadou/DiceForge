package main.java.projet_dice_forge;

public class Tour {

    private PlateauDuJoueur joueur1;
    private PlateauDuJoueur joueur2;
    //private De de1;
    //private De de2;
    private int nbTour =9;

    /**
     * Crée une nouvelle série de tour avec les actions nécessaires
     */

    public Tour(Joueur joueur1,Joueur joueur2 ){
        for (int tour =0; tour<nbTour; tour++){
            System.out.println("Tour " + (tour+1));
            gainDeRessources(joueur1);
            gainDeRessources(joueur2);
        }
    }
    /**
     * Lancer des dés
     * Ici, on affectte les ressources au joueur en fonction des résultats obtenus
     * suite au lancé des dés
     */
    public void gainDeRessources(Joueur joueur){
        int gloire1=0;
        int gloire2=0;
        int or1=0;
        int or2=0;
        int quantitéOrInitiale= joueur.getPlateauDuJoueur().getOr();
        int pointsDeGloireInitiaux=joueur.getPlateauDuJoueur().getPointsDeGloire();
        Face face1= joueur.getDe(1).lancerLeDe();
        Face face2= joueur.getDe(2).lancerLeDe();

        if(face1.isFaceContainsGloire()){
            gloire1= face1.getNb();
        }

        if(face2.isFaceContainsGloire()){
            gloire1= face2.getNb();
        }

        if (face1.isFaceContainsOr()){
            or1= face1.getNb();
        }

        if (face2.isFaceContainsOr()){
            or2= face1.getNb();
        }



        joueur.getPlateauDuJoueur().setPointsDeGloire(pointsDeGloireInitiaux +gloire1 + gloire2);

        joueur.getPlateauDuJoueur().setOr(quantitéOrInitiale +or1 + or2);

        System.out.print(" Le joueur " + joueur.getIdJoueur() + " lance les dés    ");
        System.out.print("Dé 1: " + face1.getNb() + "  " + face1.getTypeDeRessource() +"   ");
        System.out.print("Dé 2: " + face2.getNb() + "  " + face2.getTypeDeRessource() +"   ");


        System.out.println("Nombre de points de gloire actuels: " + joueur.getPlateauDuJoueur().getPointsDeGloire());
    }



}
