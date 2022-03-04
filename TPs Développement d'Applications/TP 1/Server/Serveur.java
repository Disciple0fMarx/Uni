import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Serveur {
    public static void main(String args[]) {
        try {
            // Attente de connexion avec un client
            ServerSocket ss = new ServerSocket(1234);
            System.out.println("Serveur: Je suis en attente de demande de connexion sur le port " + ss.getLocalPort());
            Socket s = ss.accept();  // Acceptation de la demande de connexion du client

            // Création des flux d'entrée/sortie
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();

            // Transmission des messages
            int requeteRecue = (int)is.read();
            int reponse = requeteRecue * 2;  // Traitement
            os.write(reponse);
            s.close();
        } catch (IOException e) {
            System.out.println("Problème d'entrée/sortie.");
        }
    }
}
