package main.java.projet_dice_forge.Bot;

import main.java.projet_dice_forge.Partie_Bassin.Bassin;
import main.java.projet_dice_forge.Partie_Bassin.Temple;
import main.java.projet_dice_forge.Partie_Iles.PlateauDesIles;
import main.java.projet_dice_forge.Plateau_Joueur.Face;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Josseline extends Bot {
    public Josseline(int id) {
        super(id);
    }

    @Override
    public void jouer(Temple temple, PlateauDesIles plateauDesIles) {
        super.jouer(temple, plateauDesIles);
        aleaFace(temple);
    }

    private void aleaFace(Temple temple) {
        Random rand = new Random();
        ArrayList<Bassin> bassins = getBassin(temple);
        if(bassins.size() > 0){
            int randomBassin = bassins.size()>1 ? rand.nextInt(bassins.size()-1) : 0;
            int randomDeNumber = 1 + rand.nextInt(1);

            ArrayList<Face> facesAcheter = bassins.get(randomBassin).getFace();
            if(facesAcheter.size() > 0){
                Face[] facesExchange = getFace(randomDeNumber);

                int randomFaceBoughtNumber = facesAcheter.size()> 1 ? rand.nextInt(facesAcheter.size()-1) : 0;
                int randomFaceExchangeNumber = rand.nextInt(facesExchange.length);


                Face randomFaceBought = facesAcheter.get(randomFaceBoughtNumber);
                Face randomFaceExchange = facesExchange[randomFaceExchangeNumber];

                acheterFace(temple, randomFaceBought, randomFaceExchange, randomDeNumber);
            }
        }

    }


}
