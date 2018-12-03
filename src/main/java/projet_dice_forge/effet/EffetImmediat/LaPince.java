package main.java.projet_dice_forge.effet.EffetImmediat;

import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.Partie_Iles.Carte;
import main.java.projet_dice_forge.Partie_Iles.CarteEffetImmediat;
import main.java.projet_dice_forge.Ressource.FragementLunaire;
import main.java.projet_dice_forge.Ressource.Gloire;
import main.java.projet_dice_forge.Ressource.Ressource;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LaPince extends CarteEffetImmediat {

    public LaPince(){
        super(7, new Ressource[] {new FragementLunaire(6) },new Gloire(8), false);
    }
    public void activerEffetCarte(Joueur joueur) {
            joueur.lanceDe();
            joueur.lanceDe();

    }
}
