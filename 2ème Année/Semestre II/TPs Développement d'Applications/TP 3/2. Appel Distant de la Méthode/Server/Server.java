import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.Naming;

public class Server {
    public static void main(String[] args) throws RemoteException {
        // Création de la service de nommage
        LocateRegistry.createRegistry(1099);

        // Création d'objet
        InverseInterface object = new Inverse();

        Naming.rebind("rmi://localhost:1099/myObject", object);
    }
}
