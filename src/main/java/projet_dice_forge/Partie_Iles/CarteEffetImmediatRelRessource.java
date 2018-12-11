package main.java.projet_dice_forge.Partie_Iles;

import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.Plateau_Joueur.Face;
import main.java.projet_dice_forge.Ressource.Gloire;
import main.java.projet_dice_forge.Ressource.Ressource;

public abstract class CarteEffetImmediatRelRessource extends Carte {
    public CarteEffetImmediatRelRessource(int idCarte,String nomDeLexploit, Ressource[] prix, Gloire gloire, boolean activerOuPas){
        super(idCarte,nomDeLexploit,prix,gloire,activerOuPas);
    }

    public abstract void activerEffetCarteImmRelRessource(Joueur joueur);
}

