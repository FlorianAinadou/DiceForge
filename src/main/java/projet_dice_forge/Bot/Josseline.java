package main.java.projet_dice_forge.Bot;

import main.java.projet_dice_forge.Partie_Bassin.Bassin;
import main.java.projet_dice_forge.Partie_Bassin.Temple;
import main.java.projet_dice_forge.Partie_Iles.Carte;
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
        Random rand = new Random();
        int randChoix = rand.nextInt(3);
        if(randChoix == 0){
            int size;
            int randRelance;
            do {
                size  = acheterAleaFace(temple);
                randRelance = rand.nextInt(2);
            } while(size > 0 && randRelance == 0);

        }
        if(randChoix == 1){
            acheterAleaCarte(plateauDesIles);
        }
    }

    private int acheterAleaFace(Temple temple) {
        Random rand = new Random();
        ArrayList<Bassin> bassins = getBassin(temple);
        if(bassins.size() > 0){
            int randomBassin = rand.nextInt(bassins.size());
            int randomDeNumber = 1 + rand.nextInt(2);

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
        return bassins.size();

    }

    private void acheterAleaCarte(PlateauDesIles plateauDesIles) {
        ArrayList<Carte> cartes = getCarte(plateauDesIles);

        Random rand = new Random();
        if (cartes.size() > 0) {
            int randCarte = rand.nextInt(cartes.size());
            acheterCarte(getIleFromCarte(cartes.get(randCarte), plateauDesIles), cartes.get(randCarte));
        }
    }

}
