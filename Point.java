public class Point {
    private double abcsisse;
    private double ordonnee;
    
    public  Point(){
        this.abcsisse=0;
        this.ordonnee=0;
    }
    public Point(double abcsisse,double ordonnee){
        this.abcsisse=abcsisse;
        this.ordonnee=ordonnee;
    }
    public void Intialiser(double abcsisse,double ordonnee){
        this.abcsisse=abcsisse;
        this.ordonnee=ordonnee;
    }
    public void deplacer(double x,double y){
        this.abcsisse=this.abcsisse+x;
        this.ordonnee=this.ordonnee+y;
    }   
    public void afficher(){
        System.out.println("je suis un point de coordonnees:"+this.abcsisse+"et"+this.ordonnee);
    }
    public void identifie(){
        System.out.println("je suis un point");
    }
}