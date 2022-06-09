public class Television extends Article {
    public String taille;

    public Television() {
        super();
        this.taille = 10;
    }

    public Television(String M, String R, String P, String T) {
        super(M, R, P);
        this.taille = T;
    }
}
