package main.java.projet_dice_forge.effet.EffetImmediat;

import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.Partie_Iles.Carte;
import main.java.projet_dice_forge.Partie_Iles.CarteEffetImmediat;
import main.java.projet_dice_forge.Ressource.FragementLunaire;
import main.java.projet_dice_forge.Ressource.Gloire;
import main.java.projet_dice_forge.Ressource.Ressource;

public class LesSabotsDargent extends CarteEffetImmediat {


    public LesSabotsDargent(){
        super(4,new Ressource[] {new FragementLunaire(2) }, new Gloire(2),false);
    }

    public void activerEffetCarte(Joueur joueur) {
        if (this.isActiverOuPas()) {
            joueur.faveurMineur();
        }
        else{
            System.out.println("je suis bete");
        }
    }




}
