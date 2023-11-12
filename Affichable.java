package exo6;

public interface Affichable {
    void affiche();
}
// Classe pour les entiers
class Entier implements Affichable {
    private int valeur;

    public Entier(int valeur) {
        this.valeur = valeur;
    }

    @Override
    public void affiche() {
        System.out.println("Je suis un entier de valeur " + valeur);
    }
}

// Classe pour les flottants
class Flottant implements Affichable {
    private float valeur;

    public Flottant(float valeur) {
        this.valeur = valeur;
    }

    @Override
    public void affiche() {
        System.out.println("Je suis un flottant de valeur " + valeur);
    }
}