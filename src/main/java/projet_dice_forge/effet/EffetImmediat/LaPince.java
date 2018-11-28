package main.java.projet_dice_forge.effet.EffetImmediat;

import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.Partie_Iles.Carte;
import main.java.projet_dice_forge.Partie_Iles.CarteEffetImmediat;

public class LaPince extends CarteEffetImmediat {

    public LaPince(){
        super(7, new int[]{6}, new String[]{"fragementLunaire"}, 8, false);

    }
    public void activerEffetCarte(Joueur joueur) {
        joueur.lanceDe();
        joueur.lanceDe();
    }
}
