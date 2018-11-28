package main.java.projet_dice_forge.Effet.EffetImmediat;

import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.Partie_Iles.Carte;
import main.java.projet_dice_forge.Partie_Iles.CarteEffetImmediat;

public class LesHerbesFolles extends CarteEffetImmediat {




    public LesHerbesFolles() {
        super(1,new int[]{1},new String[]{"PierredeSolail"},2,false);
    }


    @Override
    public void activerEffetCarte(Joueur joueur) {
        if(!this.isActiverOuPas()){
            joueur.getPlateauDuJoueur().ajouterOr(3);
            joueur.getPlateauDuJoueur().ajoutFragLun(3);

        }
        else{
            System.out.println("mouk");
        }
    }
}
