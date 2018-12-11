package main.java.projet_dice_forge.Bot;
import main.java.projet_dice_forge.Bot.Joueur;
import main.java.projet_dice_forge.Partie_Bassin.Temple;
import main.java.projet_dice_forge.Plateau_Joueur.Face;
import main.java.projet_dice_forge.Ressource.*;
import org.junit.Test;


public class JoueurTest {
    @Test
    public void acheterFaceTest(){
        Temple temple = new Temple();
        Joueur j1 = new Joueur(0);
        Face[] face  = j1.getDe(1).toutesLesFaces();
    }
}