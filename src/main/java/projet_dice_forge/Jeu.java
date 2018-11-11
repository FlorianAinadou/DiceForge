package main.java.projet_dice_forge;


import java.util.ArrayList;

public class Jeu {
    private final Bot[] bot;
    private Temple temple;
    private PlateauDesIles plateauDesIles;
    private int nbrManche = 9;
    private int nbrJoueur = 2;

    Jeu(int nbrJoueur, Bot[] b) {
        this.nbrJoueur = nbrJoueur;
        bot = new Bot[nbrManche];
        for(int i = 0; i<nbrJoueur; i++)
        {
            bot[i] = b[i];
        }
    }

    /**
     * Réinitialise les différent Plateau et ressources
     */

    private void initJeu()
    {
        temple = new Temple();
        plateauDesIles = new PlateauDesIles();
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
                if(affichage) {
                    System.out.println(bot[j].getDetailTour());
                }
            }
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
}
