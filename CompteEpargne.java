
public class CompteEpargne extends compte {
    private double taux;

    public CompteEpargne(int numero,String name,int solde,double taux){
        super(numero, name, solde);
        this.taux=taux;
    }
    public void interet(){
        this.solde=(int)(solde+(taux*solde));
    }
}
