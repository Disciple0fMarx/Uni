// import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.Naming;

public class Server {
    public static void main(String[] args) {
        try {
            // Création de la service de nommage
            LocateRegistry.createRegistry(1099);
            System.out.println("\n[Created registry in port 1099]\n");

            // Création d'objet
            InverseInterface object = new Inverse();
            System.out.println("\n[Created instance of object]\n");

            Naming.rebind("rmi://localhost:1099/myObject", object);
            System.out.println("\n[Added object to rmiregister]\n");
        } catch (Exception e) {
            System.out.println("\n[" + e.toString() + "]\n");
        }
    }
}
