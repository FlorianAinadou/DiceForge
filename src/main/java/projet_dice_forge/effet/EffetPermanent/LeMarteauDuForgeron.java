package main.java.projet_dice_forge.effet.EffetPermanent;

import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.Partie_Iles.Carte;
import main.java.projet_dice_forge.Partie_Iles.CarteEffetImmediatRelJoueur;
import main.java.projet_dice_forge.Partie_Iles.CarteEffetImmediatRelRessource;
import main.java.projet_dice_forge.Partie_Iles.CarteEffetPermanent;
import main.java.projet_dice_forge.Ressource.FragementLunaire;
import main.java.projet_dice_forge.Ressource.Gloire;
import main.java.projet_dice_forge.Ressource.Or;
import main.java.projet_dice_forge.Ressource.Ressource;
import sun.misc.ClassFileTransformer;

import java.util.Random;

public class LeMarteauDuForgeron extends CarteEffetImmediatRelRessource {
    public int cursseurLeMarteau =0;
    public boolean PremierTour =false;
    public boolean DeuxiemeTour =false;
    public int CursseurTour1=0;
    public  int CursseurTour2=0;
    public boolean EffetCarteFini=false;



    public LeMarteauDuForgeron() {
        super(2, new Ressource[] {new FragementLunaire(1) }, new Gloire(0), false);
    }




    public void activerEffetCarteImmRelRessource(Joueur joueur) {


        if (joueur.isActiverEffetLeMarteauDuForgeron()){
            activerCetteEffet(joueur);
            donnerLesPointsDeGloire(joueur);

        }
        else{
            joueur.setActiverEffetLeMarteauDuForgeron(true);
        }

    }

    public void activerCetteEffet(Joueur joueur){
        Random Alea =new Random();

        int choixOrQuete=Alea.nextInt(joueur.claire.getValeurFace()+1);
        int choixOrStoker= joueur.claire.getValeurFace() - choixOrQuete;


        if(( (choixOrStoker + cursseurLeMarteau) < 30) && ((choixOrStoker + cursseurLeMarteau)) >= 15)  {
            ajoutOrQuete(joueur, choixOrQuete);
            PremierTourActiver(true);
        }

        else if ( ((choixOrStoker + cursseurLeMarteau) >= 0 ) && (((choixOrStoker + cursseurLeMarteau) < 15 ))){
            ajoutOrQuete(joueur,choixOrQuete);
        }

        else if ((choixOrStoker + cursseurLeMarteau) == 30){
            DeuxiemeTourActiver(true);
            joueur.getListeCarteEffetImmediatRelRessource().remove(0);
        }
        else if ((choixOrStoker + cursseurLeMarteau) > 30 ){
            System.out.println("on ne peut pas dépenser plus d'or");

        }

    }

    public void donnerLesPointsDeGloire(Joueur joueur){
        if(isPremierTour() && (CursseurTour1 == 0)){
            joueur.getPlateauDuJoueur().ajouterPointDeGloire(15);
            this.CursseurTour1=1;
        }
        else if (isDeuxiemeTour() && (CursseurTour2 ==0)){
            joueur.getPlateauDuJoueur().ajouterPointDeGloire(15);
            this.CursseurTour2=1;

        }
    }

    public void ajoutOrQuete(Joueur joueur,int NbOr){
        this.cursseurLeMarteau=cursseurLeMarteau+NbOr;
    }

    public void setCursseurLeMarteau(int cursseurLeMarteau) {
        this.cursseurLeMarteau = cursseurLeMarteau;
    }

    public void PremierTourActiver(boolean premierTour) {
        PremierTour = premierTour;
    }

    public void DeuxiemeTourActiver(boolean deuxiemeTour) {
        DeuxiemeTour = deuxiemeTour;
    }

    public boolean isDeuxiemeTour() {
        return DeuxiemeTour;
    }

    public boolean isPremierTour() {
        return PremierTour;
    }

    public boolean isEffetCarteFini() {
        return EffetCarteFini;
    }

    public void setEffetCarteFini(boolean effetCarteFini) {
        EffetCarteFini = effetCarteFini;
    }
}


