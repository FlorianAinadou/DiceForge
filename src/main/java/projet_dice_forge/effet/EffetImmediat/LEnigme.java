package main.java.projet_dice_forge.Effet.EffetImmediat;

import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.Partie_Iles.Carte;
import main.java.projet_dice_forge.Partie_Iles.CarteEffetImmediat;

public class LEnigme extends CarteEffetImmediat {
    public LEnigme(){
        super(8, new int[]{6}, new String[]{"fragementSolaire"}, 10, false);
    }
    public void activerEffetCarte(Joueur joueur) {
        joueur.faveurMineur();
        joueur.faveurMineur();
        joueur.faveurMineur();
        joueur.faveurMineur();
    }
}
