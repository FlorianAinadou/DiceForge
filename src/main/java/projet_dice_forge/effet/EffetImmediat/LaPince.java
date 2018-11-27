package main.java.projet_dice_forge.Effet.EffetImmediat;

import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.Partie_Iles.Carte;

public class LaPince extends Carte {

    public LaPince(){
        super(7, new int[]{6}, new String[]{"fragementLunaire"}, 8, false,1);

    }
    public void activerEffetCarte(Joueur joueur) {
        joueur.lanceDe();
        joueur.lanceDe();
    }
}
