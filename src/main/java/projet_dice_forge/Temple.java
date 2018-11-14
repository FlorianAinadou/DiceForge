package main.java.projet_dice_forge;

import java.util.ArrayList;
import java.util.Iterator;
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
        Face face = new Face(3, "Or");
        bassin2Or.AjouterFaceBassin(face, 4);
        return bassin2Or;
    }

    /**
     * Permet d'initialiser le bassin qui coûte 3 Or.
     */
    private Bassin Bassin3Or() {
        Bassin bassin3Or = new Bassin(3);
        Face face = new Face(4, "Or");
        bassin3Or.AjouterFaceBassin(face, 4);
        return bassin3Or;
    }

    /**
     * Permet d'initialiser le bassin qui coûte 4 Or.
     */
    private Bassin Bassin4Or() {
        Bassin bassin4Or = new Bassin(4);
        Face face = new Face(6, "Or");
        bassin4Or.AjouterFaceBassin(face, 1);
        return bassin4Or;
    }

    /**
     * Permet d'initialiser le bassin qui coûte 5 Or.
     */
    private Bassin Bassin5Or() {
        Bassin bassin5Or = new Bassin(5);
        Face face = new Face(3,"Or");
        bassin5Or.AjouterFaceBassin(face, 4);
        return bassin5Or;
    }

    /**
     * Permet d'initialiser le bassin qui coûte 6 Or.
     */
    private Bassin Bassin6Or() {
        Bassin bassin6Or = new Bassin(6);
        Face face = new Face(3,"Or");
        bassin6Or.AjouterFaceBassin(face, 4);
        return bassin6Or;
    }

    /**
     * Permet d'initialiser le bassin qui coûte 8 Or.
     */
    private Bassin Bassin8Or() {
        Bassin bassin8Or = new Bassin(8);
        Face face = new Face(3, "gloire");
        bassin8Or.AjouterFaceBassin(face, 4);
        return bassin8Or;
    }

    /**
     * Permet d'initialiser le bassin qui coûte 12 Or.
     */
    private Bassin Bassin12Or() {
        Bassin bassin12Or = new Bassin(12);
        Face face = new Face(4, "gloire");
        bassin12Or.AjouterFaceBassin(face, 1);
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

}