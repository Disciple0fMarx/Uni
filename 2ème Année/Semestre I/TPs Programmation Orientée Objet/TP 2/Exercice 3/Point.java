public class Point {
    private float abscisse;
    private float ordonnee;


    public Point() {
        this.abscisse = 0.0f;
        this.ordonnee = 0.0f;
    }


    public Point(float x, float y) {
        this.abscisse = x;
        this.ordonnee = y;
    }


    public void afficher() {
        System.out.println("(" + this.abscisse + ", " + this.ordonnee + ")");
    }

    public void deplacer(float dx, float dy) {
        this.abscisse += dx;
        this.ordonnee += dy;
    }


    public float getAbscisse() {
        return this.abscisse;
    }


    public float getOrdonnee() {
        return this.ordonnee;
    }


    public String toString() {
        return "Abscisse: " + this.abscisse + " | Ordonnee: " + this.ordonnee;
    }


    public boolean equals(Object o) {
        if (o instanceof Point) {
            Point Po = (Point)o;
            if (this.abscisse == Po.getAbscisse() && this.ordonnee == Po.getOrdonnee()) return true;
            return false;
        }
        return false;
    }
}
