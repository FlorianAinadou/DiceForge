package main.java.projet_dice_forge.Bot;

import main.java.projet_dice_forge.Partie_Bassin.Temple;
import main.java.projet_dice_forge.Partie_Iles.PlateauDesIles;
import main.java.projet_dice_forge.Plateau_Joueur.De;
import main.java.projet_dice_forge.Plateau_Joueur.Face;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Emeline extends Bot {

    public Emeline(int id) {
        super(id);
    }

    /**
     *
     * @param temple
     * @param plateauDesIles
     * Cette réérriture de la méthode jouer permet au Bot de faire des actions réfléchies
     */
    @Override
    public void jouer(Temple temple, PlateauDesIles plateauDesIles) {
            super.jouer(temple, plateauDesIles);
            this.accederAuMeilleurBassin( temple);


            //Avec un fragment lunaire, on achete la carte Le Marteau de Forgeron
            if(this.getPlateauDuJoueur().getFragmentLunaire()>=1){
            this.acheterCarte(plateauDesIles.getIlesN1(),plateauDesIles.getIlesN1().getCarte(0));
            plateauDesIles.getIlesN1().enleverCarte(plateauDesIles.getIlesN1().getCarte(0) );
            this.getListeCarte().get(0).activerCarte();
            }

    }


    /**
     * On détermine la meilleure face à acheter en fonction de lor
     * @param temple
     */
        public void accederAuMeilleurBassin(Temple temple) {
            ArrayList<Face> facesDisponibles = new ArrayList<>();

            int prixDuMeilleurPlateau = this.quelEstLeMeilleurBassin(temple);

            switch (prixDuMeilleurPlateau) {
                case 2: {
                    facesDisponibles = temple.getFaceFromBassin(2);
                    this.acheterFace(temple, facesDisponibles.get(1), quelleFaceChanger(2)), 1);
                }
                case 3: {
                    facesDisponibles = temple.getFaceFromBassin(3);
                    this.acheterFace(temple, facesDisponibles.get(1), new Face(new int[]{1}, new String[]{"Or"}), 1);
                }
                case 4: {
                    facesDisponibles = temple.getFaceFromBassin(4);
                    this.acheterFace(temple, facesDisponibles.get(1), new Face(new int[]{1}, new String[]{"Or"}), 1);
                }
                case 5: {
                    facesDisponibles = temple.getFaceFromBassin(5);
                    this.acheterFace(temple, facesDisponibles.get(1), new Face(new int[]{1}, new String[]{"Or"}), 1);
                }
                case 6: {
                    facesDisponibles = temple.getFaceFromBassin(6);
                    this.acheterFace(temple, facesDisponibles.get(1), new Face(new int[]{1}, new String[]{"Or"}), 1);
                }
                case 8: {
                    facesDisponibles = temple.getFaceFromBassin(8);
                    this.acheterFace(temple, facesDisponibles.get(1), new Face(new int[]{1}, new String[]{"Or"}), 1);
                }
                case 12: {
                    facesDisponibles = temple.getFaceFromBassin(12);
                    this.acheterFace(temple, facesDisponibles.get(1), new Face(new int[]{1}, new String[]{"Or"}), 1);
                }

            }
        }

        public Face quelleFaceChanger( int idDé){

            int idFace=0;
            int valeurActuelle=0;
            for (int i=0; i<6; i++){
            Face face= this.getDe( idDé).getface(i);

                if(valeurActuelle<face.getValeurFace()){
                    valeurActuelle=face.getValeurFace();
                    idFace=i;
                    }
                }
            return this.getDe(idDé).getface(idFace);
        }









    }


