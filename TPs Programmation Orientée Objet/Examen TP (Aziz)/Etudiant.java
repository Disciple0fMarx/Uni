public class Etudiant {
    public String Numcarte;
    public String nom;
    public String prenom;
    public Datenaissance datenaiss;
    public String grp;


    public Etudiant(String Numcarte, String nom, String prenom, Datenaissance datenaiss, String grp) {
        this.Numcarte = Numcarte;
        this.nom = nom;
        this.prenom = prenom;
        this.datenaiss = datenaiss;
        this.grp = grp;
    }


    public int age() {
        return 2021 - this.datenaiss.Annee;
    }

    public String toString() {
        return this.Numcarte + ": " + this.nom + " " + this.prenom + " / " + this.datenaiss.toString() + " / Groupe: " + this.grp;
    }
}
