public class Test_Etudiant {
    public static void main(String[] args) {
        Datenaissance D = new Datenaissance(10, 8, 2001);

        System.out.println("Creation d'objet Dhya...");
        Etudiant Dhya = new Etudiant("69", "Dhya Eddine", "El Bahri", D, "LISI-A2-02");
        System.out.println(Dhya);

        System.out.println("\nCreation d'objet Mehrez...");
        EtudiantTerminal Mehrez = new EtudiantTerminal("420", "Mehrez", "Symbol", new Datenaissance(7, 11, 1998), "MR-Ecologie", "Guerre de l'emeu");
        System.out.println(Mehrez);
        
        System.out.println("\nCreation du groupe...");
        GroupeEtudiants G = new GroupeEtudiants(2);

        System.out.println("\nInscrit des etudiants Dhya et Mehrez...");
        G.Inscrire(Dhya);
        G.Inscrire(Mehrez);

        System.out.println("\nAffichage du groupe:");
        G.Affiche();

        System.out.println("\nRecherche d'etudiant ayant le Numcarte '69'...");
        System.out.println(G.rechercher("69"));

        System.out.println("\nRecherche d'etudiant ayant le Numcarte '1337'...");
        System.out.println(G.rechercher("1337"));
    }
}
