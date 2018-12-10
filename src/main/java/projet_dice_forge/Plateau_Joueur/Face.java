package main.java.projet_dice_forge.Plateau_Joueur;

import main.java.projet_dice_forge.Ressource.Ressource;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Cette classe représente une face d'un dé
 */

public class Face {
    private ArrayList<Ressource> ListeResource;

    /**
     * Ce constructeur crée une face avec une nouvelle liste de ressources
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


    /**
     * Cette methode vérifie si le type de ressource de cette face est la gloire
     * @return boolean
     */

    /**
     * Cette methode vérifie si le type de ressource de cette face est l'or
     * @return boolean
     */

    public boolean laFaceNeContientQueDeLOr(){
        boolean testeur=false;

        if(this.getRessource().size()==1 && this.getRessource().get(0).getTypeRessource().equals("Or")){
            testeur=true;
        }
        return testeur;
    }

    public boolean laFaceNeContientQueDeLaGloire(){
        boolean testeur=false;

        if(this.getRessource().size()==1 && this.getRessource().get(0).getTypeRessource().equals("Gloire")){
            testeur=true;
        }
        return testeur;
    }

    /**
     *
     * @return le type de ressource gagné
     */


    @Override
    public boolean equals(Object other)
    {
        if(other instanceof Face && other != null) {
            Face face = (Face) other;
            if(face.ListeResource.size() != this.ListeResource.size()) return false;
            ArrayList<Ressource> ressources = face.ListeResource;
            for(Ressource res : ressources)
            {
                boolean isIn = false;
                for(Ressource res2 : this.ListeResource)
                {
                    if(res.equals(res2)){
                        isIn = true;
                        break;
                    }
                }
                if(!isIn) return false;
            }
            return true;
        } else
        {
            return false;
        }

    }

    public int getValeurFace(){

    return this.getRessource().stream()
            .map(ressource->ressource.getNbRessources())
            .reduce(0, (valeurFace, count) -> valeurFace + count);
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        for(Ressource r : this.ListeResource){
            stringBuilder.append(r.getNbRessources());
            stringBuilder.append(" ");
            stringBuilder.append(r.getTypeRessource());
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }




}


