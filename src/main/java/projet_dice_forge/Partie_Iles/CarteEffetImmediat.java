package main.java.projet_dice_forge.Partie_Iles;

import main.java.projet_dice_forge.Bot.Joueur;

public abstract class CarteEffetImmediat extends Carte {

    public CarteEffetImmediat(int idCarte,int[] prix, String[] Ressource, int pointDeGloire,boolean activerOuPas){
        super(idCarte,prix,Ressource,pointDeGloire,activerOuPas);
    }

    public abstract void activerEffetCarte(Joueur joueur);


}
