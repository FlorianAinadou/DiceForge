package main.java.projet_dice_forge;

import java.util.Random;

public class Tour {

    private PlateauDuJoueur joueur1;
    private PlateauDuJoueur joueur2;
    private int nbTour = 9;
    Temple temple = new Temple();


    /**
     * Crée une nouvelle série de tour avec les actions nécessaires
     */

    public Tour(Joueur joueur1, Joueur joueur2) {


        for (int tour = 0; tour < nbTour; tour++) {

            /*Cela me permet de voir si les dés sont bien changer*/


            System.out.println("Tour " + (tour + 1));
            /*
            joueur1.getDe(1).afficherDe();
            joueur1.getDe(2).afficherDe();
            joueur2.getDe(1).afficherDe();
            joueur2.getDe(2).afficherDe();
            */
            Random r = new Random();
            int choixJ1 = r.nextInt(2);
            int choixJ2 = r.nextInt(2);

            int choixDé = (r.nextInt(1) + 1);
            int choixDeFaceChanger = r.nextInt(5);
            int GoTemple = 0;

            if (choixJ1 == GoTemple) {
                System.out.println("Joueur 1 au temple");
                AllerAuTemple(joueur1, choixDé, choixDeFaceChanger);
                gainDeRessources(joueur1);

            } else {
                gainDeRessources(joueur1);
            }

            if (choixJ2 == GoTemple) {
                AllerAuTemple(joueur2, choixDé, choixDeFaceChanger);
                gainDeRessources(joueur2);

            } else {
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
    public void gainDeRessources(Joueur joueur) {
        int gloire1 = 0;
        int gloire2 = 0;
        int or1 = 0;
        int or2 = 0;
        int quantitéOrInitiale = joueur.getPlateauDuJoueur().getOr();
        int pointsDeGloireInitiaux = joueur.getPlateauDuJoueur().getPointsDeGloire();
        Face face1 = joueur.getDe(1).lancerLeDe();
        Face face2 = joueur.getDe(2).lancerLeDe();

        if (face1.isFaceContainsGloire()) {
            gloire1 = face1.getNb();
        }

        if (face2.isFaceContainsGloire()) {
            gloire1 = face2.getNb();
        }

        if (face1.isFaceContainsOr()) {
            or1 = face1.getNb();
        }

        if (face2.isFaceContainsOr()) {
            or2 = face1.getNb();
        }

        joueur.getPlateauDuJoueur().setPointsDeGloire(pointsDeGloireInitiaux + gloire1 + gloire2);
        joueur.getPlateauDuJoueur().setOr(quantitéOrInitiale + or1 + or2);
        System.out.print(" Le joueur " + joueur.getIdJoueur() + " lance les dés    ");
        System.out.print("Dé 1: " + face1.getNb() + "  " + face1.getTypeDeRessource() + "   ");
        System.out.print("Dé 2: " + face2.getNb() + "  " + face2.getTypeDeRessource() + "   ");

        System.out.println("Nombre de points de gloire actuels: " + joueur.getPlateauDuJoueur().getPointsDeGloire() + "|| et le Nombre d'Or :" + joueur.getPlateauDuJoueur().getOr());
    }


    /**
     * On décide d'aller au temple pour customiser son dé
     *
     * @param joueur
     */

    void AllerAuTemple(Joueur joueur, int choixDé, int choixDeFaceChanger) {
        int t[] = {2, 3, 4, 5, 6, 6, 8, 8, 8, 8, 12};
        int nbOr = joueur.getPlateauDuJoueur().getOr();
        int taille = 0;

        if (nbOr > 1) {
            taille = temple.getBassin(t[nbOr]).TailleBassin();
            if (taille != 0) {
                Face f0 = temple.getBassin(t[nbOr]).FaceAleaBassin();
                temple.getBassin(t[nbOr]).AcheterFace(f0, joueur);
                joueur.getDe(choixDé).ajouterUneFace(f0, choixDeFaceChanger);
            }
        }
    }
}
        /*
        int indice = 0;
        if(nbOr>1) {
                Random r = new Random();
                indice = r.nextInt(nbOr+1);
                taille = temple.getBassin(t[indice]).TailleBassin();
                if(taille!=0){
                    Face f0 = temple.getBassin(t[indice]).FaceAleaBassin();
                    temple.getBassin(t[indice]).AcheterFace(f0, joueur);
                    joueur.getDe(choixDé).ajouterUneFace(f0, choixDeFaceChanger);
                }
        }
    }
}
        /*
       taille = temple.getBassin(t[nbOr]).TailleBassin();
       if(taille!=0){
       switch (nbOr){
                    Face f0 = temple.getBassin(t[nbOr]).FaceAleaBassin();
                    temple.getBassin(t[nbOr]).AcheterFace(f0, joueur);
                    joueur.getDe(choixDé).ajouterUneFace(f0, choixDeFaceChanger);


            case 2:
                if(temple.Bassin2Or.TailleBassin()==0){
                    break;
                }
                else{
                    Face f0 = temple.Bassin2Or.FaceAleaBassin();
                    temple.Bassin2Or.AcheterFace(f0,joueur);
                    joueur.getDe(choixDé).ajouterUneFace(f0,choixDeFaceChanger);
                }
                break;

            case 3:
                if(temple.Bassin2Or.TailleBassin()==0){
                    break;
                }
                else {
                    Face f1 = temple.Bassin3Or.FaceAleaBassin();
                    temple.Bassin3Or.AcheterFace(f1, joueur);
                    joueur.getDe(choixDé).ajouterUneFace(f1, choixDeFaceChanger);
                    break;
                }

            case 4:
                if(temple.Bassin4Or.TailleBassin()==0){
                    break;
                }
                else {
                    Face f2 = temple.Bassin4Or.FaceAleaBassin();
                    temple.Bassin4Or.AcheterFace(f2, joueur);
                    joueur.getDe(choixDé).ajouterUneFace(f2, choixDeFaceChanger);
                    break;
                }

            case 5:
                if(temple.Bassin5Or.TailleBassin()==0){
                    break;
                }
                else {
                    Face f3 = temple.Bassin5Or.FaceAleaBassin();
                    temple.Bassin5Or.AcheterFace(f3, joueur);
                    joueur.getDe(choixDé).ajouterUneFace(f3, choixDeFaceChanger);
                    break;
                }

            case 6:
                if(temple.Bassin6Or.TailleBassin()==0){
                    break;
                }
                else {
                    Face f4 = temple.Bassin6Or.FaceAleaBassin();
                    temple.Bassin6Or.AcheterFace(f4, joueur);
                    joueur.getDe(choixDé).ajouterUneFace(f4, choixDeFaceChanger);
                    break;
                }

            case 8:
                if(temple.Bassin8Or.TailleBassin()==0){
                    break;
                }
                else {
                    Face f5 = temple.Bassin8Or.FaceAleaBassin();
                    temple.Bassin8Or.AcheterFace(f5, joueur);
                    joueur.getDe(choixDé).ajouterUneFace(f5, choixDeFaceChanger);
                    break;
                }

            case 12:
                if(temple.Bassin12Or.TailleBassin()==0){
                    break;
                }
                else {
                    Face f6 = temple.Bassin12Or.FaceAleaBassin();
                    temple.Bassin12Or.AcheterFace(f6, joueur);
                    joueur.getDe(choixDé).ajouterUneFace(f6, choixDeFaceChanger);
                    break;
                }

        }
*/






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





