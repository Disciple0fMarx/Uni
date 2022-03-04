public class EtudiantTerminal extends Etudiant {
    public String SujetPFE;


    public EtudiantTerminal(String Numcarte, String nom, String prenom, Datenaissance datenaiss, String grp, String SujetPFE) {
        super(Numcarte, nom, prenom, datenaiss, grp);
        this.SujetPFE = SujetPFE;
    }


    public String toString() {
        return super.toString() + " / Sujet PFE: " + this.SujetPFE;
    }
}
