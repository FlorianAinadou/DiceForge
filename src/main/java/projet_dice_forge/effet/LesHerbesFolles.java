package main.java.projet_dice_forge.effet;

import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.Partie_Iles.Carte;

public class LesHerbesFolles extends Carte {



    public LesHerbesFolles() {
        super(1,new int[]{1},new String[]{"PierredeSolail"},2,false);
    }
    
    public void activerEffetCarte(Joueur joueur) {
        if(this.isActiverOuPas()){
            joueur.getPlateauDuJoueur().ajouterOr(3);
            joueur.getPlateauDuJoueur().ajoutFragLun(3);

        }
    }
}
