package main.java.projet_dice_forge.Plateau_Joueur;

import main.java.projet_dice_forge.Ressource.Gloire;
import main.java.projet_dice_forge.Ressource.Ressource;

import java.util.ArrayList;
import java.util.List;

/**
 * Cette classe représente une face d'un dé
 */

public class Face {
    private ArrayList<Ressource> ListeResource;

    /**
     * Ce constructeur cré une face caractérisée par:
     *
     * @param liste
     */

    public Face() {
        this.ListeResource = new ArrayList<>();
    }


    /**
     * @return le nombre de ressource gagné
     */
    public ArrayList<Ressource> getRessource() {
        return ListeResource;
    }

    public void AjouterRessource(Ressource r){
        this.ListeResource.add(r);
    }

    public String AfficherFace(){
        String string="";
        for (Ressource ressource:ListeResource) {
            string= string+ ressource.getRessources() + " " +ressource.getTypeRessource() + " ";
        }
        return string;
    }

    /**
     * Cette methode vérifie si le type de ressource de cette face est la gloire
     * @return boolean
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
}
/*
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

    public int getValeurFace(){
       int valeurFace=0;
       int nbRessources = this.getNb().length;
       int[] ressourses= this.getNb();
            for(int j=0; j<nbRessources;j++){
                valeurFace+=ressourses[j];
            }
    return valeurFace;
    }

*/


}


