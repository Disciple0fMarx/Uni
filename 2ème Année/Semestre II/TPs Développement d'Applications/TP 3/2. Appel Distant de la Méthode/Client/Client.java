import java.rmi.RemoteException;
import java.rmi.Naming;


public class Client {
    public static void main(String[] args) throws RemoteException {
        InverseInterface object = (InverseInterface) Naming.lookup("rmi://localhost:1099/myObject");

        System.out.println(object.reverseString("Salut"));
    }
}
