package main.java.projet_dice_forge.effet.EffetImmediat;

import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.Partie_Iles.Carte;
import main.java.projet_dice_forge.Partie_Iles.CarteEffetImmediat;
import main.java.projet_dice_forge.Ressource.FragementLunaire;
import main.java.projet_dice_forge.Ressource.FragementSolaire;
import main.java.projet_dice_forge.Ressource.Gloire;
import main.java.projet_dice_forge.Ressource.Ressource;

public class LEnigme extends CarteEffetImmediat {
    public LEnigme(){
        super(8,new Ressource[] {new FragementSolaire(6) }, new Gloire(10), false);
    }
    public void activerEffetCarte(Joueur joueur) {
        joueur.faveurMineur();
        joueur.faveurMineur();
        joueur.faveurMineur();
        joueur.faveurMineur();
    }
}
