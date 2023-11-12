package exo5;
abstract class Affichable {
    public abstract void affiche();
}

// Classe dérivée pour les entiers
class Entier extends Affichable {
    private int valeur;

    public Entier(int valeur) {
        this.valeur = valeur;
    }

    @Override
    public void affiche() {
        System.out.println("Je suis un entier de valeur " + valeur);
    }
}

// Classe dérivée pour les flottants
class Flottant extends Affichable {
    private float valeur;

    public Flottant(float valeur) {
        this.valeur = valeur;
    }

    @Override
    public void affiche() {
        System.out.println("Je suis un flottant de valeur " + valeur);
    }
}

