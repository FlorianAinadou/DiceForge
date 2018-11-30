package main.java.projet_dice_forge.Partie_Iles;

import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.Ressource.Ressource;

public abstract class CarteEffetPermanent extends Carte {

    public CarteEffetPermanent(int idCarte, Ressource[] prix, int pointDeGloire, boolean activerOuPas){
        super(idCarte,prix,pointDeGloire,activerOuPas);
    }

    public abstract void activerEffetCarte(Joueur joueur);
}
