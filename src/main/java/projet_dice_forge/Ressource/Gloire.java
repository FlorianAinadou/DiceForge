package main.java.projet_dice_forge.Ressource;

public class Gloire extends Ressource{
    /**
     *Ressource correspondant aux points de gloire
     */
    public Gloire(int nombre){
        super.nombre=nombre;
        super.idRessource=2;
    }

    @Override
    public String getTypeRessource() {
        return "Gloire";
    }


}


