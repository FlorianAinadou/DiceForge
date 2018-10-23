package projet_dice_forge;

import java.util.ArrayList;
import java.util.Random;


/**
* Cette classe représente les dés dans Dice Forge
 */
public class De {
    //C'est un tableau d'objet de type Face qui regroupe les faces du dé.
    private Face[] de;
    // C'est un int qui définit le nombre de face d'un dé
    private int nbFace = 6;

    /**
     * Crée un dé qui regroupe des faces et initialise les faces du dé par défault (nb à 0 et typeDeRessource à gloire)
     * @param aucun
     */

    public De(){
        this.de = new Face[nbFace];
        for(int i =0;i<6;i++){
            this.de[i]= new Face(i,"gloire");
        }
    }

    /**
     * Cette méthode nous permet d'ajouter une face dans n'importe qu'elle face du dé
     * @param f --> face à ajouter
     * @param indice --> quelle face du dé
     */
    public void ajouterUneFace(Face f, int indice){
        this.de[indice]= f;

    }

    public void ajouterToutLesFace(ArrayList list){

    }

    /**
     * Cette méthode simule un lancement de dé
     * @return cette méthode retourne la face du dé qui a était lancé.
     */
    public Face lancerLeDe(){
        Random r = new Random();
        int valeur = r.nextInt(5);
        return this.de[valeur];
    }

    /**
     * Cette méthode affiche les faces d'un dé
     */
    public void afficherDe(){
        for(int i=0 ; i<6;i++){
            System.out.println("Val : " + de[i].getNb()+ " type :" + de[i].getTypeDeRessource() );
        }
    }



}
