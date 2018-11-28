package main.java.projet_dice_forge.Partie_Iles;



import main.java.projet_dice_forge.effet.EffetPermanent.LeMarteauDuForgeron;
import main.java.projet_dice_forge.effet.EffetImmediat.LecoffreDuForgeron;
import main.java.projet_dice_forge.effet.EffetImmediat.LesHerbesFolles;
import main.java.projet_dice_forge.effet.EffetImmediat.LesSabotsDargent;

import java.util.ArrayList;
import java.util.List;

public class PlateauDesIles {

        Iles IlesN1;

        Iles IlesN2;
        /*
        Iles IlesN3;
        Iles IlesN4;
        Iles IlesN5;
        Iles IlesN6;*/
        Iles IlesN7;

    public PlateauDesIles(){
        IlesN1();
        //IlesN1.printLsite();

        IlesN2();
        /*
        IlesN3();
        IlesN4();
        IlesN5();
        IlesN6();*/
        IlesN7();
        //IlesN7.printLsite();

      }


    private void IlesN1(){
        Iles iles = new Iles(1,false,2 );
        Carte carte = new LeMarteauDuForgeron();
        Carte carte1= new LecoffreDuForgeron();
        iles.ajouterCarte(carte, 2);
        iles.ajouterCarte(carte1, 2);
        this.IlesN1=iles;

    }

    private void IlesN2(){
        Iles iles = new Iles(2,false,2 );
        Carte carte = new LesSabotsDargent();
        //Carte carte1 = new Carte(4,"Les satyres",new int[] {3},new String[]{"PierredeLune"},6);
        iles.ajouterCarte(carte, 2);
       // iles.ajouterCarte(carte1, 2);
        this.IlesN2=iles;

    }

    /*

    private void IlesN3(){
        Iles iles = new Iles(3,false,2 );
        Carte carte = new Carte(5,"Le passeur",new int[] {4},new String[]{"PierredeLune"},12);
        Carte carte1 = new Carte(6,"Le casque d'invisiblité",new int[]{5},new String[]{"PierredeLune"},4);
        iles.ajouterCarte(carte, 2);
        iles.ajouterCarte(carte1, 2);
        this.IlesN3=iles;

    }


    private void IlesN4(){
        Iles iles = new Iles(4,false,3);
        Carte carte = new Carte(7,"La pince",new int[]{6},new String[]{"PierredeLune"},8);
        Carte carte1 = new Carte(8,"L'hydre",new int[]{5,5},new String[]{"PierredeLune,","PierredeSoleil"},26);
        Carte carte2 = new Carte(9,"L'enigme",new int[]{6},new String[]{"PierredeSoleil"},16);
        iles.ajouterCarte(carte, 2);
        iles.ajouterCarte(carte1, 2);
        iles.ajouterCarte(carte2, 2);
        this.IlesN4=iles;

    }

    private void IlesN5(){
        Iles iles = new Iles(5,false,2 );
        Carte carte = new Carte(10,"la méduse",new int[]{4},new String[]{"PierredeSoleil"},14);
        Carte carte1 = new Carte(11,"Le miroir abyssal",new int[]{5},new String[]{"PierredeSoleil"},10);
        iles.ajouterCarte(carte, 2);
        iles.ajouterCarte(carte1, 2);
        this.IlesN5=iles;

    }

    private void IlesN6(){
        Iles iles = new Iles(6,false,2 );
        Carte carte = new Carte(12,"Le minotaure",new int[]{3},new String[]{"PierredeSoleil"},8);
        Carte carte1 = new Carte(13,"Les ailes de la gardienne",new int[] {2},new String[]{"PierredeSoleil"},4);
        iles.ajouterCarte(carte, 2);
        iles.ajouterCarte(carte1, 2);
        this.IlesN6=iles;

    }
    */

    private void IlesN7(){
        Iles iles = new Iles(7,false,2 );
        Carte carte = new LesHerbesFolles();
       // Carte carte = new Carte(14,"Les herbes folles",new int[]{1},new String[]{"PierredeLune"},2,false,new LesHerbesFolles());
        //LesHerbesFolles(
        iles.ajouterCarte(carte, 2);
        //iles.ajouterCarte(carte1, 2);
        this.IlesN7=iles;

    }

    public Iles getIlesN7() {
        return IlesN7;
    }

    public Iles getIlesN1() {
        return IlesN1;
    }

    public Iles getIlesN2() {
        return IlesN2;
    }
}
