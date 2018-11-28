package main.java.projet_dice_forge.Plateau_Joueur;

/**
 * Cette classe représente une face d'un dé
 */

public class Face {
    private int[] nb;
    private String[] typeDeRessource;
    private int positionOr=-1;
    private int positionGloire=-1;
    private int positionLune=-1;
    private int positionSoleil=-1;


    /**
     * Ce constructeur cré une face caractérisée par:
     * @param nb
     * @param typeDeRessource
     */

    public Face(int[] nb , String[] typeDeRessource){
        this.nb=nb;
        this.typeDeRessource = typeDeRessource;
    }


    /**
     * @return le nombre de ressource gagné
     */
    public int[] getNb() {
        return this.nb;
    }

    /**
     * Cette methode vérifie si le type de ressource de cette face est la gloire
     * @return boolean
     */
    public String[] getTypeDeRessource() {
        return this.typeDeRessource;
    }
    public int getPostionOr() {
        return this.positionOr;
    }
    public int getPositionGloire() {
        return this.positionGloire;
    }
    public int getPositionLune() {
        return this.positionLune;
    }
    public int getPositionSoleil() {
        return this.positionSoleil;
    }

    public void AnalyseFace() {
        for (int i = 0; i < nb.length; i++) {
            if (this.getTypeDeRessource()[i].equals("gloire")) {
                this.positionGloire = i;
            }
            if (this.getTypeDeRessource()[i].equals("or")) {
                this.positionOr = i;
            }
            if (this.getTypeDeRessource()[i].equals("fragementLunaire")) {
                this.positionLune = i;
            }
            if (this.getTypeDeRessource()[i].equals("fragementSolaire")) {
                this.positionSoleil = i;
            }
        }
    }

  /*  public boolean isFaceContainsGloire(){
        boolean testeur=false;
            if(this.getTypeDeRessource().equals("gloire")) {
                testeur=true;
        }
        return testeur;
    }
    */

    /**
     * Cette methode vérifie si le type de ressource de cette face est l'or
     * @return boolean
     */

   /* public boolean isFaceContainsOr(){
        boolean testeur=false;
        if(this.getTypeDeRessource().equals("or")){
            testeur=true;
        }
        return testeur;
    }
*/
    /**
     *
     * @return le type de ressource gagné
     */


    @Override
    public boolean equals(Object other)
    {
        if(other instanceof Face && other != null) {
            Face face = (Face) other;
            return (this.getNb() == face.getNb() && this.typeDeRessource.equals(face.getTypeDeRessource()));
        } else
        {
            return false;
        }

    }
    public String AfficherFace(){
        String string="";
        for(int i=0;i<this.nb.length;i++){
            string=string+nb[i] + " " +typeDeRessource[i] + " ";
        }
        return string;
    }

    public int getValeurFace(){
       int valeurFace=0;
       int nbRessources = this.getNb().length;
       int[] ressourses= this.getNb();
            for(int j=0; j<nbRessources;j++){
                valeurFace+=ressourses[j];
            }
    return valeurFace;
    }



}


