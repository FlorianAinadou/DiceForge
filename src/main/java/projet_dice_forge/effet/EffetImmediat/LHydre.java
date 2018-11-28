package main.java.projet_dice_forge.Effet.EffetImmediat;

import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.Partie_Iles.CarteEffetImmediat;

public class LHydre extends CarteEffetImmediat {

    public LHydre(){
        super(8, new int[]{5,5}, new String[]{"fragementLunaire","fragementSolaire"}, 26, false);
    }

    public void activerEffetCarte(Joueur joueur) {

    }
}


