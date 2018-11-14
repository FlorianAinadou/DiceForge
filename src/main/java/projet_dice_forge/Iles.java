package main.java.projet_dice_forge;




public class Iles {
    private boolean portail;
    private int nbExploit;
    private int idIles;
    private boolean occupé =true;
    private Exploit[] ListeExploit;

    public Iles(){
        ListeExploit=new Exploit[nbExploit];


    }

    public Iles(int idIles,boolean portail,int nbExploit){
        this.portail=portail;
        this.nbExploit=nbExploit;
        this.idIles=idIles;
        ListeExploit= new Exploit[nbExploit];

    }

    public void joueurEstSurIle(){
        this.portail=occupé;
    }




}
