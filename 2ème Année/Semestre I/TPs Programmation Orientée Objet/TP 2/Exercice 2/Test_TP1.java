public class Test_TP1 {
    public static void main(String[] args) {
        // TP1 o = TP1();                              // Instanciation de la classe TP1
        TP1 o = new TP1();
        // o.A = 3;                                    // Initialisation de l'attribut A
        o.set_A(3);
        // System.out.println("La valeur de A :"o.A);
        System.out.println("La valeur de A: " + o.get_A() + "\n");

        o = new TP1(1, 2, 3);
        System.out.println("La valeur de A: " + o.get_A());
        System.out.println("La valeur de B: " + o.get_B());
        System.out.println("La valeur de C: " + o.get_C() + "\n");

        System.out.println(
            "Maximum des valeurs: " + TP1.Maximum(o.get_A(), o.get_B(), o.get_C())
        );
        System.out.println(
            "Minimum des valeurs: " + TP1.Minimum(o.get_A(), o.get_B(), o.get_C())
        );
    }
}
