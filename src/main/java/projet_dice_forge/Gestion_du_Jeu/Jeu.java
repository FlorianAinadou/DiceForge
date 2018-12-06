package main.java.projet_dice_forge.Gestion_du_Jeu;


import main.java.projet_dice_forge.Bot.Bot;
import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.Partie_Bassin.Temple;
import main.java.projet_dice_forge.Partie_Iles.PlateauDesIles;

import java.util.ArrayList;
import java.util.List;

public class Jeu {
    private final Bot[] bot;
    private Temple temple;
    private PlateauDesIles plateauDesIles;
    private int nbrManche = 9;
    private int nbrJoueur=2;

    public Jeu(int nbrJoueur, Bot[] b) {
        this.nbrJoueur = nbrJoueur;
        bot = new Bot[nbrJoueur];
        for(int i = 0; i<nbrJoueur; i++)
        {
            bot[i] = b[i];
        }
        setAdversaires();
    }

    /**
     * Réinitialise les différent Plateau et ressources
     */

    private void initJeu()
    {
        temple = new Temple();
        plateauDesIles = new PlateauDesIles(this.nbrJoueur);
        for(int i = 0; i<nbrJoueur; i++)
        {
            bot[i].reset();
        }
    }

    /**
     *
     * @param affichage Affiche ou non les details des tours de chague joueur
     */
    public void lancerUnePartie(boolean affichage)
    {
        initJeu();
        for(int i = 0; i<nbrManche; i++) {
            for(int j = 0; j < nbrJoueur; j++) {
                bot[j].jouer(temple, plateauDesIles);
                System.out.println(bot[j].getDetailTour());
                if(affichage) {
                    System.out.println(bot[j].getDetailTour());
                }
            }
        }
        if(affichage) {
            afficherGagnant();
        }
    }

    /**
     * Récupère le(s) gagnant via @quiQuiCestLesGagnant et l(es) affiche(s) sur la sortie standard
     */
    public void afficherGagnant() {
        ArrayList<Integer> gagnant = quiQuiCestLesGagnant();
        if(gagnant.size()<2) {
            System.out.println("Le gagnant est : ");
        }
        else {
            System.out.println("Egalité des joueur : ");
        }
        gagnant.forEach(t -> System.out.println(bot[t].getIdJoueur() + " "));
        System.out.println("avec " + bot[gagnant.get(0)].getPtGloire());
    }

    /**
     * @return Renvoie la liste des index (dans le tableau bot) des gagnants
     */
    private ArrayList<Integer> quiQuiCestLesGagnant() {
        int a = -1;
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0; i<nbrJoueur; i++){
            if(a == bot[i].getPtGloire()) {
                res.add(i);
            }
            if(bot[i].getPtGloire()>a) {
                res.clear();
                res.add(i);
                a = bot[i].getPtGloire();
            }
        }
        return res;
    }

    public void lancerNPartie(int nbrPartie) {
        int[] gagnant = new int[nbrJoueur];
        ArrayList<Integer> win;
        boolean affichage = nbrPartie > 1 ? false : true;
        for(int i = 0; i<nbrPartie; i++ )
        {
            lancerUnePartie(affichage);
            win = quiQuiCestLesGagnant();
            for(Integer gagn : win){
                gagnant[bot[gagn].getIdJoueur()]++;
            }
            initJeu();
        }
        for(int j = 0; j<nbrJoueur; j++) {
            System.out.println("Le joueur " + (bot[j].getIdJoueur()+1) + " a gagné " + gagnant[bot[j].getIdJoueur()]);
        }
    }

    ////////////////////////////////////////Méthodes qui permet d'activer les effets sur les autres joueurs////////////////////////////////////////////////////////////////////


    public Bot[] getBot() {
        return bot;
    }

    public int getNbrJoueur() {
        return nbrJoueur;
    }

    private void setAdversaires(){
        for(Bot bot1 : bot ){
            ArrayList<Joueur> list = new ArrayList<>();
            for( Bot bot2 : bot){
                if(bot1.getIdJoueur() != bot2.getIdJoueur()){
                    list.add(bot2);
                }
            }
            bot1.setAdversaires(list);
        }

    }

    public PlateauDesIles getPlateauDesIles() {
        return plateauDesIles;
    }
}