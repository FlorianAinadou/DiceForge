package main.java.projet_dice_forge.Bot;

import main.java.projet_dice_forge.Partie_Bassin.Temple;
import main.java.projet_dice_forge.Partie_Iles.PlateauDesIles;
import main.java.projet_dice_forge.Plateau_Joueur.Face;

import java.util.ArrayList;

public class Emeline extends Bot {

    Emeline(int id) {
        super(id);
    }

    @Override
    public void jouer(Temple temple, PlateauDesIles plateauDesIles) {
            super.jouer(temple, plateauDesIles);

            ArrayList<Face> facesDisponibles = new ArrayList<>();


            int prixDuMeilleurPlateau =this.quelEstLeMeilleurBassin(temple);

            switch (prixDuMeilleurPlateau) {
                case 2: {
                    facesDisponibles = temple.getFaceFromBassin(2);
                    this.acheterFace(temple, facesDisponibles.get(1), new Face(new int[]{1}, new String[]{"Or"}), 1);
                }
                case 3: {
                    facesDisponibles = temple.getFaceFromBassin(3);
                    this.acheterFace(temple, facesDisponibles.get(1), new Face(new int[]{1}, new String[]{"Or"}), 1);
                }
                case 4: {
                    facesDisponibles = temple.getFaceFromBassin(4);
                    this.acheterFace(temple, facesDisponibles.get(1), new Face(new int[]{1}, new String[]{"Or"}), 1);
                }
                case 5:{
                    facesDisponibles = temple.getFaceFromBassin(5);
                    this.acheterFace(temple, facesDisponibles.get(1), new Face(new int[]{1}, new String[]{"Or"}), 1);
                }
                case 6:{
                    facesDisponibles = temple.getFaceFromBassin(6);
                    this.acheterFace(temple, facesDisponibles.get(1), new Face(new int[]{1}, new String[]{"Or"}), 1);
                }
                case 8:{
                    facesDisponibles = temple.getFaceFromBassin(8);
                    this.acheterFace(temple, facesDisponibles.get(1), new Face(new int[]{1}, new String[]{"Or"}), 1);
                }
                case 12:{
                    facesDisponibles = temple.getFaceFromBassin(12);
                    this.acheterFace(temple, facesDisponibles.get(1), new Face(new int[]{1}, new String[]{"Or"}), 1);
                }

            }

        }



    }


