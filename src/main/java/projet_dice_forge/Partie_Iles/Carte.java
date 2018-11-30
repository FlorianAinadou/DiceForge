package main.java.projet_dice_forge.Partie_Iles;

import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.effet.EffetImmediat.LesHerbesFolles;


public class Carte {
    protected String nomDeLexploit;
    protected int[] prix;
    protected String[] Ressource;
    protected int pointDeGloire;
    protected int idCarte;
    protected boolean activerOuPas;


    public Carte(int idCarte,String nomDeLexploit,int[] prix, String[] Ressource, int pointDeGloire,boolean activerOuPas){
        this.nomDeLexploit=nomDeLexploit;
        this.prix = prix;
        this.Ressource = Ressource;
        this.pointDeGloire=pointDeGloire;
        this.idCarte=idCarte;
        this.activerOuPas=false;
    }
    public Carte(int idCarte,int[] prix, String[] Ressource, int pointDeGloire,boolean activerOuPas){
        this.idCarte=idCarte;
        this.prix = prix;
        this.Ressource = Ressource;
        this.pointDeGloire=pointDeGloire;
        this.activerOuPas=false;

    }

//    public abstract void activerEffetCarte(Joueur joueur);



    public void afficherCarte(){
        System.out.println(this.nomDeLexploit);
    }

    public int getIdCarte() {
        return idCarte;
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

    public void setIdCarte(int idCarte) {
        this.idCarte = idCarte;
    }

    public void setNomDeLexploit(String nomDeLexploit) {
        this.nomDeLexploit = nomDeLexploit;
    }

    public void setPointDeGloire(int pointDeGloire) {
        this.pointDeGloire = pointDeGloire;
    }

    public void setPrix(int[] prix) {
        this.prix = prix;
    }

    public void setRessource(String[] ressource) {
        Ressource = ressource;
    }


    public void activerCarte(){
        this.activerOuPas=true;
    }

    public boolean isActiverOuPas() {
        return activerOuPas;
    }




}






