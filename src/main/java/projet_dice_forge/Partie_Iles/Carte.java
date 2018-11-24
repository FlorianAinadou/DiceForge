package main.java.projet_dice_forge.Partie_Iles;


/*
public enum Carte {
    LesHerbesFolles(14,"Les herbes folles",new int[]{1},new String[]{"PierredeLune"},2,false);

    private String nomDeLexploit;
    private int[] prix;
    private String[] Ressource;
    private int pointDeGloire;
    private int idCarte;
    private boolean activerOuPas;
    private Effet effet;

    ///////////////////////////CarteLunaire/////////////////////////////////////////////////////////////
    //LeMarteauDuForgeron(1,"Le Marteau Du forgeron",new int[]{1},new String[]{"PierredeLune"},0,false,new),
    //LeCoffreDuForgeron(2,"le coffre du forgeron",new int[]{1},new String[]{"PierredeLune"},2,false,new),

    LaGrandeOurse(3,"La grande ourse",new int[]{2},new String[]{"PierredeLune"},2),
    LesSabotsDargent(4,"Les Sabots D'argents",new int[]{2},new String[]{"PierredeLune"},2),
    LesSatyres(5,"Les Satyres",new int[]{3},new String[]{"PierredeLune"},6),
    LeSanglierAcharne(6,"Le sanglier Acharné",new int[]{3},new String[]{"PierredeLune"},4),

    ///////////////////////CarteSolaire/////////////////////////////////////////////////////////////////

   // LAncien(15,"L'ancien",new int[] {1},new String[]{"PierredeSoleil"},0,false,new );


    Carte(int idCarte, String nomDeLexploit, int[] prix, String[] Ressource, int pointDeGloire, boolean activerOuPas){
        this.nomDeLexploit=nomDeLexploit;
        this.prix = prix;
        this.Ressource = Ressource;
        this.pointDeGloire=pointDeGloire;
        this.idCarte=idCarte;
        this.activerOuPas=false;
    }

    public int getIdCarte() {
        return idCarte;
    }

    public void afficherCarte(){
        System.out.println(this.nomDeLexploit);
    }

    public int getPrix(int i){
        return this.prix[i];
    }
    public String getRessource(int i) {
        return this.Ressource[i];
    }
    public int getPointDeGloire(){
        return this.pointDeGloire;
    }

    public String getNomDeLexploit() {
        return nomDeLexploit;
    }


}
*/

public class Carte {
    protected String nomDeLexploit;
    protected int[] prix;
    protected String[] Ressource;
    protected int pointDeGloire;
    protected int idCarte;
    protected boolean activerOuPas;

    public Carte(int idCarte,String nomDeLexploit,int[] prix, String[] Ressource, int pointDeGloire,boolean activerOuPas){
        this.nomDeLexploit=nomDeLexploit;
        this.prix = prix;
        this.Ressource = Ressource;
        this.pointDeGloire=pointDeGloire;
        this.idCarte=idCarte;
        this.activerOuPas=false;
    }
    public Carte(int idCarte,int[] prix, String[] Ressource, int pointDeGloire,boolean activerOuPas){
        this.idCarte=idCarte;
        this.prix = prix;
        this.Ressource = Ressource;
        this.pointDeGloire=pointDeGloire;
        this.activerOuPas=false;
    }





    public void afficherCarte(){
        System.out.println(this.nomDeLexploit);
    }

    public int getIdCarte() {
        return idCarte;
    }

    public int getPrix(int i){
        return this.prix[i];
    }
    public String getRessource(int i) {
        return this.Ressource[i];
    }
    public int getPointDeGloire(){
        return this.pointDeGloire;
    }

    public void setIdCarte(int idCarte) {
        this.idCarte = idCarte;
    }

    public void setNomDeLexploit(String nomDeLexploit) {
        this.nomDeLexploit = nomDeLexploit;
    }

    public void setPointDeGloire(int pointDeGloire) {
        this.pointDeGloire = pointDeGloire;
    }

    public void setPrix(int[] prix) {
        this.prix = prix;
    }

    public void setRessource(String[] ressource) {
        Ressource = ressource;
    }


    public void activerCarte(){
        this.activerOuPas=true;
    }

    public boolean isActiverOuPas() {
        return activerOuPas;
    }
}






