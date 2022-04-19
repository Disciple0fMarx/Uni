import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class Serveur {
    public static void main(String[] args) {
        try {
            // Attente de connexion avec un client
            ServerSocket ss = new ServerSocket(1234);
            System.out.println("Serveur: Je suis en attente de demande de connexion sur le port " + ss.getLocalPort());
            Socket s = ss.accept();  // Acceptation de la demande de connexion du client

            // Création des flux d'entrée/sortie
            InputStream is = s.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            OutputStream os = s.getOutputStream();
            PrintWriter pw = new PrintWriter(os, true);

            // Transmission des messages
            int requeteRecue = Integer.parseInt(br.readLine());
            System.out.println("\nRequete recue avec succes! (Requete = " + requeteRecue + ")\nCalcul de double...\n");
            int reponse = requeteRecue * 2;  // Traitement
            System.out.println("Calcul de reponse termine avec succes! (Reponse = " + reponse + ")\nEnvoie de reponse en cours...\n");
            pw.println(reponse);
            System.out.println("Reponse envoyee aves succes!");
            s.close();
        } catch (IOException e) {
            System.out.println("Probleme d'entree/sortie.");
        }
    }
}
