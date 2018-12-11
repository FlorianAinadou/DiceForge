package main.java.projet_dice_forge.Partie_Bassin;

import main.java.projet_dice_forge.Plateau_Joueur.Face;
import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.Plateau_Joueur.PlateauDuJoueur;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Cette classe représente un bassin contenant des listes de faces.
 */

public class Bassin {
    //C'est la liste des face présentent dans le bassin.
    private ArrayList<Face> ListFace;
    //C'est le cout qu'il faut payer pour acheter une face dans le bassin.
    private int coutBassin;

    /**
     * Création d'un nouveau bassin avec son coût.
     * @param coutBassin
     */

    public Bassin(int coutBassin) {
        ListFace = new ArrayList<>();
        setCout(coutBassin);
    }
    public Bassin(int cout, List<Face> Face){
        ListFace = new ArrayList<>();
        Face.forEach(p -> ListFace.add(p));
        setCout(cout);

    }
    /**
     *Renvoi le coût du bassin.
     */
    public int getCout() {
        return coutBassin;
    }

    /**
     * Affecte le cout du bassin.
     * @param coutBassin
     */
    public void setCout(int coutBassin) {
        this.coutBassin = coutBassin;
    }

    /**
     * Permet d'ajouter une face au bassin.
     * @param Face
     * @param quantitéFace
     */
    public void AjouterFaceBassin(Face Face, int quantitéFace) {
        for (int i = 0; i < quantitéFace; i++) {
            ListFace.add(i, Face);
        }
    }

    /**
     * Permet d'enlever une face du bassin.
     * @param faceJoueur
     */

    public void EnleverFaceBassin(Face faceJoueur) {
        for (int i = 0; i < this.ListFace.size(); i++) {
            Face face = this.ListFace.get(i);
            if (face.equals(faceJoueur)) {
                this.ListFace.remove(i);
                break;
            }
        }
    }
    /**
     * Permet d'acheter une face dans le bassin
     * @param face face sélectionnée
     * @param joueur joeur qui achète
     */

    public void AcheterFace(Face face, Joueur joueur){
        this.EnleverFaceBassin(face);
        PlateauDuJoueur plateau =joueur.getPlateauDuJoueur();
        plateau.setOr(plateau.getOr() - this.getCout());
    }

    /**
     *
     */

    public Face FaceAleaBassin(){
        int nbFaceBassin = this.ListFace.size();

        Random r = new Random();
        int indice = r.nextInt(nbFaceBassin);
        Face face = this.ListFace.get(indice);
        //Face face = new Face(4,"or");
        EnleverFaceBassin(face);
        return face;
    }

    /**
     * @return La taille du bassin
     */

    public int TailleBassin(){
       return this.ListFace.size();
    }

    public ArrayList<Face> getListFace(){
        return this.ListFace;
    }

    public ArrayList<Face> getFace() {
        ArrayList<Face> res = new ArrayList<>();
        for(Face face : this.ListFace) {
            res.add(face);
        }
        return res;
    }

    /**
     * Permet de vérifier si une face est présente dans un bassin
     */

    public boolean faceIsIn(Face face) {
        for(Face fac : this.ListFace) {
            if(face.equals(fac)) return true;
        }
        return false;
    }
}






