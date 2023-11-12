

public class Pointcol extends Point {
    private byte couleur;

    public Pointcol(double abcsisse,double ordonnee,byte couleur){
        super(abcsisse, ordonnee);
        this.couleur=couleur;
    }
    public void colorer(byte couleur){
        this.couleur=couleur;
    }
    public void identifie(){
        System.out.println("je suis un point de couleur "+this.couleur);
    }
}