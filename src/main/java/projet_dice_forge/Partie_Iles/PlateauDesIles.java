package main.java.projet_dice_forge.Partie_Iles;


import main.java.projet_dice_forge.effet.EffetImmediat.LeMinotaure;
import main.java.projet_dice_forge.effet.EffetImmediat.LecoffreDuForgeron;
import main.java.projet_dice_forge.effet.EffetImmediat.LesHerbesFolles;
import main.java.projet_dice_forge.effet.EffetPermanent.LesSabotsDargent;

import java.util.ArrayList;

public class PlateauDesIles {

        ArrayList<Iles> iles;


    public PlateauDesIles(){
        iles = new ArrayList<>();
        iles.add(IlesN1());
        iles.add(IlesN2());
        iles.add(IlesN6());
        iles.add(IlesN7());

      }


    private Iles IlesN1(){
        Iles iles = new Iles(1,false,2 );
        //Carte carte = new LeMarteauDuForgeron();
        Carte carte1= new LecoffreDuForgeron();
        Carte carte2= new LecoffreDuForgeron();
        //iles.ajouterCarte(carte, 2);
        iles.ajouterCarte(carte1);
		iles.ajouterCarte(carte2);
        return iles;
    }

    private Iles IlesN2(){
        Iles iles = new Iles(2,false,2 );
        Carte carte = new LesSabotsDargent();
        Carte carte1 = new LesSabotsDargent();
        //Carte carte1 = new Carte(4,"Les satyres",new int[] {3},new String[]{"PierredeLune"},6);
        iles.ajouterCarte(carte);
		iles.ajouterCarte(carte1);
       // iles.ajouterCarte(carte1, 2);
        return iles;

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
*/
    private Iles IlesN6(){
        Iles iles = new Iles(6,false,2 );
        Carte carte = new LeMinotaure();
        //Carte carte1 = new
        iles.ajouterCarte(carte);
       //iles.ajouterCarte(carte1, 2);
        return iles;

    }


    private Iles IlesN7(){
        Iles iles = new Iles(7,false,2 );
        Carte carte = new LesHerbesFolles();
       // Carte carte = new Carte(14,"Les herbes folles",new int[]{1},new String[]{"PierredeLune"},2,false,new LesHerbesFolles());
        //LesHerbesFolles(
        iles.ajouterCarte(carte);
        //iles.ajouterCarte(carte1, 2);
        return iles;

    }

    public Iles getIlesNb(int nb){
        return iles.get(nb-1);
    }

    public Iles getIlesN1() {
        return getIlesNb(1);
    }

}
