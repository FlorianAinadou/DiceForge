package main.java.projet_dice_forge.effet;

import main.java.projet_dice_forge.Carte;
import main.java.projet_dice_forge.Joueur;

public class EffetImmediat extends Effet {



    EffetImmediat(Joueur joueur, Carte carte){
        super(joueur,carte);
        attributionPointDeGloire();
    }




    void appliquerEffetCarte(){
        switch(carte){
            case LesHerbesFolles :
                lesHerbesfolles();
                break;

            case LeCoffreDuForgeron:
                leCoffreDuForgeron();

        }


    }



    void lesHerbesfolles(){
        joueur.getPlateauDuJoueur().ajouterOr(3);
        joueur.getPlateauDuJoueur().ajoutFragLun(3);
    }

    void leCoffreDuForgeron(){
        joueur.getPlateauDuJoueur().setMaxOr((joueur.getPlateauDuJoueur().getMaxOr()) + 4);
        joueur.getPlateauDuJoueur().setFragmentLunaire(joueur.getPlateauDuJoueur().getMaxFragLun() + 3);
        joueur.getPlateauDuJoueur().setFragmentSolaire(joueur.getPlateauDuJoueur().getMaxFragLun() + 3);
    }













}
