package main.java.projet_dice_forge.Partie_Iles;


import main.java.projet_dice_forge.effet.EffetImmediat.*;
import main.java.projet_dice_forge.effet.EffetPermanent.LAncien;
import main.java.projet_dice_forge.effet.EffetPermanent.LeMarteauDuForgeron;
import main.java.projet_dice_forge.effet.EffetPermanent.LesAilesDeLaGardienne;
import main.java.projet_dice_forge.effet.EffetPermanent.LesSabotsDargent;

import java.util.ArrayList;

public class PlateauDesIles {

        private int nbJoueur=2;

        ArrayList<Iles> iles;


    public PlateauDesIles(int nbJoueur){
        iles = new ArrayList<>();
        iles.add(IlesN1());
        iles.add(IlesN2());
        iles.add(IlesN3());
        iles.add(IlesN4());
        iles.add(IlesN5());
        iles.add(IlesN6());
        iles.add(IlesN7());

      }


    private Iles IlesN1(){

        Iles iles = new Iles(1,false,2 );
        for(int i = 0; i< nbJoueur; i++) {
            iles.ajouterCarte(new LecoffreDuForgeron());
            iles.ajouterCarte(new LeMarteauDuForgeron());
        }
        return iles;
    }

    private Iles IlesN2(){
        Iles iles = new Iles(2,false,2 );
        for (int i=0;i<nbJoueur;i++){
            iles.ajouterCarte(new LesSabotsDargent());
            iles.ajouterCarte(new LesSatyres());
        }
        return iles;
    }



    private Iles IlesN3(){
        Iles iles = new Iles(3,false,2 );
        for(int i =0;i < nbJoueur;i++){
            iles.ajouterCarte(new LePasseur());
            //iles.ajouterCarte(new Lecasqua);      Pas encore fait
        }

        return iles;


    }


    private Iles IlesN4(){
        Iles iles = new Iles(4,false,3);
        for(int i=0;i < nbJoueur;i++){
            iles.ajouterCarte(new LaPince());
            iles.ajouterCarte(new LHydre());
            iles.ajouterCarte(new LEnigme());
        }
        return iles;
    }

    private Iles IlesN5(){
        Iles iles = new Iles(5,false,2);
        for(int i=0;i < nbJoueur;i++){
            iles.ajouterCarte(new LaMeduse());
            //iles.ajouterCarte(new LeMiroir);
        }
        return iles;
    }

    private Iles IlesN6(){
        Iles iles = new Iles(6,false,2 );
        for(int i=0;i < nbJoueur;i++){
            iles.ajouterCarte(new LeMinotaure());
            iles.ajouterCarte(new LesAilesDeLaGardienne());
        }
        return iles;
    }


    private Iles IlesN7(){
        Iles iles = new Iles(7,false,2 );
        for(int i=0;i < nbJoueur;i++){
            iles.ajouterCarte(new LAncien());
            iles.ajouterCarte(new LesHerbesFolles());
        }
        return iles;
    }

//ICI UNE ERREUR

    public Iles getIlesNb(int nb){
        return iles.get(nb-1);
    }

    public Iles getIlesN1() {
        return getIlesNb(1);
    }

}
