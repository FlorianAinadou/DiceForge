package main.java.projet_dice_forge.Partie_Iles;

import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.Ressource.Gloire;
import main.java.projet_dice_forge.Ressource.Ressource;

public abstract class CarteEffetPermanent extends Carte {

    public CarteEffetPermanent(int idCarte, Ressource[] prix, Gloire gloire, boolean activerOuPas){
        super(idCarte,prix,gloire,activerOuPas);
    }

    public abstract void activerEffetCarte(Joueur joueur);
}
