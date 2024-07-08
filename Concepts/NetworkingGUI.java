package Concepts;

import javax.swing.SwingUtilities;

public class NetworkingGUI extends AbstractConceptsGUI {

    public NetworkingGUI() {
        super("Networking in Java");
    }

    @Override
    protected String getTheoryText() {
        return """
               Networking in Java involves communication between devices over a network.
               
               Key Concepts:
               1. Socket Programming: TCP vs. UDP
               2. Server-Client Model
               3. InetAddress and Ports
               4. URL and URLConnection
               
               Example of Socket Programming:
               // Server side
               ServerSocket serverSocket = new ServerSocket(5000);
               Socket socket = serverSocket.accept();
               
               // Client side
               Socket socket = new Socket("localhost", 5000);
               """;
    }

    @Override
    protected String getExampleCode() {
        return """
               import java.net.*;

               public class Main {
                   // Example of Socket Programming in Java
                   public static void main(String[] args) {
                       try {
                           // Server side
                           ServerSocket serverSocket = new ServerSocket(5000);
                           Socket socket = serverSocket.accept();

                           // Client side
                           Socket clientSocket = new Socket("localhost", 5000);
                       } catch (Exception e) {
                           e.printStackTrace();
                       }
                   }
               }
               """;
    }

    @Override
    protected void addQuizQuestions() {
        addQuizQuestion("Socket Programming in Java uses TCP for connection-oriented communication.", true);
        addQuizQuestion("In UDP, the sender sends data without waiting for acknowledgment from the receiver.", true);
        addQuizQuestion("InetAddress class is used to encapsulate both numerical IP addresses and domain names.", true);
        addQuizQuestion("URL class in Java provides low-level networking functionality.", true);
        addQuizQuestion("Client-Server model is not suitable for peer-to-peer networking.", false);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            NetworkingGUI frame = new NetworkingGUI();
            frame.setVisible(true);
        });
    }
}
