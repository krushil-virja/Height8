import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPReceiver {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;

        try {
            // Create a server socket that listens on port 12345
            serverSocket = new ServerSocket(12345);
            System.out.println("Waiting for connections...");

            // Accept an incoming connection
            Socket socket = serverSocket.accept();
            System.out.println("Connection established with " + socket.getInetAddress());

            // Get the input stream to read data
            InputStream inputStream = socket.getInputStream();
            byte[] buffer = new byte[1024]; // Buffer to hold incoming data
            int bytesRead = inputStream.read(buffer);

            // Convert the bytes to a string
            String message = new String(buffer, 0, bytesRead);
            System.out.println("Received message: " + message);

            // Close the socket
            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (serverSocket != null && !serverSocket.isClosed()) {
                try {
                    serverSocket.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
