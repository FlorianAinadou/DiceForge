package main.java.projet_dice_forge.Ressource;

public abstract class Ressource {
    int nombre;
    int idRessource;
    int maxRessources;
    /**
     *Ojet correspondant à une resssource servant pour l'héréditage
     */
    public Ressource(){
    }

    public int getNbRessources(){
        return this.nombre;
    }
    public abstract String getTypeRessource();
    public int getIdRessource(){return this.idRessource; }
    public void setRessources(int nouvelleValeur){
        this.nombre=nouvelleValeur;
    }

    /**
     * On aoute des ressources tant qu'elles sont inférieurs à la limite du joueur
     * @param ressourcesAjoutées
     */
    public void ajoutRessources(int ressourcesAjoutées){
        if((this.getNbRessources() + ressourcesAjoutées)> this.maxRessources) {
            this.setRessources(this.maxRessources);
        }
        else {
            this.setRessources(nombre+ressourcesAjoutées);
        }
    }

    public void enleverRessources(int or) {
        if((this.nombre - or) >= 0 ) {
            this.setRessources(this.nombre-or);
        }
        else {
            System.out.println("Error : Vous avez tenter de retirer trop d'"+ this.getTypeRessource());

        }
    }

    public void setMaxRessources(int maxRessources) {
        this.maxRessources = maxRessources;
    }

    public int getMaxRessources() {
        return maxRessources;
    }


}
