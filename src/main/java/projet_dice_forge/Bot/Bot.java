package main.java.projet_dice_forge.Bot;

import main.java.projet_dice_forge.Partie_Bassin.Temple;
import main.java.projet_dice_forge.Partie_Iles.PlateauDesIles;

public class Bot extends Joueur {
    protected String detailTour;

    Bot(int id) {
        super(id);
    }

    public String getDetailTour() {
        return detailTour;
    }

    public void jouer(Temple temple, PlateauDesIles plateauDesIles) {
        this.lanceDe();
        setDetailTour ("Joueur "+ super.id + "\ngloire: "+ this.getPtGloire() + " or: "+ this.Plateau.getOr() +" FragementLuanire: " + this.Plateau.getFragmentLunaire() + " FragementSolaire: " + this.Plateau.getFragmentSolaire() +"\n");
    }
    public void setDetailTour(String detailTour){this.detailTour=detailTour;}
}
