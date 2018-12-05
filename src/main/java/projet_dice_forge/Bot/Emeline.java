package main.java.projet_dice_forge.Bot;

import main.java.projet_dice_forge.Partie_Bassin.Bassin;
import main.java.projet_dice_forge.Partie_Bassin.Temple;
import main.java.projet_dice_forge.Partie_Iles.Carte;
import main.java.projet_dice_forge.Partie_Iles.Iles;
import main.java.projet_dice_forge.Partie_Iles.PlateauDesIles;
import main.java.projet_dice_forge.Plateau_Joueur.De;
import main.java.projet_dice_forge.Plateau_Joueur.Face;
import main.java.projet_dice_forge.Plateau_Joueur.PlateauDuJoueur;
import main.java.projet_dice_forge.Ressource.Or;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        this.lanceDe();
        setDetailTour ("Joueur "+ super.id + "\ngloire: "+ this.getPtGloire() + " or: "+ this.Plateau.getOr() +" FragementLuanire: "
                + this.Plateau.getFragmentLunaire() + " FragementSolaire: " + this.Plateau.getFragmentSolaire() +"\n");
        if (tour<5){
                this.accederAuMeilleurBassin( temple);
            }
        else {
            this.acheterCarte(plateauDesIles.getIlesNb(dansQuelleIleAller(plateauDesIles)), quelleCarteAcheter(plateauDesIles));
        }

            tour++;
    }


    /**
     * On détermine la meilleure face à acheter en fonction de lor
     * @param temple
     */
        public void accederAuMeilleurBassin(Temple temple) {
            ArrayList<Face> facesDisponibles = new ArrayList<>();


            int prixDuMeilleurPlateau =this.quelEstLeMeilleurBassin(temple);
                    facesDisponibles = temple.getFaceFromBassin(prixDuMeilleurPlateau);

                    this.acheterFace(temple, quelleFaceAcheter(facesDisponibles), quelleFaceChanger(quelDeChanger()), 1);

        }

    /**
     * On recherche la face à changer parmi les faces du joueur
     * @param de
     * @return
     */

    public Face quelleFaceChanger( De de){

            int idFace=0;
            int valeurActuelle=0;
            for (int i=0; i<6; i++){
            Face face= de.getface(i);

                if(valeurActuelle<face.getValeurFace() && face.laFaceNeContientQueDeLOr()){
                    valeurActuelle=face.getValeurFace();
                    idFace=i;
                    }
                }
            return de.getface(idFace);
        }

    /**
     * Choisis la face à acheter dans la basssin
     * @param facesDisponibles
     * @return Face face
     */
    public Face quelleFaceAcheter( ArrayList<Face> facesDisponibles){

        Face face= facesDisponibles.get(0);

        for(Face face1: facesDisponibles){
            if(face1.getValeurFace()> face.getValeurFace()) face=face1;
        }
        return face;
        }


    /**
     * on deteermine le dé avec le moins de ressources
     * @return De de
     */
    public De quelDeChanger(){
        return (DeClaire.getValeurDe()>DeSombre.getValeurDe())? DeClaire : DeSombre;
    }

    /**
     * Cette méthode détermine le meilleur bassin dans leuel on peut accéder
     * @param temple
     * @return
     */
    public int quelEstLeMeilleurBassin(Temple temple) {
        Bassin meilleurBassin = temple.getBassin(2);
        int monOr = this.getPlateauDuJoueur().getOr();
        List<Bassin> bassins = temple.getBassins();
        for (int i = 0; i == bassins.size(); i++) {
            if (monOr >= bassins.get(i).getCout()) {
                meilleurBassin = bassins.get(i);
            }
        }
        return meilleurBassin.getCout();
    }

    /**
     * Cette méthode retourne la carte la plus chère achetable
     * @param plateauDesIles
     * @return
     */
    public Carte quelleCarteAcheter(PlateauDesIles plateauDesIles) {

        int mesSolaires = this.getPlateauDuJoueur().getFragmentSolaire();
        int mesLunaires = this.getPlateauDuJoueur().getFragmentLunaire();
        Carte carte= plateauDesIles.getIlesN1().getCarte(0);

        ArrayList<Carte> listeCartes = new ArrayList<>();
        ArrayList<Iles> listeIles = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            listeIles.add(plateauDesIles.getIlesNb(i));
        }


        listeIles.forEach(iles -> listeCartes.addAll(iles.getListCartes()));

        for (int i = 0; i == listeCartes.size(); i++) {
            if (listeCartes.get(i).getTypeRessourcesRéclamées().equals("FragementSolaire")) {
                if (this.getPlateauDuJoueur().getFragmentSolaire() >= listeCartes.get(i).getPrixSolaire()) {
                    carte= listeCartes.get(i);
                }
            }
            if (listeCartes.get(i).getTypeRessourcesRéclamées().equals("FragementLunaire")) {
                if (this.getPlateauDuJoueur().getFragmentLunaire() >= listeCartes.get(i).getPrixLunaire()) {
                    carte = listeCartes.get(i);
                }
            }
            if (listeCartes.get(i).getTypeRessourcesRéclamées().equals("all")) {
                if (this.getPlateauDuJoueur().getFragmentLunaire() >= listeCartes.get(i).getPrixLunaire()
                        && this.getPlateauDuJoueur().getFragmentSolaire() >= listeCartes.get(i).getPrixSolaire()) {
                    carte = listeCartes.get(i);
                }


            }


        }
        return carte;
    }

    /**
     * cette méthode vérifie si on peut acheter la carte de l'Hydre
     * @param plateauDesIles
     * @return
     */
    public boolean puisjeAcheterLaCarteLaaPlusChere(PlateauDesIles plateauDesIles){
        Iles ile = plateauDesIles.getIlesNb(1);
        if (this.getPlateauDuJoueur().getFragmentSolaire()>=6 && this.getPlateauDuJoueur().getFragmentLunaire()>6){
            return true;
        }
        else return false;
    }

    /**
     * Determine la meilleure ile accédable
     * @param plateauDesIles
     * @return
     */
    public int dansQuelleIleAller(PlateauDesIles plateauDesIles){
        int mesSolaires=this.getPlateauDuJoueur().getFragmentLunaire();
        int mesLunaires=this.getPlateauDuJoueur().getFragmentSolaire();
        int prixIle=0;
        int ile1=0, ile2=0;

        if(this.puisjeAcheterLaCarteLaaPlusChere(plateauDesIles)) return 7;

        else {

            if(mesSolaires>mesLunaires) {
                for (int i = 1; i < 7; i++) {
                    boolean act1 = plateauDesIles.getIlesNb(i).getListCartes().get(plateauDesIles.getIlesNb(i).getListCartes().size()).getPrixSolaire() > prixIle;
                    boolean act2 = plateauDesIles.getIlesNb(i).getListCartes().get(plateauDesIles.getIlesNb(i).getListCartes().size()).getPrixSolaire() < mesSolaires;
                    if (act1 && act2)
                        prixIle = plateauDesIles.getIlesNb(i).getListCartes().get(plateauDesIles.getIlesNb(i).getListCartes().size()).getPrixSolaire();
                    ile1 = i;

                }
                return ile1;
            }


            if(mesSolaires<mesLunaires) {
                for (int j = 1; j < 7; j++) {
                    boolean act1 = plateauDesIles.getIlesNb(j).getListCartes().get(plateauDesIles.getIlesNb(j).getListCartes().size()).getPrixLunaire() > prixIle;
                    boolean act2 = plateauDesIles.getIlesNb(j).getListCartes().get(plateauDesIles.getIlesNb(j).getListCartes().size()).getPrixLunaire() < mesSolaires;
                    if (act1 && act2)
                        prixIle = plateauDesIles.getIlesNb(j).getListCartes().get(plateauDesIles.getIlesNb(j).getListCartes().size()).getPrixLunaire();
                    ile2 = j;

                }
                return ile2;
            }


        }

        return 0;
    }

    //public boolean puisJeAcheterAvecLunaire(){ }

    }


