package main.java.projet_dice_forge.effet.EffetPermanent;

import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.Partie_Iles.Carte;
import main.java.projet_dice_forge.Partie_Iles.CarteEffetImmediat;
import main.java.projet_dice_forge.Partie_Iles.CarteEffetPermanent;
import main.java.projet_dice_forge.Ressource.FragementLunaire;
import main.java.projet_dice_forge.Ressource.Gloire;
import main.java.projet_dice_forge.Ressource.Ressource;

public class LesSabotsDargent extends CarteEffetPermanent {


    public LesSabotsDargent(){
        super(13,"Les sabots de la gardienne ",new Ressource[] {new FragementLunaire(2) }, new Gloire(2),false);
    }

    public void activerEffetCartePerm(Joueur joueur) {
            joueur.faveurMineur();
    }




}