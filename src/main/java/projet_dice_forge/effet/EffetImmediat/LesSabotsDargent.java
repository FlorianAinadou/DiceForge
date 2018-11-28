package main.java.projet_dice_forge.Effet.EffetImmediat;

import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.Partie_Iles.Carte;
import main.java.projet_dice_forge.Partie_Iles.CarteEffetImmediat;

public class LesSabotsDargent extends CarteEffetImmediat {


    public LesSabotsDargent(){
        super(4, new int[]{1}, new String[]{"PierredeLune"}, 2,false);
    }

    public void activerEffetCarte(Joueur joueur) {
        if (this.isActiverOuPas()) {
            joueur.faveurMineur();
        }
        else{
            System.out.println("je suis bete");
        }
    }




}
