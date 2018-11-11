package main.java.projet_dice_forge;

public class Bot extends Joueur {
    protected String detailTour;

    Bot(int id) {
        super(id);
    }

    public String getDetailTour() {
        return detailTour;
    }

    public void jouer(Temple temple, PlateauDesIles plateauDesIles ) {}
}
