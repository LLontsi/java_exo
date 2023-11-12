

public class Pointcol extends Point {
    private byte couleur;

    public Pointcol(double abcsisse,double ordonnee,byte couleur){
        super(abcsisse, ordonnee);
        this.couleur=couleur;
    }
    public void colorer(byte couleur){
        this.couleur=couleur;
    }
    public void afficheCol(){
        super.afficher();
        System.out.println("sa couleur"+this.couleur);
    }
}