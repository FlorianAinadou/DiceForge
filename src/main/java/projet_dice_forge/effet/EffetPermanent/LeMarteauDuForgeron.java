package main.java.projet_dice_forge.effet.EffetPermanent;

import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.Partie_Iles.Carte;
import main.java.projet_dice_forge.Partie_Iles.CarteEffetImmediatRelJoueur;
import main.java.projet_dice_forge.Partie_Iles.CarteEffetImmediatRelRessource;
import main.java.projet_dice_forge.Partie_Iles.CarteEffetPermanent;
import main.java.projet_dice_forge.Plateau_Joueur.Face;
import main.java.projet_dice_forge.Ressource.FragementLunaire;
import main.java.projet_dice_forge.Ressource.Gloire;
import main.java.projet_dice_forge.Ressource.Or;
import main.java.projet_dice_forge.Ressource.Ressource;


import java.util.Random;

public class LeMarteauDuForgeron extends CarteEffetImmediatRelRessource {
    public int cursseurLeMarteau =0;
    public boolean PremierTour =false;
    public boolean DeuxiemeTour =false;
    public int CursseurTour1=0;
    public  int CursseurTour2=0;
    public boolean EffetCarteFini=false;



    public LeMarteauDuForgeron() {
        super(11,"Le Marteau du Forgeron", new Ressource[] {new FragementLunaire(1) }, new Gloire(0), false);
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

    /**
     *Cette méthode nous permet d'appliquer l'effet de la carte en fonction de la position du joueur dans la quete le marteau du forgeron
     * @param joueur
     * @param choixOrQuete
     * @param choixOrStoker
     */

    public void activerCetteEffetSousPartit(Joueur joueur,int choixOrQuete,int choixOrStoker){

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

    /**
     *Cette méthode active l'effet de la carte Le marteau du forgeron on fonction du dé choisis lors de la faveur mineur.
     * @param joueur
     */

    public void activerCetteEffet(Joueur joueur) {
        Random Alea = new Random();

        if (joueur.getNbAlea() == 0) {
            int choixOrQuete = Alea.nextInt(joueur.claire.getValeurFace() + 1);
            int choixOrStoker = joueur.claire.getValeurFace() - choixOrQuete;

            activerCetteEffetSousPartit(joueur,choixOrQuete,choixOrStoker);

        } else {
            int choixOrQuete = Alea.nextInt(joueur.sombre.getValeurFace() + 1);
            int choixOrStoker = joueur.sombre.getValeurFace() - choixOrQuete;

            activerCetteEffetSousPartit(joueur,choixOrQuete,choixOrStoker);


        }
    }

    /**
     *Cette méthode attribut les points de gloires gagner par la quete le marteau du forgeron.
     * @param joueur
     */

    public void donnerLesPointsDeGloire(Joueur joueur){
        if(isPremierTour() && (CursseurTour1 == 0)){
            joueur.getPlateauDuJoueur().ajouterPointDeGloire(10);
            this.CursseurTour1=1;
        }
        else if (isDeuxiemeTour() && (CursseurTour2 ==0)){
            joueur.getPlateauDuJoueur().ajouterPointDeGloire(15);
            this.CursseurTour2=1;

        }
    }

    /**
     *
     * Cette méthode permet d'attribuer de l'or dans la quete le marteau du forgeron (dépenser de l'or dans la quete)
     * @param joueur
     * @param NbOr
     */

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


