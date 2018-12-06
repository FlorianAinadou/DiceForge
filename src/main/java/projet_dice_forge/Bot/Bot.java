package main.java.projet_dice_forge.Bot;

import main.java.projet_dice_forge.Partie_Bassin.Temple;
import main.java.projet_dice_forge.Partie_Iles.PlateauDesIles;

public class Bot extends Joueur {


    public Bot(int id) {
        super(id);
    }


    public void jouer(Temple temple, PlateauDesIles plateauDesIles) {
        this.lanceDe();
        setDetailTour ("Joueur "+ (super.id+1) + "\ngloire: "+ this.getPtGloire() + " or: "+ this.Plateau.getOr() +" FragementLuanire: " + this.Plateau.getFragmentLunaire() + " FragementSolaire: " + this.Plateau.getFragmentSolaire() +"\n");
    }
    public void setDetailTour(String detailTour){this.detailTour=detailTour;}
}
