package main.java.projet_dice_forge;

import java.util.Random;

public class Tour {

    private PlateauDuJoueur joueur1;
    private PlateauDuJoueur joueur2;
    private int nbTour =9;
    Temple temple = new Temple();


    /**
     * Crée une nouvelle série de tour avec les actions nécessaires
     */

    public Tour(Joueur joueur1,Joueur joueur2 ){
        Random r = new Random();
        for (int tour =0; tour<nbTour; tour++){

            /*Cela me permet de voir si les dés sont bien changer
            joueur1.getDe(1).afficherDe();
            joueur1.getDe(2).afficherDe();
            joueur2.getDe(1).afficherDe();
            joueur2.getDe(2).afficherDe();
            */


            System.out.println("Tour " + (tour+1));

            int choixJ1 =r.nextInt(1);
            int choixJ2 = r.nextInt(1);

            int GoTemple = 0;

            if (choixJ1 == GoTemple){
                AllerAuTemple(joueur1);
                gainDeRessources(joueur1);

            }
            else{
                gainDeRessources(joueur1);
            }

            if (choixJ2 ==GoTemple){
                AllerAuTemple(joueur2);
                gainDeRessources(joueur2);

            }
            else{
                gainDeRessources(joueur2);


            }

/*
            AllerAuTemple(joueur1);
            AllerAuTemple(joueur2);
            gainDeRessources(joueur2);
            gainDeRessources(joueur1);
            */



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

        System.out.println("Nombre de points de gloire actuels: " + joueur.getPlateauDuJoueur().getPointsDeGloire()+"|| et le Nombre d'Or :"+ joueur.getPlateauDuJoueur().getOr());
    }



    /**
     * On décide d'aller au temple pour customiser son dé
     * @param joueur
     */

    void AllerAuTemple(Joueur joueur){

        int nbOr = joueur.getPlateauDuJoueur().getOr();

        Random r = new Random();
        int choixDé = (r.nextInt(1) + 1);
        int choixDeFaceChanger = r.nextInt(5);

        switch (nbOr){
            case 2:
                Face f0 = temple.Bassin2Or.FaceAleaBassin();
                temple.Bassin2Or.AcheterFace(f0,joueur);
                joueur.getDe(choixDé).ajouterUneFace(f0,choixDeFaceChanger);

                break;

            case 3:
                Face f1 = temple.Bassin3Or.FaceAleaBassin();
                temple.Bassin2Or.AcheterFace(f1,joueur);
                joueur.getDe(choixDé).ajouterUneFace(f1,choixDeFaceChanger);
                break;

            case 4:
                Face f2 = temple.Bassin4Or.FaceAleaBassin();
                temple.Bassin2Or.AcheterFace(f2,joueur);
                joueur.getDe(choixDé).ajouterUneFace(f2,choixDeFaceChanger);
                break;

            case 5:
                Face f3 = temple.Bassin5Or.FaceAleaBassin();
                temple.Bassin2Or.AcheterFace(f3,joueur);
                joueur.getDe(choixDé).ajouterUneFace(f3,choixDeFaceChanger);
                break;

            case 6:
                Face f4 = temple.Bassin6Or.FaceAleaBassin();
                temple.Bassin2Or.AcheterFace(f4,joueur);
                joueur.getDe(choixDé).ajouterUneFace(f4,choixDeFaceChanger);
                break;

            case 8:
                Face f5 = temple.Bassin8Or.FaceAleaBassin();
                temple.Bassin2Or.AcheterFace(f5,joueur);
                joueur.getDe(choixDé).ajouterUneFace(f5,choixDeFaceChanger);
                break;

            case 12:
                Face f6 = temple.Bassin12Or.FaceAleaBassin();
                temple.Bassin2Or.AcheterFace(f6,joueur);
                joueur.getDe(choixDé).ajouterUneFace(f6,choixDeFaceChanger);
                break;

        }




    }


    /*Permet de tester si ma méthode marche bien

    void AllerAuTemple(Joueur joueur){
        Face f0 = temple.Bassin3Or.FaceAleaBassin();
        System.out.println(f0.getNb());

        temple.Bassin2Or.AcheterFace(f0,joueur);

        joueur.getDe(0).ajouterUneFace(f0,0);
        temple.Bassin2Or.AfficherBassin();

        joueur.getDe(0).afficherDe();

    }
    */




}
