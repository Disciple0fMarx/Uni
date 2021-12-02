public class Peuple {
    private Homme[] pays;
    private int nbHommes;


    public Peuple() {
        this.pays = new Homme[100];
    }

    public Peuple(Homme[] pays) {
        this();
        int i;
        for (i = 0; i < pays.length && i < 100; i ++) {
            this.pays[i] = pays[i];
            this.nbHommes ++;
        }
    }


    public void naissance(Homme h) {
        if (this.nbHommes < 100) {
            this.pays[this.nbHommes] = h;
            this.nbHommes ++;
        }
    }

    public void affiche() {
        int i;
        for (i = 0; i < this.nbHommes; i ++) {
            this.pays[i].identite();
            System.out.println();
        }
    }
}
