public class comptesecurise extends CompteEpargne{
    public comptesecurise (int numero,String name,int solde,int taux){
        super(numero,name,solde,taux);
    }
    public void Retirer(int montant){
        if (this.solde<montant){
            System.out.println("solde insuffissant");
        }
        else{
            this.solde-=montant;
        }
    }
}
