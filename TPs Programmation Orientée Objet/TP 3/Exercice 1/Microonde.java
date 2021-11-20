public class Microonde extends Article {
    public String puissance;
    public String couleur;

    public Microonde() {
        super();
        this.puissance = "100W";
        this.couleur = "Blanc";
    }

    public Microonde(String M, String R, String P, String Pu, String C) {
        super(M, R, P);
        this.puissance = Pu;
        this.couleur = C;
    }
}
