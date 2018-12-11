package main.java.projet_dice_forge.Partie_Bassin;

import main.java.projet_dice_forge.Plateau_Joueur.Face;
import main.java.projet_dice_forge.Ressource.*;

import java.util.ArrayList;
import java.util.List;
/**
 * Cette classe représente le temple avec les différents bassin à l'intérieur.
 */
public class Temple {
    //Ce sont les différents bassins présents dans le temple.

    private final List<Bassin> bassins;

    /**
     * Création du temple avec les différents bassins.
     */
    public Temple() {
        bassins = new ArrayList<>();
        bassins.add(Bassin2Or());
        bassins.add(Bassin3Or());
        bassins.add(Bassin4Or());
        bassins.add(Bassin5Or());
        bassins.add(Bassin6Or());
        bassins.add(Bassin8Or());
        bassins.add(Bassin12Or());
    }

    /**
     * Permet d'initialiser le bassin qui coûte 2 Or.
     */
    private Bassin Bassin2Or() {
        Bassin bassin2Or = new Bassin(2);
        Or or = new Or(3);
        Face face = new Face();
        face.AjouterRessource(or);
        FragementLunaire fragementLunaire = new FragementLunaire(1);
        Face face1 = new Face();
        face1.AjouterRessource(fragementLunaire);
        bassin2Or.AjouterFaceBassin(face, 4);
        bassin2Or.AjouterFaceBassin(face1, 4);
        return bassin2Or;
    }

    /**
     * Permet d'initialiser le bassin qui coûte 3 Or.
     */
    private Bassin Bassin3Or() {
        Bassin bassin3Or = new Bassin(3);
        Or or = new Or(4);
        Face face = new Face();
        face.AjouterRessource(or);
        FragementSolaire fragementSolaire = new FragementSolaire(1);
        Face face1 = new Face();
        face1.AjouterRessource(fragementSolaire);
        bassin3Or.AjouterFaceBassin(face1, 4);
        bassin3Or.AjouterFaceBassin(face, 4);
        return bassin3Or;
    }

    /**
     * Permet d'initialiser le bassin qui coûte 4 Or.
     */
    private Bassin Bassin4Or() {
        Bassin bassin4Or = new Bassin(4);
        Or or = new Or(6);
        Face face = new Face();
        face.AjouterRessource(or);
        Or or1 = new Or(2);
        FragementLunaire fragementLunaire = new FragementLunaire(1);
        Face face1 = new Face();
        face1.AjouterRessource(or1);face1.AjouterRessource(fragementLunaire);
        Gloire gloire = new Gloire(1);
        FragementSolaire fragementSolaire = new FragementSolaire(1);
        Face face2 = new Face();
        face2.AjouterRessource(gloire);face2.AjouterRessource(fragementSolaire);
        bassin4Or.AjouterFaceBassin(face, 1);
        bassin4Or.AjouterFaceBassin(face1, 1);
        bassin4Or.AjouterFaceBassin(face2, 1);
        return bassin4Or;
    }

    /**
     * Permet d'initialiser le bassin qui coûte 5 Or.
     */
    private Bassin Bassin5Or() {
        Bassin bassin5Or = new Bassin(5);
        Face face = new Face();
        Or or = new Or(3);
        face.AjouterRessource(or);
        bassin5Or.AjouterFaceBassin(face, 4);
        return bassin5Or;
    }

    /**
     * Permet d'initialiser le bassin qui coûte 6 Or.
     */
    private Bassin Bassin6Or() {
        Bassin bassin6Or = new Bassin(6);
        FragementLunaire fragementLunaire = new FragementLunaire(1);
        Face face = new Face();
        face.AjouterRessource(fragementLunaire);
        bassin6Or.AjouterFaceBassin(face, 4);
        return bassin6Or;
    }

    /**
     * Permet d'initialiser le bassin qui coûte 8 Or.
     */
    private Bassin Bassin8Or() {
        Bassin bassin8Or = new Bassin(8);
        Gloire gloire = new Gloire(3);
        Face face = new Face();
        face.AjouterRessource(gloire);
        FragementSolaire fragementSolaire = new FragementSolaire(2);
        Face face1 = new Face();
        face1.AjouterRessource(fragementSolaire);
        bassin8Or.AjouterFaceBassin(face, 4);
        bassin8Or.AjouterFaceBassin(face1, 4);
        return bassin8Or;
    }

    /**
     * Permet d'initialiser le bassin qui coûte 12 Or.
     */
    private Bassin Bassin12Or() {
        Bassin bassin12Or = new Bassin(12);
        Gloire gloire = new Gloire(4);
        Face face = new Face();
        face.AjouterRessource(gloire);

        Or or = new Or(1);
        FragementSolaire fragementSolaire = new FragementSolaire(1);
        Gloire gloire1 = new Gloire(1);
        FragementLunaire fragementLunaire = new FragementLunaire(1);
        Face face1 = new Face();
        face1.AjouterRessource(or);face1.AjouterRessource(fragementSolaire);face1.AjouterRessource(fragementLunaire);face1.AjouterRessource(gloire1);

        Gloire gloire2 = new Gloire(2);
        FragementLunaire fragementLunaire1 = new FragementLunaire(3);
        Face face2 = new Face();
        face2.AjouterRessource(gloire2);face2.AjouterRessource(fragementLunaire1);

        bassin12Or.AjouterFaceBassin(face, 1);
        bassin12Or.AjouterFaceBassin(face1, 1);
        bassin12Or.AjouterFaceBassin(face2, 1);
        return bassin12Or;
    }

    public Bassin getBassin(int coutBassin) {
        for(Bassin b : bassins) {
            if(b.getCout() == coutBassin)
            {
                return b;
            }
        }
        return null;
    }

    public ArrayList<Face> getFaceFromBassin(int coutBassin) {
        return getBassin(coutBassin).getListFace();
    }

    public void deleteFace(Face face) {
        int size = bassins.size();
        for(int i = 0; i<size; i++) {
            Bassin bas = bassins.get(i);
            if(bas.faceIsIn(face))
            {
                bas.EnleverFaceBassin(face);
            }
        }
    }
    public List<Bassin> getBassins(){
        return this.bassins;
    }

    /**
     * Return the list of bassin you can use according to the gold you pass on parameter
     */
    public ArrayList<Bassin> getBassinYouNeed(int or){
        ArrayList<Bassin> listOfBassin = new ArrayList();
        int gold = or - 2;
        for(int i = 0; i<7; i++){
            if(gold >= 0){
                listOfBassin.add(bassins.get(i));
            }
            else
            {
                break;
            }
            if(i>=4){
                if(i>=5){
                    gold -= 4;
                } else {
                    gold -= 2;
                }
            }
            else {
                gold--;
            }

        }
        return listOfBassin;
    }

}