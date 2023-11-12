public class Testcompte {
    public static void main(String[] args) {
        // Test du compte ordinaire
        compte compte1 = new compte(123456, "John Doe", 1000);
        compte1.Deposer(500);
        compte1.Retirer(200);
        System.out.println("Solde compte1 : " + compte1.solde);

        // Test du compte d'épargne
        CompteEpargne compteEpargne1 = new CompteEpargne(654321, "Jane Smith", 2000, 0.05);
        compteEpargne1.Deposer(1000);
        compteEpargne1.interet();
        System.out.println("Solde compteEpargne1 : " + compteEpargne1.solde);

        // Test du compte sécurisé
        comptesecurise compteSecurise1 = new comptesecurise(987654, "Alice Johnson", 3000, 2);
        compteSecurise1.Deposer(1500);
        compteSecurise1.Retirer(400);
        System.out.println("Solde compteSecurise1 : " + compteSecurise1.solde);
    }
}