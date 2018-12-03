package main.java.projet_dice_forge.effet.EffetPermanent;

import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.Partie_Iles.Carte;
import main.java.projet_dice_forge.Partie_Iles.CarteEffetPermanent;
import main.java.projet_dice_forge.Ressource.FragementLunaire;
import main.java.projet_dice_forge.Ressource.FragementSolaire;
import main.java.projet_dice_forge.Ressource.Gloire;
import main.java.projet_dice_forge.Ressource.Ressource;

import java.util.Random;

public class LAncien extends CarteEffetPermanent {

    public LAncien(Joueur joueur){
        super(10, new Ressource[]{new FragementSolaire(1)}, new Gloire(0), false);

    }



    public void activerEffetCartePerm(Joueur joueur) {
        Random random = new Random();
        int rand1=random.nextInt(2);

        if(joueur.getPlateauDuJoueur().getOr() >= 3) {
            joueur.getPlateauDuJoueur().ajouterPointDeGloire(4);
            joueur.getPlateauDuJoueur().enleverOr(3);
        }
        else {
            System.out.println("Vous n'avez pas assez de pièce d'or");
        }


    }
}


