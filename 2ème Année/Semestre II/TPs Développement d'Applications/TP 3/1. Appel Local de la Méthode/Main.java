public class Main {
    public static void main(String[] args) {
        InverseInterface object = new Inverse();
        System.out.println(object.reverseString(args[0]));
    }
}
