public class Inverse implements InverseInterface {
    public String reverseString(String str) {
        int len = str.length();
        StringBuffer sb = new StringBuffer(len);

        for (int i = len - 1; i >= 0; i --) sb.append(str.substring(i, i + 1));
        
        return sb.toString();
    }


    public void secretMethod() {
        System.out.println("Ceci est une methode qui doit etre invisible au client.");
    }
}
