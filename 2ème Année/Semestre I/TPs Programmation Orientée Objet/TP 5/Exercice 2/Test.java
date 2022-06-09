public class Test {
    public static void main(String[] args) {
        float surf = 20.0f;
        Rectangle R = new Rectangle(2.0f, 10.0f);
        Cercle C = new Cercle(1.0f);

        R.contenantCarre(surf);
        C.contenantCarre(surf); 
    }
}
