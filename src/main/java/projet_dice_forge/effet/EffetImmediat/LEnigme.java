package main.java.projet_dice_forge.effet;

import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.Partie_Iles.Carte;

public class LEnigme extends Carte {
    public LEnigme(){
        super(8, new int[]{6}, new String[]{"fragementSolaire"}, 10, false,1);
    }
    public void activerEffetCarte(Joueur joueur) {
        joueur.faveurMineur();
        joueur.faveurMineur();
        joueur.faveurMineur();
        joueur.faveurMineur();
    }
}
