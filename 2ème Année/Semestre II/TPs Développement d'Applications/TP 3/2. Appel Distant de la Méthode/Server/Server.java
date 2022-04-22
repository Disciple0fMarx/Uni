public class Server {
    public static void main(String[] args) {
        InverseInterface object = new Inverse();
        System.out.println(object.reverseString("Salut"));
    }
}
