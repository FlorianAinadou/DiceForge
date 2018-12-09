package main.java.projet_dice_forge.Bot;

import main.java.projet_dice_forge.Partie_Bassin.Bassin;
import main.java.projet_dice_forge.Partie_Bassin.Temple;
import main.java.projet_dice_forge.Partie_Iles.PlateauDesIles;
import main.java.projet_dice_forge.Plateau_Joueur.Face;

import java.util.ArrayList;
import java.util.List;


public class Bot extends Joueur {
protected   int tour=0;

    public Bot(int id) {
        super(id);
    }


    public void jouer(Temple temple, PlateauDesIles plateauDesIles) {
        tour++;
        this.lanceDe();
        setDetailTour ("Joueur "+ (super.id+1) + "\ngloire: "+ this.getPtGloire() + " or: "+ this.Plateau.getOr() +" FragementLuanire: " + this.Plateau.getFragmentLunaire() + " FragementSolaire: " + this.Plateau.getFragmentSolaire() +"\n");
    }
    public void setDetailTour(String detailTour){this.detailTour=detailTour;}

    protected ArrayList<Bassin> getBassin(Temple temple){
        return temple.getBassinYouNeed(getPtOr());
    }

    protected Face[] getFace(int idDe){
        return getDe(idDe).toutesLesFaces();
    }
}
