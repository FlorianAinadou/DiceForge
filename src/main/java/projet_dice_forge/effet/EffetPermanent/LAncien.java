package main.java.projet_dice_forge.effet.EffetPermanent;

import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.Partie_Iles.Carte;
import main.java.projet_dice_forge.Partie_Iles.CarteEffetPermanent;

public class LAncien extends CarteEffetPermanent {

    public LAncien(Joueur joueur){
        super(4, new int[]{1}, new String[]{"PierredeSolail"}, 2,false);
    }

    @Override
    public void activerEffetCarte(Joueur joueur) {

    }
}


