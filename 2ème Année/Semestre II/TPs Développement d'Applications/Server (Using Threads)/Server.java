import java.io.*;
import java.net.*;


public class Server extends Thread {
    public static void main(String[] args) throws IOException {
        new Server().start();
    }

    public void run() {
        try {
            System.out.println("[Creating server socket...]");
            int nbClients = 0;
            ServerSocket ss = new ServerSocket(1234);
            while (true) {
                Socket s = ss.accept();
                nbClients ++;
                System.out.println("[" + nbClients + " client(s) connected]");
                new Conversation(s, nbClients).start();
            }
        } catch (IOException ioe) {
            System.out.println("[IOException was raised]");
        }
    }

    public class Conversation extends Thread {
        public Socket socket;
        public int numClient;

        public Conversation(Socket socket, int numClient) {
            this.socket = socket;
            this.numClient = numClient;
        }

        public void run() {
            try {
                System.out.println("[Creating input stream for client #" + numClient + "...]");
                InputStream is = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);

                System.out.println("[Creating input stream for client #" + numClient + "...]");
                OutputStream os = socket.getOutputStream();
                PrintWriter pw = new PrintWriter(os, true);

                System.out.println("[Communication start for client #" + numClient + "]");
                pw.println("Welcome, client #" + this.numClient + "!");
                pw.println("----------------------------------------");
                pw.println("Enter something:");
                String input = br.readLine();
                pw.println("----------------------------------------");
                pw.println("You've typed '" + input + "'");

                System.out.println("[Communication end for client #" + numClient + "]");
                pw.println("----------------------------------------");
                pw.println("Goodbye, client #" + this.numClient + "!");
                socket.close();
            } catch (IOException ioe) {
                System.out.println("[IOException was raised]");
            }
        }
    }
}