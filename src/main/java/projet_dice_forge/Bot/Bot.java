package main.java.projet_dice_forge.Bot;

import main.java.projet_dice_forge.Partie_Bassin.Bassin;
import main.java.projet_dice_forge.Partie_Bassin.Temple;
import main.java.projet_dice_forge.Partie_Iles.Carte;
import main.java.projet_dice_forge.Partie_Iles.Iles;
import main.java.projet_dice_forge.Partie_Iles.PlateauDesIles;
import main.java.projet_dice_forge.Plateau_Joueur.Face;
import main.java.projet_dice_forge.Ressource.Ressource;
import java.util.ArrayList;
import java.util.List;


public class Bot extends Joueur {
protected   int tour=0;

    public Bot(int id) {
        super(id);
    }


    public void jouer(Temple temple, PlateauDesIles plateauDesIles) {
        tour++;
        ListeCarteEffetImmediat.forEach(Carte::activerCarte);
        ListeCarteEffetPermanent.forEach(Carte::activerCarte);
        setDetailTour("Joueur "+ (super.id+1) +"\n");
        this.lanceDe();
        setDetailTour ("gloire: "+ this.getPtGloire() + " or: "+ this.Plateau.getOr() +" FragementLuanire: " + this.Plateau.getFragmentLunaire() + " FragementSolaire: " + this.Plateau.getFragmentSolaire() +"\n");
    }
    public void setDetailTour(String detailTour){this.detailTour += detailTour;}

    /**
     * @return Une List de tout les bassins contenant toutes les faces achetable par le joueur
     */
    protected ArrayList<Bassin> getBassin(Temple temple){
        return temple.getBassinYouNeed(getPtOr());
    }

    protected Face[] getFace(int idDe){
        return getDe(idDe).toutesLesFaces();
    }

    /**
     * @return Un arrayList de Carte présent dans plateaDesIle que l'on peut acheter
     */
    protected ArrayList<Carte> getCarte(PlateauDesIles plateauDesIles){
        ArrayList<Carte> cartes = new ArrayList<>();
        ArrayList<Carte> res = new ArrayList<>();

        for(int i =0 ; i <plateauDesIles.getNbIle(); i++){
            Iles ile = plateauDesIles.getIlesNb(i+1);
            cartes.addAll(ile.getListCartes());
        }
        for(Carte c : cartes){
            if( c.getPrixLunaire() <= getPtLunaire() && c.getPrixSolaire() <= getPtSolaire()){
                res.add(c);
            }
        }

        return res;

    }

    protected Iles getIleFromCarte(Carte carte, PlateauDesIles plateauDesIles){
        for(int i =0 ; i <plateauDesIles.getNbIle(); i++){
            Iles ile = plateauDesIles.getIlesNb(i+1);
            ArrayList<Carte> cartes = ile.getListCartes();
            for(Carte c : cartes) {
                if (c == carte) {
                    return ile;
                }
            }
        }
        return null;
    }
}
