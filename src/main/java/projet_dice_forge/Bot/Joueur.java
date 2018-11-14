package main.java.projet_dice_forge.Bot;

import main.java.projet_dice_forge.Partie_Bassin.Bassin;
import main.java.projet_dice_forge.Partie_Bassin.Temple;
import main.java.projet_dice_forge.Partie_Iles.Carte;
import main.java.projet_dice_forge.Plateau_Joueur.De;
import main.java.projet_dice_forge.Plateau_Joueur.Face;
import main.java.projet_dice_forge.Plateau_Joueur.PlateauDuJoueur;

import java.util.List;

import java.util.ArrayList;

public class Joueur {
    protected int id = -1;
    protected De DeClaire;
    protected De DeSombre;
    protected PlateauDuJoueur Plateau;
    protected ArrayList<Carte> ListeCarte;

    public Joueur(int Idjoueur){
        this.id=Idjoueur;
        this.DeClaire=new De();
        this.DeSombre=new De();
        this.Plateau=new PlateauDuJoueur(Idjoueur);
        this.ListeCarte=new ArrayList<>();
    }

    public Joueur(int Idjoueur, De de1, De de2, PlateauDuJoueur Plateau){
        this.id=Idjoueur;
        this.DeClaire=de1;
        this.DeSombre=de2;
        this.Plateau=Plateau;
        this.ListeCarte=new ArrayList<>();
    }

    /**
     * Retourne les dés du joueur concerné
     *
     */
    public De getDe(int idDe){
        if(idDe == 1){
            return DeClaire;
        }
        else{
            return DeSombre;
        }
    }
    public  PlateauDuJoueur getPlateauDuJoueur(){
        return Plateau;
    }

    public int getPtGloire() {
        return Plateau.getPointsDeGloire();
    }

    public void reset() {
        resetPlateauDuJoueur();
        resetDe();
    }

    private void resetPlateauDuJoueur() {
        this.Plateau = new PlateauDuJoueur(this.id);
    }

    /**
     * Cette classe reinitialise les dés. On l'utilise quand on veut relancer une partie
     */
    private void resetDe() {
        this.DeClaire = new De();
        this.DeSombre = new De();
    }

    /**
     * On lance les dés et on attribue au joueur en fonction du résultat du lancé des ressources
     */
    public void lanceDe() {
        Face sombre, claire;
        claire = this.DeClaire.lancerLeDe();
        sombre = this.DeSombre.lancerLeDe();
        sombre.AnalyseFace();
        claire.AnalyseFace();
        if(claire.getPositionGloire()!=-1){
            this.Plateau.ajouterPointDeGloire(claire.getNb()[claire.getPositionGloire()]);
        }
        if(claire.getPostionOr()!=-1) {
            this.Plateau.ajouterOr(claire.getNb()[claire.getPostionOr()]);
        }
        if(sombre.getPositionGloire()!=-1) {
            this.Plateau.ajouterPointDeGloire(sombre.getNb()[sombre.getPositionGloire()]);
        }
        if(sombre.getPostionOr()!=-1) {
            this.Plateau.ajouterPointDeGloire(sombre.getNb()[sombre.getPostionOr()]);
        }

        System.out.print("Dé 1: " + claire.AfficherFace() );
        System.out.print("Dé 2: " + sombre.AfficherFace() );


    }

    public void acheterFace(Temple temp, Face acheter, Face echange, int idDe) {
        int size = temp.getBassins().size();
        for (int i = 0; i < size; i++) {
            Bassin bas = temp.getBassins().get(i);
            if (bas.faceIsIn(acheter)) {
                this.Plateau.enleverOr(temp.getBassins().get(i).getCout());
            }
        }
        echangerFace(acheter, echange, idDe);
        temp.deleteFace(echange);
    }

    /**
     * On remplace une face du dé d'un joueur donné
     * @param nouvelle représente la nouvelle face à insérer
     * @param ancienne représente la face à remplacer
     * @param idDe renseigne le dé dont on veut modifier l'une des faces
     */
    private void echangerFace(Face nouvelle,Face ancienne,int idDe) {
        int i = 0;
        if(idDe == 1) {
            while(!this.DeClaire.getface(i).equals(ancienne)) {
                i++;
            }
            DeClaire.ajouterUneFace(nouvelle,i);
        }
        else if(idDe == 2) {
            while(!this.DeSombre.getface(i).equals(ancienne)) {
                i++;
            }
            DeSombre.ajouterUneFace(nouvelle,i);
        }
    }

    
    public int getIdJoueur(){
        return id;
    }

    public void acheterCarte(Carte carte){
        ListeCarte.add(carte);
    }
}
