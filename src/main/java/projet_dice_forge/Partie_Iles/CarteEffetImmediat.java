package main.java.projet_dice_forge.Partie_Iles;

import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.Ressource.Ressource;

import java.util.ArrayList;
import java.util.List;

public abstract class CarteEffetImmediat extends Carte {

    public CarteEffetImmediat(int idCarte, Ressource[] prix , int pointDeGloire, boolean activerOuPas){
        super(idCarte,prix,pointDeGloire,activerOuPas);
    }

    public abstract void activerEffetCarte(Joueur joueur);



}
