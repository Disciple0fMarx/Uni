import java.rmi.Remote;
import java.rmi.RemoteException;


public interface InverseInterface extends Remote {
    String reverseString(String str) throws RemoteException;
}
