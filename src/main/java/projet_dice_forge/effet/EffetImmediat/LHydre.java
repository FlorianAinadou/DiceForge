package main.java.projet_dice_forge.effet.EffetImmediat;

import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.Partie_Iles.CarteEffetImmediat;
import main.java.projet_dice_forge.Ressource.FragementLunaire;
import main.java.projet_dice_forge.Ressource.FragementSolaire;
import main.java.projet_dice_forge.Ressource.Gloire;
import main.java.projet_dice_forge.Ressource.Ressource;

public class LHydre extends CarteEffetImmediat {

    public LHydre(){
        super(9,"L'Hydre", new Ressource[] {new FragementLunaire(5), new FragementSolaire(5)}, new Gloire(26), false);
    }

    public void activerEffetCarte(Joueur joueur) {

    }
}


