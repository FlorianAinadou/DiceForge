package main.java.projet_dice_forge.Plateau_Joueur;

import main.java.projet_dice_forge.Ressource.Ressource;

import java.util.ArrayList;

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

    public String afficherFace(){
        String string="";
        for (Ressource ressource:ListeResource) {
            string+= ressource.getNbRessources() + " " +ressource.getTypeRessource() + " \n";
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

    public boolean laFaceNeContientQueDeLOr(){
        boolean testeur=false;

        if(this.getRessource().size()==1 && this.getRessource().get(0).getTypeRessource().equals("or")){
            testeur=true;
        }
        return testeur;
    }

    /**
     *
     * @return le type de ressource gagné
     */

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
*/
    public int getValeurFace(){

    return this.getRessource().stream()
            .map(ressource->ressource.getNbRessources())
            .reduce(0, (valeurFace, count) -> valeurFace + count);
    }




}


