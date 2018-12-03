package main.java.projet_dice_forge.effet.EffetImmediat;

import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.Partie_Iles.CarteEffetImmediatRelJoueur;
import main.java.projet_dice_forge.Plateau_Joueur.Face;
import main.java.projet_dice_forge.Ressource.FragementLunaire;
import main.java.projet_dice_forge.Ressource.Gloire;
import main.java.projet_dice_forge.Ressource.Ressource;

import java.util.ArrayList;
import java.util.Random;

public class LesSatyres extends CarteEffetImmediatRelJoueur {
    private ArrayList<Face> ListeFace = new ArrayList<>();
    private ArrayList<Face> ListeFaceAppliquer = new ArrayList<>();

    public LesSatyres() {
        super(10, new Ressource[]{new FragementLunaire(3)}, new Gloire(6), false);
    }

    void remplirLaListeResultat(Joueur joueur){
        for (Joueur joueur1 : joueur.getAdversaires()) {
            Face claire = joueur1.lanceLeDeClaire();
            Face sombre = joueur1.lanceLeDeSombre();
            ListeFace.add(claire);
            ListeFace.add(sombre);
        }

    }

    void choisirDeuxFacesAlea(){
        Random random= new Random();
        int rand1 = random.nextInt(ListeFace.size()+1);
        int rand2 = random.nextInt(ListeFace.size()+1);
        Face face1=ListeFace.get(rand1);
        Face face2=ListeFace.get(rand2);
        ListeFaceAppliquer.add(face1);
        ListeFaceAppliquer.add(face2);
    }


    public void activerEffetImmCarteRealJoueur(Joueur joueur) {
        remplirLaListeResultat(joueur);
        choisirDeuxFacesAlea();
        for (Face face:ListeFaceAppliquer){
            joueur.ajouterRessource(face);
        }

    }

    public ArrayList<Face> getListeFaceAppliquer() {
        return ListeFaceAppliquer;
    }

    public ArrayList<Face> getListeFace() {
        return ListeFace;
    }
}
