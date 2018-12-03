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
        super(4,new Ressource[] {new FragementLunaire(2) }, new Gloire(2),false);
    }

    public void activerEffetCartePerm(Joueur joueur) {
        if (this.isActiverOuPas()) {
            joueur.faveurMineur();
        }
        else{
            System.out.println("La carte les Sabots d'argent n'est pas activé");
        }
    }




}
