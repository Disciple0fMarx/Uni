import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Serveur {
	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(1234);
			System.out.println("Waiting for client to connect...");
			
			Socket s = ss.accept();
			System.out.println("Client connected successfully!");
			
			Etudiant e1 = new Etudiant("Hamdi", 23);
			
			InputStream is = s.getInputStream();
			
			OutputStream os = s.getOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(os);
		
			oos.writeObject(e1);
		} catch (IOException e) { e.getStackTrace(); } 
	}
}
