package main.java.projet_dice_forge.Ressource;

public abstract class Ressource {
    int nombre;
    int idRessource;
    /**
     *Ojet correspondant à une resssource servant pour l'hérédité
     */
    public Ressource(){
    }

    public int getNombre(){
        return this.nombre;
    }
    public abstract String getTypeRessource();
    public int getIdRessource(){return this.idRessource;}


}
