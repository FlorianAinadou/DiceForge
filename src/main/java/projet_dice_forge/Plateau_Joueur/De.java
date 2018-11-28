package main.java.projet_dice_forge.Plateau_Joueur;

import java.util.ArrayList;
import java.util.Random;


/**
* Cette classe représente les dés dans Dice Forge
 */
public class De {
    //C'est un tableau d'objet de type Face qui regroupe les faces du dé.
    private Face[] de;
    // C'est un int qui définit le nombre de face d'un dé
    private final int nbFace = 6;

    /**
     * Crée un dé des dés de base du jeu en fonction du dé voulu
     * L'un continent 5 faces à 1 or et 1 face à 1 Solaire,
     * l'autre contient 4 faces à 1 or, 1 face à 2 gloire, 1 face à 1 Lunaire
     */

    public De(String string){
        int i=0;
        this.de = new Face[nbFace];
        if(string=="claire"){
            for(  ; i<5 ;i++) {
                this.de[i] = new Face(new int[]{1}, new String[]{"or"});
            }
            this.de[5] = new Face(new int[]{1}, new String[]{"fragementSolaire"});
        }
        if (string=="sombre"){
            for(  ; i<4 ;i++){
                this.de[i]= new Face(new int[]{1}, new String[]{"or"});
            }
            this.de[4]= new Face(new int[]{1}, new String[]{"fragementLunaire"});
            this.de[5]= new Face(new int[]{2}, new String[]{"gloire"});
        }
    }

    /**
     * Cette méthode nous permet d'ajouter une face dans n'importe qu'elle face du dé
     * @param f --> face à ajouter
     * @param indice --> quelle face du dé
     */
    public void ajouterUneFace(Face f, int indice){
        if (indice < 6){
            this.de[indice]= f;
        }
    }

    public void ajouterToutLesFace(ArrayList list){
    }

    public Face getface(int i){
        return de[i];
    }

    /**
     * Cette méthode simule un lancement de dé
     * @return cette méthode retourne la face du dé qui a était lancé.
     */
    public Face lancerLeDe(){
        Random r = new Random();
        int valeur = r.nextInt(6);
        return this.de[valeur];
    }
    /**
     * Cette méthode affiche les faces d'un dé
     */
    public void afficherDe(){
        for(int i=0 ; i<6;i++){
            System.out.println("Val : " + de[i].getNb()+ " type :" + de[i].getTypeDeRessource() );
        }
        System.out.println("\n");
    }

    //public Face getFaceAchanger(De de){ }



}
