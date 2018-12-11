package main.java.projet_dice_forge.Partie_Iles;

import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.Gestion_du_Jeu.Jeu;
import main.java.projet_dice_forge.Ressource.Gloire;
import main.java.projet_dice_forge.Ressource.Ressource;

import java.util.ArrayList;
import java.util.List;

public abstract class CarteEffetImmediat extends Carte {

    public CarteEffetImmediat(int idCarte,String nomDeLexploit, Ressource[] prix , Gloire gloire, boolean activerOuPas){
        super(idCarte,nomDeLexploit,prix,gloire,activerOuPas);
    }

    public abstract void activerEffetCarte(Joueur joueur);




}
