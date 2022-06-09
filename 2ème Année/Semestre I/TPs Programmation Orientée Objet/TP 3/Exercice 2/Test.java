public class Test {
    public static void main(String[] args) {
        Employe E1 = new Employe("Abdesslem", "Klimounet", 35, 1200.0);
        Technicien T1 = new Technicien("Samir", "Soupape", 43, 1300.0, 1);

        E1.affiche();
        System.out.println(T1);

        System.out.println("\nAugmentation du salaire du E1 par 100 Dinars...");
        E1.augmentation(100.0);

        System.out.println("\nAugmentation du salaire du T1...\n");
        T1.setGrade(2);
        T1.augmentation();

        E1.affiche();
        System.out.println(T1);
        System.out.println();

        Technicien T2 = new Technicien("Isam", "Forza", 38, 1200.0, 3);
        Technicien T3 = new Technicien("Abdallah", "Guech", 53, 1500.0, 3);
        Technicien T4 = new Technicien("Abir", "Moussi", 46, 1200.0, 2);
        Technicien T5 = new Technicien("Hamdi", "El 3ou9", 27, 900.0, 1);

        Technicien[] T = {T2, T3, T4, T5};
        Equipe E = new Equipe(T);

        int i;
        Technicien maxSalaire = E.tableau[0];
        for (i = 1; i < E.tableau.length; i ++) {
            if (E.tableau[i].getSalaire() > maxSalaire.getSalaire()) maxSalaire = E.tableau[i];
        }
        System.out.println(maxSalaire);
        System.out.println();

        int maxGrade = E.tableau[0].getGrade();
        for (i = 0; i < E.tableau.length; i ++) {
            if (E.tableau[i].getGrade() > maxGrade) maxGrade = E.tableau[i].getGrade();
        }
        for (i = 0; i < E.tableau.length; i ++) {
            if (E.tableau[i].getGrade() == maxGrade) System.out.println(E.tableau[i]);
        }
    }
}
