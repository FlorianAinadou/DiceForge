package main.java.projet_dice_forge.Partie_Iles;

import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.Gestion_du_Jeu.Jeu;
import main.java.projet_dice_forge.Ressource.Gloire;
import main.java.projet_dice_forge.Ressource.Ressource;

import java.util.ArrayList;

public abstract class CarteEffetImmediatRelJoueur extends Carte {

    public CarteEffetImmediatRelJoueur(int idCarte, Ressource[] prix , Gloire gloire, boolean activerOuPas){
        super(idCarte,prix,gloire,activerOuPas);
    }

    public abstract void activerEffetImmCarteRealJoueur(Joueur joueur);


}
