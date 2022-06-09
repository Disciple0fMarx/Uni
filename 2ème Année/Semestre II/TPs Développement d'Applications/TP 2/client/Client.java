import java.io.IOException;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

import java.net.UnknownHostException;
import java.net.Socket;

import java.util.Scanner;

import tp2.Etudiant;


public class Client {
    public static void main(String[] args) {
        try {
            // Envoie d'une demande de connexion à un serveur
            Socket s = new Socket("localhost", 1234);
            System.out.println("[Connected via port " + s.getLocalPort() + "]");

            // Création des flux d'entrée/sortie
            InputStream is = s.getInputStream();
            ObjectInputStream ois = new ObjectInputStream(is);

            OutputStream os = s.getOutputStream();
            PrintWriter pw = new PrintWriter(os, true);

            Object o1 = ois.readObject();

            if (o1 instanceof Etudiant) {
                Etudiant e1 = (Etudiant) o1;
                System.out.println(e1);
            } else {
                System.out.println("Serialization error.");
            }

            s.close();
        } catch (UnknownHostException e) {
            System.out.println("Unknown host.");
        } catch (IOException e) {
            System.out.println("I/O Exception.");
        }
    }
}
