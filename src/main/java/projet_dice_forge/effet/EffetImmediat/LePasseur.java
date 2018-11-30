package main.java.projet_dice_forge.effet.EffetImmediat;

import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.Partie_Iles.Carte;
import main.java.projet_dice_forge.Partie_Iles.CarteEffetImmediat;
import main.java.projet_dice_forge.Ressource.FragementLunaire;
import main.java.projet_dice_forge.Ressource.Gloire;
import main.java.projet_dice_forge.Ressource.Ressource;

public class LePasseur extends CarteEffetImmediat {
    public LePasseur() {
        super(6,new Ressource[] {new FragementLunaire(4) },new Gloire(12),false);
    }

    public void activerEffetCarte(Joueur joueur) {
    }




}
