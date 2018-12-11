package main.java.projet_dice_forge.effet.EffetImmediat;

import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.Partie_Iles.CarteEffetImmediat;
import main.java.projet_dice_forge.Ressource.FragementSolaire;
import main.java.projet_dice_forge.Ressource.Gloire;
import main.java.projet_dice_forge.Ressource.Ressource;

public class LaMeduse extends CarteEffetImmediat {
    public LaMeduse(){
        super(1,"La Méduse", new Ressource[] {new FragementSolaire(4)}, new Gloire(14), false);
    }

    public void activerEffetCarte(Joueur joueur) {

    }


}
