package si3.projet2;

/**
 * Cette classe représente une face d'un dé
 */
public class Face {
    private int nb;
    private String typeDeRessource;

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
     * @return le nombre de ressource gagner
     */
    public int getNb() {
        return nb;
    }

    /**
     *
     * @return le type de ressource gagner
     */
    public String getTypeDeRessource() {
        return typeDeRessource;
    }





}


