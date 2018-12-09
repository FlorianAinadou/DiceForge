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
        tour++;
        int monOr=this.getPlateauDuJoueur().getOr();
        super.jouer(temple,plateauDesIles);
        this.getListeCarteEffetPermanent().forEach(carteEffetPermanent -> carteEffetPermanent.activerEffetCartePerm(this));

        if (tour<5) {

            if (quelEstLeMeilleurBassin(temple) != 0)
                while( quelEstLeMeilleurBassin( temple)!=0)this.accederAuMeilleurBassin(temple);
            else if (this.puisJeAcheterLeCoffre(plateauDesIles)) {
                    this.acheterCarte(plateauDesIles.getIlesNb(7), plateauDesIles.getIlesNb(1).getCarte(0));
                }
            }

        else {


            if (puisjeAcheterLaCarteLaaPlusChere(plateauDesIles) && plateauDesIles.getIlesNb(4).getListCartes().size()!=0){
                acheterCarte(plateauDesIles.getIlesNb(4), quelleCarteAcheter(plateauDesIles.getIlesNb(4)));
            }
            if(puisJeAcheterUneCarte(plateauDesIles)) {
                Iles ileAAtteindre= plateauDesIles.getIlesNb(dansQuelleIleAller(plateauDesIles));
                if(ileAAtteindre.getListCartes().size()!=0) this.acheterCarte(ileAAtteindre , quelleCarteAcheter(ileAAtteindre));


            }
            else{
                if (quelEstLeMeilleurBassin(temple) != 0)
                    while( quelEstLeMeilleurBassin( temple)!=0)this.accederAuMeilleurBassin(temple);
            }
        }



    }


    /**
     * On détermine la meilleure face à acheter en fonction de lor
     * @param temple
     */
        public void accederAuMeilleurBassin(Temple temple) {
            int monOr= this.getPlateauDuJoueur().getOr();
            ArrayList<Face> facesDisponibles = new ArrayList<>();


            int prixDuMeilleurPlateau =this.quelEstLeMeilleurBassin(temple);
            facesDisponibles = temple.getFaceFromBassin(prixDuMeilleurPlateau);

            this.acheterFace(temple, quelleFaceAcheter(facesDisponibles), quelleFaceChanger(quelDeChanger()), quelDeChanger().getIdDe());

        }

    /**
     * On recherche la face à changer parmi les faces du joueur
     * @param de
     * @return
     */

    public Face quelleFaceChanger( De de){

            int idFace=0;
            int valeurActuelle=1;
            for (int i=0; i<6; i++){
            Face face= de.getface(i);

                if(valeurActuelle>=face.getValeurFace() && face.laFaceNeContientQueDeLOr()){
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
    public Face quelleFaceAcheter( ArrayList<Face> facesDisponibles) {
        int monOr= this.getPlateauDuJoueur().getOr();
        if (facesDisponibles.size() != 0) {
            Face face = facesDisponibles.get(0);

            for (Face face1 : facesDisponibles) {
                if (face1.getValeurFace() > face.getValeurFace() && !face1.laFaceNeContientQueDeLOr()) face = face1;
            }
            return face;
        }
        return null;
    }


    /**
     * on deteermine le dé avec le moins de ressources
     * @return De de
     */
    public De quelDeChanger(){
        return (DeClaire.getValeurDe()<DeSombre.getValeurDe())? DeClaire : DeSombre;
    }

    /**
     * Cette méthode détermine le meilleur bassin dans leuel on peut accéder
     * @param temple
     * @return
     */
    public int quelEstLeMeilleurBassin(Temple temple) {
        int count=0;
        Bassin meilleurBassin = temple.getBassin(2);
        int monOr = this.getPlateauDuJoueur().getOr();
        List<Bassin> bassins = temple.getBassins();
        for (int i = 0; i < bassins.size(); i++) {
            if (monOr >= bassins.get(i).getCout() && bassins.get(i).getListFace().size()!=0) {
                meilleurBassin = bassins.get(i);
                count= meilleurBassin.getCout();
            }
        }
        return count;
    }


    /**
     * Cette méthode retourne la carte la plus chère achetable
     * @param ile
     * @return
     */
    public Carte quelleCarteAcheter(Iles ile) {

        int mesSolaires = this.getPlateauDuJoueur().getFragmentSolaire();
        int mesLunaires = this.getPlateauDuJoueur().getFragmentLunaire();


        if(ile.getListCartes().size()!=0) {
           Carte carte = ile.getCarte(0);


           ArrayList<Carte> listeCartes = new ArrayList<>();
           listeCartes.addAll(ile.getListCartes());
        /* ArrayList<Iles> listeIles = new ArrayList<>();
        for (int i = 1; i < 7; i++) {
            listeIles.add(plateauDesIles.getIlesNb(i));
        }


        listeIles.forEach(iles -> listeCartes.addAll(iles.getListCartes()));
        */
           if (ile.getListCartes().size() != 0) {
               for (int i = 0; i < listeCartes.size(); i++) {
                   if (listeCartes.get(i).getTypeRessourcesRéclamées().equals("FragementSolaire")) {
                       if (this.getPlateauDuJoueur().getFragmentSolaire() >= listeCartes.get(i).getPrixSolaire()) {
                           carte = listeCartes.get(i);
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
       }
         return null;
    }

    /**
     * cette méthode vérifie si on peut acheter la carte de l'Hydre
     * @param plateauDesIles
     * @return
     */
    public boolean puisjeAcheterLaCarteLaaPlusChere(PlateauDesIles plateauDesIles){
        Iles ile = plateauDesIles.getIlesNb(1);
        if (this.getPlateauDuJoueur().getFragmentSolaire()>=6 && this.getPlateauDuJoueur().getFragmentLunaire()>=6){
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
        int mesSolaires=this.getPlateauDuJoueur().getFragmentSolaire();
        int mesLunaires=this.getPlateauDuJoueur().getFragmentLunaire();
        int prixIle=0;
        int ile1=0, ile2=0;

        //if(this.puisjeAcheterLaCarteLaaPlusChere(plateauDesIles)) return 7;

       // else {

            if(mesSolaires>mesLunaires) {
                for (int i = 1; i < 8; i++) {
                    if(plateauDesIles.getIlesNb(i).getListCartes().size()-1>0) {
                        boolean act1 = plateauDesIles.getIlesNb(i).getListCartes().get(plateauDesIles.getIlesNb(i).getListCartes().size() - 1).getPrixSolaire() > prixIle;
                        boolean act2 = plateauDesIles.getIlesNb(i).getListCartes().get(plateauDesIles.getIlesNb(i).getListCartes().size() - 1).getPrixSolaire() <= mesSolaires;
                        boolean act3 = plateauDesIles.getIlesNb(i).getListCartes().get(plateauDesIles.getIlesNb(i).getListCartes().size() - 1).getTypeRessourcesRéclamées().equals("FragementSolaire");
                        if (act1 && act2 && act3 &&  plateauDesIles.getIlesNb(i).getListCartes().size()!=0) {
                            prixIle = plateauDesIles.getIlesNb(i).getListCartes().get(plateauDesIles.getIlesNb(i).getListCartes().size() - 1).getPrixSolaire();
                            ile1 = i;
                        }
                    }

                }
                return ile1;
            }


           else {
                for (int j = 1; j < 8; j++) {
                    if(plateauDesIles.getIlesNb(j).getListCartes().size()-1>0) {
                        boolean act1 = plateauDesIles.getIlesNb(j).getListCartes().get(plateauDesIles.getIlesNb(j).getListCartes().size() - 1).getPrixLunaire() > prixIle;
                        boolean act2 = plateauDesIles.getIlesNb(j).getListCartes().get(plateauDesIles.getIlesNb(j).getListCartes().size() - 1).getPrixLunaire() <= mesLunaires;
                        boolean act3 = plateauDesIles.getIlesNb(j).getListCartes().get(plateauDesIles.getIlesNb(j).getListCartes().size() - 1).getTypeRessourcesRéclamées().equals("FragementLunaire");

                        if (act1 && act2 && act3 &&  plateauDesIles.getIlesNb(j).getListCartes().size()!=0 ) {
                            prixIle = plateauDesIles.getIlesNb(j).getListCartes().get(plateauDesIles.getIlesNb(j).getListCartes().size() - 1).getPrixLunaire();
                            ile2 = j;
                        }
                    }

                }
                return ile2;
            }


       // }

    }

    public boolean puisJeAcheterUneCarte(PlateauDesIles plateauDesIles){
        if(this.dansQuelleIleAller(plateauDesIles)==0){
            return false;
        }
        return true;
    }

    public boolean puisJeAcheterLeMarteau(PlateauDesIles plateauDesIles){
        if(this.getPlateauDuJoueur().getFragmentLunaire()>=1 && plateauDesIles.getIlesNb(1).getCarte(1)!=null) return true;

        return false;
    }

    public boolean puisJeAcheterLeCoffre(PlateauDesIles plateauDesIles){
        if(this.getPlateauDuJoueur().getFragmentLunaire()>=1 && plateauDesIles.getIlesNb(4).getCarte(3)!=null) return true;

        return false;
    }

    }


