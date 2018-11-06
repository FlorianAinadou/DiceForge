package main.java.projet_dice_forge;

/**
 * Cette classe représente une face d'un dé
 */
public class Face {
    private int nb;
    private String typeDeRessource;


    public Face(int nb){
        this.nb=nb;
        this.typeDeRessource="";
    }
    /**
     * Ce constructeur cré une face caractérisée par:
     * @param nb
     * @param typeDeRessource
     */

    public Face(int nb , String typeDeRessource){
        this.nb=nb;
        this.typeDeRessource=typeDeRessource;
    }

    /**
     * @return le nombre de ressource gagné
     */
    public int getNb() {
        return nb;
    }

    /**
     * Cette methode vérifie si le type de ressource de cette face est la gloire
     * @return boolean
     */

    boolean isFaceContainsGloire(){
        boolean testeur=false;
        if(this.getTypeDeRessource().equals("gloire")){
            testeur=true;
        }
        return testeur;
    }

    /**
     * Cette methode vérifie si le type de ressource de cette face est l'or
     * @return boolean
     */

    boolean isFaceContainsOr(){
        boolean testeur=false;
        if(this.getTypeDeRessource().equals("or")){
            testeur=true;
        }
        return testeur;
    }

    /**
     *
     * @return le type de ressource gagné
     */
    public String getTypeDeRessource() {
        return typeDeRessource;
    }





}


