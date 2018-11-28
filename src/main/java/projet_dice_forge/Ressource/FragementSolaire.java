package main.java.projet_dice_forge.Ressource;

public class FragementSolaire extends Ressource {
    /**
     *Ressource correspondant aux fragements solaires
     */
    public FragementSolaire(int nombre){
        super.nombre=nombre;
        super.idRessource=3;
    }

    @Override
    public String getTypeRessource() {
        return "FragementSolaire";
    }
}
