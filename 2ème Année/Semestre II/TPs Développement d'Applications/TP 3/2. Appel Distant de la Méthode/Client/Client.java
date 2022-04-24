import java.rmi.RemoteException;
// import java.rmi.RMISecurityManager;
import java.rmi.Naming;


public class Client {
    public static void main(String[] args) throws RemoteException {
        try {
            // System.setSecurityManager(new RMISecurityManager());

            InverseInterface object = (InverseInterface) Naming.lookup("rmi://localhost/myObject");

            System.out.println(object.reverseString("Salut"));
        } catch (Exception e) {
            System.out.println("\n[" + e.toString() + "]\n");
        }
    }
}
