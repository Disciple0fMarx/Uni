public class Cercle extends Forme {
    private float rayon;


    public Cercle(float rayon) {
        this.rayon = rayon;
    }


    public float perimetre() {
        return 2 * 3.14f * this.rayon;
    }

    public float surface() {
        return 3.14f * this.rayon * this.rayon;
    }
}
