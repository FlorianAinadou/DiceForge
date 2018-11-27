package main.java.projet_dice_forge.effet;

import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.Partie_Iles.Carte;

public class LesSabotsDargent extends Carte {


    public LesSabotsDargent(){
        super(4, new int[]{1}, new String[]{"PierredeLune"}, 2,false,1);
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
