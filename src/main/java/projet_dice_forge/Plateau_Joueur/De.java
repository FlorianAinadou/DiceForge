package main.java.projet_dice_forge.Plateau_Joueur;

import main.java.projet_dice_forge.Ressource.*;

import java.util.ArrayList;
import java.util.Arrays;
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
        Or or = new Or(1);
        Gloire gloire =  new Gloire(2);
        FragementLunaire fragementLunaire = new FragementLunaire(1);
        FragementSolaire fragementSolaire = new FragementSolaire(1);
        if(string=="claire"){
            for(  ; i<5 ;i++) {
                this.de[i] = new Face();
                this.de[i].AjouterRessource(or);
            }
            this.de[5] = new Face();
            this.de[5].AjouterRessource(fragementSolaire);
        }
        if (string=="sombre"){
            for(  ; i<4 ;i++){
                this.de[i]= new Face();
                this.de[i].AjouterRessource(or);
            }
            this.de[4]= new Face();
            this.de[4].AjouterRessource(gloire);
            this.de[5]= new Face();
            this.de[5].AjouterRessource(fragementLunaire);
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
        }
        System.out.println("\n");
    }

    public Face[] toutesLesFaces(){
        return this.de;
    }

    /**
     * Détermine la valeur du dé en fonction du nombre de ressources qu'elle apporte
     * @return
     */
    public int getValeurDe(){

        ArrayList<Face> listeDeFaces = new ArrayList<Face>(Arrays.asList(this.toutesLesFaces()));

        return listeDeFaces.stream()
                .map(face -> face.getValeurFace())
                .reduce(0, (total, count)-> total+count);
    }



}
