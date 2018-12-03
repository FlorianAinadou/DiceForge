package main.java.projet_dice_forge.effet.EffetPermanent;

import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.Partie_Iles.CarteEffetPermanent;

import main.java.projet_dice_forge.Ressource.FragementSolaire;
import main.java.projet_dice_forge.Ressource.Gloire;
import main.java.projet_dice_forge.Ressource.Ressource;

import java.util.Random;

public class LesAilesDeLaGardienne extends CarteEffetPermanent {


    public LesAilesDeLaGardienne(){
        super(4,new Ressource[] {new FragementSolaire(2) }, new Gloire(2),false);
    }


    public void activerEffetCartePerm(Joueur joueur) {
        int PierreDeLune=0;
        int PierreSolaire=1;
        int Or=2;
        Random random =new Random();
        int choixDeRessource= random.nextInt(3);

        if(choixDeRessource == PierreDeLune){
            joueur.getPlateauDuJoueur().ajouterFragLun(1);
        }
        else if(choixDeRessource == PierreSolaire){
            joueur.getPlateauDuJoueur().ajouterFragSol(1);
        }

        else if(choixDeRessource == Or){
            joueur.getPlateauDuJoueur().ajouterOr(1);
        }
    }
}
