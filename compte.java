

public class compte {
    private int Numero;
    private String proprietaire;
    protected int solde;

    public compte(int numero,String name,int solde){
        this.Numero=numero;
        this.proprietaire=name;
        this.solde=solde;
    }
    public void Deposer(int montant){
        solde+=montant;
    }
    public void Retirer(int montant){
        this.solde-=montant;
    }
}

