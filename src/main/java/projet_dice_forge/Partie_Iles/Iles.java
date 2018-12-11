package main.java.projet_dice_forge.Partie_Iles;

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
    /**
     * Permet de définir si le portail est occupé ou non
     */

    public void joueurEstSurIle(){
        this.portail=occupé;
    }

    /**
     * Permet d'enlever une carte dans l'île
     */

    public void enleverCarte(Carte carte){
        for(int i=0; i<ListeExploit.size(); i++){
            if(carte.equals(ListeExploit.get(i))){
                ListeExploit.remove(i);
                break;
            }
        }
    }

    /**
     * Permet d'ajouter des cartes à une île
     */

    public void ajouterCarte(Carte carte) {
            this.ListeExploit.add(carte);
    }

    /**
    Permet de prendre une carte dans le lot de cartes disponibles
     */
    public Carte getCarte(int id){

        for(Carte carte: this.getListCartes())
        {
            if(carte.getIdCarte()==id) return carte;
        }

        return null;
    }


    public ArrayList<Carte> getListCartes() {
        return ListeExploit;
    }



}
