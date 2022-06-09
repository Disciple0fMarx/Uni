public class Datenaissance {
    public int Jour;
    public int Mois;
    public int Annee;


    public Datenaissance(int Jour, int Mois, int Annee) {
        this.Jour = Jour;
        this.Mois = Mois;
        this.Annee = Annee;
    }


    public String toString() {
        return "La date de naissance est: " + this.Jour + "/" + this.Mois + "/" + this.Annee;
    }
}
