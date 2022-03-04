public class GroupeEtudiants {
    public Etudiant[] List_etd;
    public int Nbetd;


    public GroupeEtudiants(int N) {
        this.List_etd = new Etudiant[N];
        this.Nbetd = 0;
    }

    
    public void Inscrire(Etudiant e) {
        this.List_etd[this.Nbetd] = e;
        this.Nbetd ++;
    }

    public Etudiant rechercher(String num) {
        int i = 0;
        Etudiant result = null;
        do {
            if (this.List_etd[i].Numcarte == num) result = this.List_etd[i];
            i ++;
        } while (result == null && i < this.Nbetd);
        return result;
    }

    public void Affiche() {
        int i;
        for (i = 0; i < this.Nbetd; i ++)
            System.out.println(this.List_etd[i]);
    }
}
