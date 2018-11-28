package main.java.projet_dice_forge.Ressource;

public class Or extends Ressource{
    /**
     *Ressource correspondant à l'or
     */
    public Or(int nombre){
        super.nombre=nombre;
        super.idRessource=1;

    }

    public String getTypreRessource(){
        return "Or";
    }

    @Override
    public String getTypeRessource() {
        return "Or";
    }
}
