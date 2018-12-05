package main.java.projet_dice_forge.Partie_Iles;

import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.Ressource.Gloire;
import main.java.projet_dice_forge.Ressource.Ressource;
import main.java.projet_dice_forge.effet.EffetImmediat.LesHerbesFolles;

import java.util.ArrayList;


public class Carte implements Cloneable {

    protected String nomDeLexploit;
    protected Ressource[] prix;
    protected Gloire gloire;
    protected int idCarte;
    protected boolean activerOuPas;


    public Carte(int idCarte,String nomDeLexploit,Ressource[] prix, Gloire gloire,boolean activerOuPas){
        this.nomDeLexploit=nomDeLexploit;
        this.prix = prix;
        this.gloire=gloire;
        this.idCarte=idCarte;
        this.activerOuPas=false;
    }
    public Carte(int idCarte,Ressource[] prix, Gloire gloire,boolean activerOuPas){
        this.idCarte=idCarte;
        this.prix = prix;
        this.gloire=gloire;
        this.activerOuPas=false;

    }

//    public abstract void activerEffetCarte(Joueur joueur);



    public void afficherCarte(){
        System.out.println(this.nomDeLexploit);
    }

    public int getIdCarte() {
        return idCarte;
    }

    public Ressource[] getPrix(){return this.prix;}

    public Gloire getPointDeGloire(){
        return this.gloire;
    }

    public void setIdCarte(int idCarte) {
        this.idCarte = idCarte;
    }

    public void setNomDeLexploit(String nomDeLexploit) {
        this.nomDeLexploit = nomDeLexploit;
    }

    public void setPointDeGloire(Gloire gloire) {
        this.gloire= gloire;
    }

    public void setPrix(Ressource[] prix) {
        this.prix = prix;
    }

    public void activerCarte(){
        this.activerOuPas=true;
    }

    public boolean isActiverOuPas() {
        return activerOuPas;
    }
    public void desactiverCarte(){
        this.activerOuPas=false;

    }




}






