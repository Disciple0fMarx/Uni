import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.UnknownHostException;
import java.net.Socket;
import java.util.Scanner;


public class Client {
    public static void main(String[] args) {
        try {
            // Envoie d'une demande de connexion à un serveur
            Socket s = new Socket("localhost", 1234);
            System.out.println("Client: J'ai envoye une demande de connexion a partir du port " + s.getLocalPort());

            // Création des flux d'entrée/sortie
            InputStream is = s.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            OutputStream os = s.getOutputStream();
            PrintWriter pw = new PrintWriter(os, true);

            // Transmission des messages
            System.out.print("\nDonnez un entier: ");
            int requete = new Scanner(System.in).nextInt();
            System.out.println("Envoie de requete en cours...\n");
            pw.println(requete);
            System.out.println("Requete envoyee aves succes! Attente de reponse...\n");
            int reponseRecue = Integer.parseInt(br.readLine());
            System.out.println("Reponse recue avec succes!");
            System.out.println("Le double de " + requete + " est " + reponseRecue);
            s.close();
        } catch (UnknownHostException e) {
            System.out.println("Serveur inconnu.");
        } catch (IOException e) {
            System.out.println("Probleme d'entree/sortie.");
        }
    }
}
