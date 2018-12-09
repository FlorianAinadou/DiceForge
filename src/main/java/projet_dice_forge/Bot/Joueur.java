package main.java.projet_dice_forge.Bot;


import main.java.projet_dice_forge.Partie_Bassin.*;
import main.java.projet_dice_forge.Partie_Iles.*;
import main.java.projet_dice_forge.Plateau_Joueur.*;
import main.java.projet_dice_forge.Ressource.*;


import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Joueur {
    protected int id = -1;
    protected De DeClaire;
    protected De DeSombre;
    protected PlateauDuJoueur Plateau;
    protected ArrayList<CarteEffetImmediat> ListeCarteEffetImmediat;
    protected ArrayList<CarteEffetPermanent> ListeCarteEffetPermanent;
    protected ArrayList<CarteEffetImmediatRelJoueur> ListeCarteEffetImmRealJoueur;
    protected ArrayList<CarteEffetImmediatRelRessource> ListeCarteEffetImmediatRelRessource;
    protected int PointDeGloireCarte;
    protected ArrayList<Joueur> adversaires;
    protected String detailTour;


    protected boolean ActiverEffetLeMarteauDuForgeron=false;
    public Face claire;  //C'est pas beau je sais revoir autre méthode
    public Face sombre;   //C'est pas beau je sais revoir autre méthode
    public int nbAlea;
    int tour=1;


    public Joueur(int Idjoueur){
        this.id=Idjoueur;
        this.DeClaire=new De("claire");
        this.DeSombre=new De("sombre");
        this.Plateau=new PlateauDuJoueur(Idjoueur);
        this.ListeCarteEffetImmediat=new ArrayList<>();
        this.ListeCarteEffetPermanent=new ArrayList<>();
        this.ListeCarteEffetImmRealJoueur=new ArrayList<>();
        this.ListeCarteEffetImmediatRelRessource = new ArrayList<>();
        this.adversaires=new ArrayList<>();
    }

    public Joueur(int Idjoueur, De de1, De de2, PlateauDuJoueur Plateau){
        this.id=Idjoueur;
        this.DeClaire=de1;
        this.DeSombre=de2;
        this.Plateau=Plateau;
        this.ListeCarteEffetImmediat=new ArrayList<>();
        this.ListeCarteEffetPermanent=new ArrayList<>();
        this.ListeCarteEffetImmRealJoueur=new ArrayList<>();
        this.ListeCarteEffetImmediatRelRessource = new ArrayList<>();
        this.adversaires=new ArrayList<>();
    }

    /**
     * Retourne les dés du joueur concerné
     *
     */
    public De getDe(int idDe){
        if(idDe == 1){
            return DeClaire;
        }
        else{
            return DeSombre;
        }
    }
    public  PlateauDuJoueur getPlateauDuJoueur(){
        return Plateau;
    }

    public int getPtGloire() {
        return Plateau.getPointsDeGloire();
    }
    public int getPtOr(){
        return Plateau.getOr();
    }

    public void reset() {
        resetPlateauDuJoueur();
        resetDe();
    }

    public void resetDetailTour(){
        detailTour ="";
    }

    /**
     * Ces méthode permet de nous donner une liste d'adversaire de joueur de chaque adversaire
     * @param adversaires
     */
    public void setAdversaires(ArrayList<Joueur> adversaires) {
        this.adversaires = adversaires;
    }

    public ArrayList<Joueur> getAdversaires() {
        return adversaires;
    }

    ///////////////////////////////////////////Partie gère les Cartes du joueur////////////////////////////////////////////////////////////////////////////////////


    public ArrayList<CarteEffetImmediat> getListeCarteEffetImmediat() {
        return ListeCarteEffetImmediat;
    }

    public ArrayList<CarteEffetImmediatRelJoueur> getListeCarteEffetImmRealJoueur() {
        return ListeCarteEffetImmRealJoueur;
    }

    public ArrayList<CarteEffetPermanent> getListeCarteEffetPermanent() {
        return ListeCarteEffetPermanent;
    }

    public ArrayList<CarteEffetImmediatRelRessource> getListeCarteEffetImmediatRelRessource() {
        return ListeCarteEffetImmediatRelRessource;
    }


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private void resetPlateauDuJoueur() {
        this.Plateau = new PlateauDuJoueur(this.id);
    }

    /**
     * Cette classe reinitialise les dés. On l'utilise quand on veut relancer une partie
     */
    private void resetDe() {
        this.DeClaire = new De("claire");
        this.DeSombre = new De("sombre");
    }

    /**
     * Ces méthode nous permet de lancer un dée Sombre ou Claire et de recupérer sa face
     */
    public Face lanceLeDeSombre(){
        return this.DeSombre.lancerLeDe();
    }

    public Face lanceLeDeClaire(){
        return this.DeClaire.lancerLeDe();
    }



    /**
     * On lance les dés et on attribue au joueur en fonction du résultat du lancé des ressources
     * Donc ce qui représente les Faveur des dieux
     */
    public void lanceDe() {
        Face claire = faveurMineurChoix(0);
        Face sombre = faveurMineurChoix(1);
        StringBuilder s1= new StringBuilder();
        s1.append(detailTour);
        s1.append("Dé 1: " + claire.afficherFace() + "\n");
        s1.append("Dé 1: " + sombre.afficherFace() + "\n");
        detailTour = s1.toString();

    }

    public void acheterFace(Temple temp, Face acheter, Face echange, int idDe) {
        int size = temp.getBassins().size();
        for (int i = 0; i < size; i++) {
            Bassin bas = temp.getBassins().get(i);
            if (bas.faceIsIn(acheter)) {
                //this.Plateau.enleverOr(temp.getBassins().get(i).getCout());
            }
        }
        echangerFace(acheter, echange, idDe);
        temp.deleteFace(echange);
    }

    /**
     * On remplace une face du dé d'un joueur donné
     * @param nouvelle représente la nouvelle face à insérer
     * @param ancienne représente la face à remplacer
     * @param idDe renseigne le dé dont on veut modifier l'une des faces
     */
    private void echangerFace(Face nouvelle,Face ancienne,int idDe) {
        int i = 0;
        if(idDe == 1) {
            while(i<6  && !this.DeClaire.getface(i).equals(ancienne)) {
                i++;
            }
            DeClaire.ajouterUneFace(nouvelle,i);
        }
        else if(idDe == 2) {
            while( i<6 && !this.DeSombre.getface(i).equals(ancienne)) {
                i++;
            }
            DeSombre.ajouterUneFace(nouvelle,i);
        }
    }

    
    public int getIdJoueur(){
        return id;
    }

    public String getDetailTour() {
        return detailTour;
    }

    /*public int quelEstLeMeilleurBassin(Temple temple){
        Bassin meilleurBassin=temple.getBassin(2);
        int monOr= this.getPlateauDuJoueur().getOr();
        List<Bassin> bassins= temple.getBassins();
        for (int i=0; i==bassins.size(); i++) {
            if(monOr>bassins.get(i).getCout()){
                meilleurBassin=bassins.get(i);
            }
        }
        return meilleurBassin.getCout();
    }*/
///////////////////////////////////////////////////////////////////////////Partie Carte ///////////////////////////////////////////////////////////////////////////////////////

    /**
     * Cette méthode nous permet d'acheter une carte d'une ile et de la stocker dans une des listes de carte du joueur.
     * et d'ajouter dans un attribut de la classe joueur les points de gloire rapportée par chaque carte.
     * @param iles
     * @param carte
     */

    public void acheterCarte(Iles iles, Carte carte){
        carte.activerCarte();
        if(carte instanceof CarteEffetImmediat){
            CarteEffetImmediat carteEffetImmediat=(CarteEffetImmediat)carte;
            ListeCarteEffetImmediat.add(carteEffetImmediat);
            iles.enleverCarte(carte);
            ajouterPointDeGloire(carte);
            iles.joueurEstSurIle();
        }
        else if(carte instanceof CarteEffetPermanent){
            CarteEffetPermanent carteEffetPermanent=(CarteEffetPermanent)carte;
            ListeCarteEffetPermanent.add(carteEffetPermanent);
            iles.enleverCarte(carte);
            ajouterPointDeGloire(carte);
            iles.joueurEstSurIle();
        }

        else if (carte instanceof CarteEffetImmediatRelJoueur){
            CarteEffetImmediatRelJoueur carteEffetImmediatRelJoueur =(CarteEffetImmediatRelJoueur)carte;
            ListeCarteEffetImmRealJoueur.add(carteEffetImmediatRelJoueur);
            iles.enleverCarte(carte);
            ajouterPointDeGloire(carte);
            iles.joueurEstSurIle();
        }
        else if (carte instanceof CarteEffetImmediatRelRessource){
            CarteEffetImmediatRelRessource carteEffetImmediatRelRessource=(CarteEffetImmediatRelRessource)carte;
            ListeCarteEffetImmediatRelRessource.add(carteEffetImmediatRelRessource);
            iles.enleverCarte(carte);
            ajouterPointDeGloire(carte);
            iles.joueurEstSurIle();
        }
        StringBuilder s1 = new StringBuilder();
        s1.append(detailTour);
        s1.append("Le joueur "+ (this.getIdJoueur()+1) + " achete la carte "+ carte.getIdCarte() + "\n");
        detailTour = s1.toString();
    }


    /**
     * Cette méthode nous permet de stocker les points de gloire de chaque carte acheter dans une varriable int
     *
     */
    public void ajouterPointDeGloire(Carte carte){
        int pointDeGloireGagnerAvecCarte = carte.getPointDeGloire().getNbRessources();
        this.getPlateauDuJoueur().ajouterPointDeGloire(pointDeGloireGagnerAvecCarte);

    }

    public int getPointDeGloireCarte() {
        return PointDeGloireCarte;
    }

    public void setPointDeGloireCarte(int pointDeGloireCarte) {
        this.PointDeGloireCarte = pointDeGloireCarte;
    }

    /**
     * Cette méthode nous permet d'afficher les identifiants des cartes qui sont achété par le joueur
     */
    public void afficherCarteJoueur(){
        for (Carte carte: ListeCarteEffetImmediat){
            System.out.println(carte.getIdCarte());
        }
    }


    /**
     *
     *Cette méthode nous permet d'activer l'effet le marteau du forgeron.
     */

    public void setActiverEffetLeMarteauDuForgeron(boolean activerEffetLeMarteauDuForgeron) {
        ActiverEffetLeMarteauDuForgeron = activerEffetLeMarteauDuForgeron;
    }



    public boolean isActiverEffetLeMarteauDuForgeron() {
        return ActiverEffetLeMarteauDuForgeron;
    }


    /**
     * Cette méthode nous permet de parcourir la liste de carte que le Joueur possède à effet Immediat et d'appliquer les effets de chaque carte  et ensuite de
     * les désactiver en mettant une valeur false dans le boolean.
     */

    public void activerToutLesCartes(){
        if(!(getListeCarteEffetImmediat().isEmpty())){
            activerEffetCarteImmediat();
        }
        else if (!(getListeCarteEffetPermanent().isEmpty())){
            activerEffetCartePermanent();
        }
        else if (!(getListeCarteEffetImmRealJoueur().isEmpty())){
            activerEffetCarteImmRealJoueur();
        }
        else if(!(getListeCarteEffetImmediatRelRessource().isEmpty())){
            activerEffetCarteImmRealRessource();
        }
    }


/*
    public void activerEffetCarteImmediat(){
        for (CarteEffetImmediat carte: this.getListeCarteEffetImmediat()){
            if(carte.isActiverOuPas()){
                carte.activerEffetCarte(this);
                carte.desactiverCarte();
            }
        }

    }
    */

    public void activerEffetCarteImmediat(){
        for(int i=0;i<getListeCarteEffetImmediat().size();i++){
            if(ListeCarteEffetImmediat.get(i).isActiverOuPas()){
                ListeCarteEffetImmediat.get(i).activerEffetCarte(this);
                ListeCarteEffetImmediat.remove(i);
            }

        }

    }



    /**
     * Cette méthode nous permet de parcourir la liste de carte que le Joueur possède à effet Immediat en relation avec
     * les autres joueurs et d'appliquer les effets de chaque carte.
     */

    /*
    public void activerEffetCarteImmRealJoueur(){
        for (CarteEffetImmediatRelJoueur carte: this.getListeCarteEffetImmRealJoueur()){
            if(carte.isActiverOuPas()){
                carte.activerEffetImmCarteRealJoueur(this);
                carte.desactiverCarte();
            }
        }
    }

    */
    public void activerEffetCarteImmRealJoueur(){
        for(int i=0;i<getListeCarteEffetImmRealJoueur().size();i++){
            if(ListeCarteEffetImmRealJoueur.get(i).isActiverOuPas()){
                ListeCarteEffetImmRealJoueur.get(i).activerEffetImmCarteRealJoueur(this);
                ListeCarteEffetImmRealJoueur.remove(i);
            }
        }
    }



    /**
     *Cette méthode nous permet de parcourir la liste de carte que le Joueur possède à effet Permanent en relation avec
     * les autres joueurs et d'appliquer les effets de chaque carte.
     *
     */

    public void activerEffetCartePermanent(){
        for (CarteEffetPermanent carte: this.getListeCarteEffetPermanent()) {
            if (carte.isActiverOuPas()) {
                carte.activerEffetCartePerm(this);

            }
        }
    }


    public void activerEffetCarteImmRealRessource(){
        for(CarteEffetImmediatRelRessource carte: this.getListeCarteEffetImmediatRelRessource()) {
            if (carte.isActiverOuPas()) {
                carte.activerEffetCarteImmRelRessource(this);
            }
        }
    }




    /**
     * Cette méthode nous permet de lancer seulement un seul dé et d'ajouter ces gains aux joueurs concerné.
     * Ainsi on choisis de manière aléatoire le dée qu'on va lancée.
     */

    public void ajouterRessource(Face face){
        for (Ressource ressource:face.getRessource()){
            if(ressource.getIdRessource()==1){
                this.Plateau.ajouterOr(ressource.getNbRessources());
            }
            if(ressource.getIdRessource()==2){
                this.Plateau.ajouterPointDeGloire(ressource.getNbRessources());
            }
            if(ressource.getIdRessource()==4){
                this.Plateau.ajouterFragLun(ressource.getNbRessources());
            }
            if(ressource.getIdRessource()==3){
                this.Plateau.ajouterFragSol(ressource.getNbRessources());
            }
        }

    }

    /**
     * Cette méthode nous permet de vérifier si le lancé du  Dé claire contient bien de l'or pour ensuite activer l'effet de la carte
     * Le marteau du forgeron
     * @param joueur
     */
    public void effetMarteauDeClaire(Joueur joueur){
        if(claire.getRessource().contains(new Or())){
            CarteEffetImmediatRelRessource LeMarteauDuForgeron=this.getListeCarteEffetImmediatRelRessource().get(0);
            LeMarteauDuForgeron.activerEffetCarteImmRelRessource(this);
        }
    }


    /**
     * Cette méthode nous permet de vérifier si le lancé du  Dé Sombre contient bien de l'or pour ensuite activer l'effet de la carte
     * Le marteau du forgeron
     * @param joueur
     */
    public void effetMarteauDeSombre(Joueur joueur){
        if(sombre.getRessource().contains(new Or())){
            CarteEffetImmediatRelRessource LeMarteauDuForgeron=this.getListeCarteEffetImmediatRelRessource().get(0);
            LeMarteauDuForgeron.activerEffetCarteImmRelRessource(this);
        }
    }


    /**
     * Cette méthode nous permet de Lancer un des deux Dés du joueur(Random) et d'attribuer les resssources gagnées par le lancé de dé
     * De plus si le joueur a achetée la Carte Le marteau du forgeron cela influ (implique une modification)
     * sur le stockage des pièce d'or : choix de stocker les pièces d'or ou de les utiliser pour la quète.
     */
    public void faveurMineur(){
        Random Alea = new Random();
        this.nbAlea= Alea.nextInt(2);
        if(nbAlea==0){
            this.claire = this.DeClaire.lancerLeDe();

            if(ActiverEffetLeMarteauDuForgeron){
                effetMarteauDeClaire(this);
            }
            else{
                ajouterRessource(claire);
            }
        }
        else {
            this.sombre =this.DeSombre.lancerLeDe();
            if(ActiverEffetLeMarteauDuForgeron){
                effetMarteauDeSombre(this);
            }
            else {
                ajouterRessource(sombre);
            }
        }
    }

    /**
     * Cette méthode est la même que la précédente sauf que le joueur a la choix sur le choix du dée a lancer.
     * Soit le Dé Claire ,soit le Dé Sombre
     * @param choixDée
     * @return
     */

    public Face faveurMineurChoix(int choixDée){
        Face sombre, claire;
        if (choixDée == 0) {
            claire = this.DeClaire.lancerLeDe();

            if(ActiverEffetLeMarteauDuForgeron){
                effetMarteauDeClaire(this);
                return claire;

            }
            else{
                ajouterRessource(claire);
                return claire;

            }

        }

        else {
            sombre = this.DeSombre.lancerLeDe();
            if(ActiverEffetLeMarteauDuForgeron){
                effetMarteauDeSombre(this);
                return sombre;
            }


            else{
                ajouterRessource(sombre);
                return sombre;
            }

        }

    }

    public void setDe(De de1, De de2){
        this.DeClaire = de1;
        this.DeSombre = de2;
    }

    public int getNbAlea() {
        return nbAlea;
    }
}
