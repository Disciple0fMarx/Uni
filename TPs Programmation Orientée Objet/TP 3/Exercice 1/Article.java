public class Article {
    public String marque;
    public String reference;
    public String prix;

    public Article() {
        this.marque = "LG";
        this.reference = "LG11280";
        this.prix = "520D";
    }

    public Article(String M, String R, String P) {
        this.marque = M;
        this.reference = R;
        this.prix = P;
    }

    public String toString() {
        return this.marque + " " + this.reference + " (" + this.prix + ")";
    }
}
