package main.java.projet_dice_forge.effet.EffetImmediat;

import main.java.projet_dice_forge.Bot.Joueur;

import main.java.projet_dice_forge.Partie_Iles.CarteEffetImmediat;
import main.java.projet_dice_forge.Ressource.FragementSolaire;
import main.java.projet_dice_forge.Ressource.Gloire;
import main.java.projet_dice_forge.Ressource.Ressource;

import java.util.Random;

public class LEnigme extends CarteEffetImmediat {
    int nbFaveurMineur;
    int i;
    public LEnigme(){
        super(8,new Ressource[] {new FragementSolaire(6) }, new Gloire(10), false);
    }


    public void activerEffetCarte(Joueur joueur) {

            for (i = 0; i < 4; i++) {
                Random random = new Random();
                int nbAlea = random.nextInt(2);
                joueur.faveurMineurChoix(nbAlea);
            }

    }

    //////////////////////////////méthode qui nous permet de vérifier ///////////////////////////////////
}
