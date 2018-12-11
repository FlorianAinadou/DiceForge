package main.java.projet_dice_forge.Plateau_Iles;

import main.java.projet_dice_forge.Partie_Iles.Carte;
import main.java.projet_dice_forge.Partie_Iles.Iles;
import main.java.projet_dice_forge.effet.EffetImmediat.LEnigme;

import main.java.projet_dice_forge.effet.EffetImmediat.LesHerbesFolles;
import main.java.projet_dice_forge.effet.EffetPermanent.LAncien;
import main.java.projet_dice_forge.effet.EffetPermanent.LesAilesDeLaGardienne;

import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;




public class IlesTest {
    Iles ile1 = new Iles();
    Iles ile2 = new Iles();

    private Carte carte1 = new LesHerbesFolles();
    private Carte carte2 = new LAncien();
    private Carte carte3 = new LEnigme();
    private Carte carte4 = new LesAilesDeLaGardienne();

    private Carte carte5 = new LesHerbesFolles();
    private Carte carte6 = new LAncien();
    private Carte carte7 = new LEnigme();
    private Carte carte8 = new LesAilesDeLaGardienne();



    public int calculerLeNombreDeCarteDansUneIle(Iles ile){
        int nbCarte=0;
        for (Carte Carte: ile.getListCartes()) {
            nbCarte++;
        }
        return nbCarte;
    }


    @Test
    public void verfierAjoutSuppCarteDansUneIle(){

        ile2.ajouterCarte(carte1);
        ile2.ajouterCarte(carte5);
        ile2.enleverCarte(carte1);

        ile1.ajouterCarte(carte1);

        int a = calculerLeNombreDeCarteDansUneIle(ile1);
        int b =calculerLeNombreDeCarteDansUneIle(ile2);

        assertEquals(a,b);
    }





}
