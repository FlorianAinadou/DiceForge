package main.java.projet_dice_forge;

import java.util.HashMap;

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

    public void effetCarte(){

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
}
