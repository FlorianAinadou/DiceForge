package main.java.projet_dice_forge.Bot;
import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.Partie_Bassin.Bassin;
import main.java.projet_dice_forge.Partie_Bassin.Temple;
import main.java.projet_dice_forge.Partie_Iles.Carte;
import main.java.projet_dice_forge.Partie_Iles.PlateauDesIles;
import main.java.projet_dice_forge.Plateau_Joueur.Face;
import main.java.projet_dice_forge.Ressource.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;


public class BotTest {
    @Test
    public void getBassin(){
        Temple temple = new Temple();
        Bot j1 = new Bot(0);
        Bot j2 = new Bot(1);
        Ressource res = new Or(10);
        Face face = new Face();
        face.AjouterRessource(res);
        j1.ajouterRessource(face);

        Face face2 = new Face();
        Ressource res2 = new Or(6);
        face2.AjouterRessource(res2);
        j2.ajouterRessource(face2);
        ArrayList<Bassin> bassins= j1.getBassin(temple);
        ArrayList<Bassin> bassin2 = j2.getBassin(temple);

        assertEquals(6, bassins.size());
        assertEquals(5, bassin2.size());

    }

    @Test
    public void getCarte(){
        PlateauDesIles plateauDesIles = new PlateauDesIles(4);
        Bot j1 = new Bot(1);
        ArrayList<Carte> cartes = j1.getCarte(plateauDesIles);

        assertEquals(cartes.size(), 0);

        Ressource res = new FragementLunaire(1);
        Ressource res2 = new FragementSolaire(1);

        Face face = new Face();
        face.AjouterRessource(res);
        face.AjouterRessource(res2);
        j1.ajouterRessource(face);
        ArrayList<Carte> cartes1 = j1.getCarte(plateauDesIles);

        assertEquals(8, cartes1.size());

        Ressource res3 = new FragementSolaire(3);
        Face face1 = new Face();
        face1.AjouterRessource(res);
        face1.AjouterRessource(res3);
        j1.ajouterRessource(face1);
        ArrayList<Carte> cartes2 = j1.getCarte(plateauDesIles);

        assertEquals(16, cartes2.size());

    }

    @Test
    public void acheterCarte(){
        Temple temple = new Temple();
        Bot j1 = new Bot(0);

        Ressource res = new Or(12);
        Face face = new Face();
        face.AjouterRessource(res);
        j1.ajouterRessource(face);

        ArrayList<Bassin> bassins= j1.getBassin(temple);
        ArrayList<Face> faces2 =  bassins.get(0).getListFace();
        ArrayList<Face> faces = new ArrayList<>();

        for(Bassin b : bassins){
            faces.addAll(b.getListFace());
        }

        assertEquals(38, faces.size());

        Face[] faces1 = j1.getFace(1);
        assertEquals(8, faces2.size());


        j1.acheterFace(temple, faces.get(0), faces1[0], 1);

        faces1 = j1.getFace(1);

        assertTrue(faces.get(0).equals(faces1[0]));
    }

}