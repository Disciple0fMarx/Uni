import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.UnknownHostException;
import java.net.Socket;


public class Client {
    public static void main(String args[]) {
        try {
            // Envoie d'une demande de connexion à un serveur
            Socket s = new Socket("localhost", 1234);
            System.out.println("J'ai envoyé une demande de connexion à partir du port " + s.getLocalPort());

            // Création des flux d'entrée/sortie
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();

            // Transmission des messages
            int requete = 12;
            os.write(requete);
            int reponseRecue = (int)is.read();
            s.close();
        } catch (UnknownHostException e) {
            System.out.println("Serveur inconnu.");
        } catch (IOException e) {
            System.out.println("Problème d'entrée/sortie.");
        }
    }
}
