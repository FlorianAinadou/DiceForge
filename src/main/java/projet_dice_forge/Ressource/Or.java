package main.java.projet_dice_forge.Ressource;

public class Or extends Ressource{
    /**
     *Ressource correspondant à l'or
     */


    public Or(){
        super.idRessource=1;
        this.maxRessources=12;

    }
    public Or(int nombre){
        super.nombre=nombre;
        super.idRessource=1;
        this.maxRessources=12;

    }


    @Override
    public String getTypeRessource() {
        return "Or";
    }


}
