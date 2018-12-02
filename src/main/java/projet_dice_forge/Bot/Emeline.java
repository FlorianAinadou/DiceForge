package main.java.projet_dice_forge.Bot;

import main.java.projet_dice_forge.Partie_Bassin.Temple;
import main.java.projet_dice_forge.Partie_Iles.PlateauDesIles;
import main.java.projet_dice_forge.Plateau_Joueur.De;
import main.java.projet_dice_forge.Plateau_Joueur.Face;
import main.java.projet_dice_forge.Ressource.Or;

import java.util.ArrayList;

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
        while(tour<5){
                this.accederAuMeilleurBassin( temple);
            }


            //Avec un fragment lunaire, on achete la carte Le Marteau de Forgeron
            if(this.getPlateauDuJoueur().getFragmentLunaire()>=1){
            this.acheterCarte(plateauDesIles.getIlesN1(),plateauDesIles.getIlesN1().getCarte(0));
            plateauDesIles.getIlesN1().enleverCarte(plateauDesIles.getIlesN1().getCarte(0) );
            this.getListeCarteEffetImmediat().get(0).activerCarte();
            }




    }


    /**
     * On détermine la meilleure face à acheter en fonction de lor
     * @param temple
     */
        public void accederAuMeilleurBassin(Temple temple) {
            ArrayList<Face> facesDisponibles = new ArrayList<>();

            int prixDuMeilleurPlateau =this.quelEstLeMeilleurBassin(temple);
                    facesDisponibles = temple.getFaceFromBassin(prixDuMeilleurPlateau);
                    this.acheterFace(temple, facesDisponibles.get(1), quelleFaceChanger(quelDeChanger()), 1);

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
     * on deteermine le dé avec le moins de ressources
     * @return De de
     */
    public De quelDeChanger(){
        return (DeClaire.getValeurDe()>DeSombre.getValeurDe())? DeClaire : DeSombre;
    }







    }


