package main.java.projet_dice_forge;


import main.java.projet_dice_forge.effet.Effet;
import main.java.projet_dice_forge.effet.EffetImmediat;

public enum Carte {

    ///////////////////////////CarteLunaire/////////////////////////////////////////////////////////////
    LeMarteauDuForgeron(1,"Le Marteau Du forgeron",new int[]{1},new String[]{"PierredeLune"},0),
    LeCoffreDuForgeron(2,"le coffre du forgeron",new int[]{1},new String[]{"PierredeLune"},2),

    LaGrandeOurse(3,"La grande ourse",new int[]{2},new String[]{"PierredeLune"},2),
    LesSabotsDargent(4,"Les Sabots D'argents",new int[]{2},new String[]{"PierredeLune"},2),
    LesSatyres(5,"Les Satyres",new int[]{3},new String[]{"PierredeLune"},6),
    LeSanglierAcharne(6,"Le sanglier Acharné",new int[]{3},new String[]{"PierredeLune"},4),
    ///////////////////////CarteSolaire/////////////////////////////////////////////////////////////////
    LesHerbesFolles(14,"Les herbes folles",new int[]{1},new String[]{"PierredeLune"},2),
    LAncien(15,"L'ancien",new int[] {1},new String[]{"PierredeSoleil"},0);




    private String nomDeLexploit;
    private int[] prix;
    private String[] Ressource;
    private int pointDeGloire;
    private int idCarte;
    private boolean activerOuPas;

    Carte(int idCarte, String nomDeLexploit, int[] prix, String[] Ressource, int pointDeGloire){
        this.nomDeLexploit=nomDeLexploit;
        this.prix = prix;
        this.Ressource = Ressource;
        this.pointDeGloire=pointDeGloire;
        this.idCarte=idCarte;
        this.activerOuPas=false;
    }

    public int getIdCarte() {
        return idCarte;
    }

    public void afficherCarte(){
        System.out.println(this.nomDeLexploit);
    }

    public int getPrix(int i){
        return this.prix[i];
    }
    public String getRessource(int i) {
        return this.Ressource[i];
    }
    public int getPointDeGloire(){
        return this.pointDeGloire;
    }

    public String getNomDeLexploit() {
        return nomDeLexploit;
    }
}
























/*
public class Carte {
    private String nomDeLexploit;
    private int[] prix;
    private String[] Ressource;
    private int pointDeGloire;
    private int idCarte;

    public Carte(int idCarte,String nomDeLexploit,int[] prix, String[] Ressource, int pointDeGloire){
        this.nomDeLexploit=nomDeLexploit;
        this.prix = prix;
        this.Ressource = Ressource;
        this.pointDeGloire=pointDeGloire;
        this.idCarte=idCarte;
    }

    public void afficherCarte(){
        System.out.println(this.nomDeLexploit);
    }

    public int getPrix(int i){
        return this.prix[i];
    }
    public String getRessource(int i) {
        return this.Ressource[i];
    }
    public int getPointDeGloire(){
        return this.pointDeGloire;
    }


    public void activerCarte(){
        switch(idCarte){
            case 1:
                activerCoffreDuForgeron();
                break;

        }
    }

    void activerCoffreDuForgeron(){


    }
}
*/





