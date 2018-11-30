package main.java.projet_dice_forge.effet.EffetImmediat;

import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.Partie_Iles.CarteEffetImmediat;
import main.java.projet_dice_forge.Ressource.FragementLunaire;
import main.java.projet_dice_forge.Ressource.FragementSolaire;
import main.java.projet_dice_forge.Ressource.Gloire;
import main.java.projet_dice_forge.Ressource.Ressource;

public class LesHerbesFolles extends CarteEffetImmediat {




    public LesHerbesFolles() {
        super(1,new Ressource[] {new FragementSolaire(1) },new Gloire(2),false);
    }


    @Override
    public void activerEffetCarte(Joueur joueur) {
        if(!this.isActiverOuPas()){
            joueur.getPlateauDuJoueur().ajouterOr(3);
            joueur.getPlateauDuJoueur().ajouterFragLun(3);

        }
        else{
            System.out.println("mouk");
        }
    }
}
