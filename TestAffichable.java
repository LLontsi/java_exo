package exo6;
public class TestAffichable {
    public static void main(String[] args) {
        Affichable[] tableau = new Affichable[2];
        tableau[0] = new Entier(25);
        tableau[1] = new Flottant(1.25f);

        for (Affichable element : tableau) {
            element.affiche();
        }
    }
}