package main.java.projet_dice_forge;

/**
 * Cette classe représente le temple avec les différents bassin à l'intérieur.
 */
public class Temple {
    //Ce sont les différents bassins présents dans le temple.
    private Bassin Bassin2Or; Bassin Bassin3Or; Bassin Bassin4Or; Bassin Bassin5Or; Bassin Bassin6Or;Bassin Bassin8Or;Bassin Bassin12Or;

    /**
     * Création du temple avec les différents bassins.
     */
    public Temple(){
       Bassin2Or(); Bassin3Or(); Bassin4Or(); Bassin5Or(); Bassin6Or(); Bassin8Or(); Bassin12Or();
       Bassin2Or.AfficherBassin();
       Face face = new Face(3, "Or");
       Bassin2Or.EnleverFaceBassin(face);
       Bassin2Or.AfficherBassin();
    }

    /**
     * Permet d'initialiser le bassin qui coûte 2 Or.
     */
    public void Bassin2Or(){
        Bassin bassin2Or = new Bassin(2);
        Face face = new Face(3,"Or");
        bassin2Or.AjouterFaceBassin(face, 4);
        this.Bassin2Or = bassin2Or;
    }

    /**
     * Permet d'initialiser le bassin qui coûte 3 Or.
     */
    public void Bassin3Or(){
        Bassin bassin3Or = new Bassin(3);
        Face face = new Face(4,"Or");
        bassin3Or.AjouterFaceBassin(face, 4);
        this.Bassin3Or = bassin3Or;
    }

    /**
     * Permet d'initialiser le bassin qui coûte 4 Or.
     */
    public void Bassin4Or(){
        Bassin bassin4Or = new Bassin(4);
        Face face = new Face(6,"Or");
        bassin4Or.AjouterFaceBassin(face, 1);
        this.Bassin4Or = bassin4Or;
    }

    /**
     * Permet d'initialiser le bassin qui coûte 5 Or.
     */
    public void Bassin5Or(){
        Bassin bassin5Or = new Bassin(5);
        //Face face = new Face(3,"Or");
        //bassinOr.AjouterFaceBassin(face, 4);
        this.Bassin5Or = bassin5Or;
    }

    /**
     * Permet d'initialiser le bassin qui coûte 6 Or.
     */
    public void Bassin6Or(){
        Bassin bassin6Or = new Bassin(6);
        //Face face = new Face(3,"Or");
        //bassin6Or.AjouterFaceBassin(face, 4);
        this.Bassin6Or = bassin6Or;
    }

    /**
     * Permet d'initialiser le bassin qui coûte 8 Or.
     */
    public void Bassin8Or(){
        Bassin bassin8Or = new Bassin(8);
        Face face = new Face(3,"gloire");
        bassin8Or.AjouterFaceBassin(face, 4);
        this.Bassin8Or = bassin8Or;
    }

    /**
     * Permet d'initialiser le bassin qui coûte 12 Or.
     */
    public void Bassin12Or(){
        Bassin bassin12Or = new Bassin(12);
        Face face = new Face(4,"gloire");
        bassin12Or.AjouterFaceBassin(face, 1);
        this.Bassin12Or = bassin12Or;
    }

}

