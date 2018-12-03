package main.java.projet_dice_forge.effet.EffetPermanent;

import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.Partie_Iles.CarteEffetPermanent;

import main.java.projet_dice_forge.Ressource.FragementSolaire;
import main.java.projet_dice_forge.Ressource.Gloire;
import main.java.projet_dice_forge.Ressource.Ressource;

public class LesAilesDeLaGardienne extends CarteEffetPermanent {

    public LesAilesDeLaGardienne(){
        super(4,new Ressource[] {new FragementSolaire(2) }, new Gloire(2),false);
    }


    public void activerEffetCartePerm(Joueur joueur) {
        if (this.isActiverOuPas()) {
            //a faire

        }
        else{
            System.out.println("la Carte Les ailesDeLaGardienne n'est pas activé");
        }
    }
}
