public class Rectangle extends Forme {
    private float longueur;
    private float largeur;


    public Rectangle(float longueur, float largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }


    public float perimetre() {
        return 2 * (this.longueur + this.largeur);
    }

    public float surface() {
        return this.longueur * this.largeur;
    }
}
