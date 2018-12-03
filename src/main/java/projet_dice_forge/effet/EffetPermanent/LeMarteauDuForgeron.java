package main.java.projet_dice_forge.effet.EffetPermanent;

import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.Partie_Iles.Carte;
import main.java.projet_dice_forge.Partie_Iles.CarteEffetImmediatRelJoueur;
import main.java.projet_dice_forge.Partie_Iles.CarteEffetImmediatRelRessource;
import main.java.projet_dice_forge.Partie_Iles.CarteEffetPermanent;
import main.java.projet_dice_forge.Ressource.FragementLunaire;
import main.java.projet_dice_forge.Ressource.Gloire;
import main.java.projet_dice_forge.Ressource.Or;
import main.java.projet_dice_forge.Ressource.Ressource;

import java.util.Random;

public class LeMarteauDuForgeron extends CarteEffetImmediatRelRessource {
    public int cursseurLeMarteau =0;




    public LeMarteauDuForgeron() {
        super(2, new Ressource[] {new FragementLunaire(1) }, new Gloire(0), false);
    }




    public void activerEffetCarteImmRelRessource(Joueur joueur) {
        joueur.setActiverEffetLeMarteauDuForgeron(true);



    }

    public void premierTour(Joueur joueur){
    }
}


