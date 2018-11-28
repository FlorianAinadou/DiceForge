package main.java.projet_dice_forge.Ressource;

public class FragementLunaire extends Ressource{

    /**
    *Ressource correspondant aux fragements lunaires
     */
    public FragementLunaire(int nombre){
        super.nombre=nombre;
        super.idRessource=4;
    }
    public String getTypreRessource(){
        return "FragementLuanire";
    }

    @Override
    public String getTypeRessource() {
        return "FragementLunaire";
    }
}
