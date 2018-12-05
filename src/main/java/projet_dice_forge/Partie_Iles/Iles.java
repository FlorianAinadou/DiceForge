package main.java.projet_dice_forge.Partie_Iles;

import main.java.projet_dice_forge.Partie_Iles.Carte;

import java.util.ArrayList;


public class Iles {
    private boolean portail;
    private int nbExploit;
    private int idIles;
    private boolean occupé =false;
    private ArrayList<Carte> ListeExploit;


    public Iles(){
        ListeExploit =new ArrayList<>();


    }

    public Iles(int idIles,boolean portail,int nbExploit){
        this.portail=portail;
        this.nbExploit=nbExploit;
        this.idIles=idIles;
        ListeExploit =new ArrayList<>();

    }

    public void joueurEstSurIle(){
        this.portail=occupé;
    }



    public void enleverCarte(Carte carte){
        for(int i=0; i<ListeExploit.size(); i++){
            if(carte.equals(ListeExploit.get(i))){
                ListeExploit.remove(i);
                break;
            }
        }
    }
    public void printLsite(){
        for(int i=0; i<ListeExploit.size(); i++){
            ListeExploit.get(i).afficherCarte();
        }
    }
    public void ajouterCarte(Carte carte) {
            this.ListeExploit.add(carte);
    }

    /**
    Permet de prendre une carte dans le lot de cartes disponibles
     */
    public Carte getCarte(int id){
        return this.ListeExploit.get(id);
    }

    /*public void ajouterCarte(Carte carte,int quantité){
        for(int i =0; i<quantité; i++){
            this.ListeExploit.add(carte);
        }
    }*/

    public ArrayList<Carte> getListCartes() {
        return ListeExploit;
    }



}
