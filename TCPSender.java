import java.io.OutputStream;
import java.net.Socket;

public class TCPSender {
    public static void main(String[] args) {
        Socket socket = null;
        OutputStream outputStream = null;

        try {
            // Define the server address and port
            String serverAddress = "localhost";
            int port = 12345;

            // Create a TCP socket and connect to the server
            socket = new Socket(serverAddress, port);
            outputStream = socket.getOutputStream();

            // Prepare the message
            String message = "This is the message.";
            byte[] buffer = message.getBytes();

            // Send the message
            outputStream.write(buffer);
            System.out.println("Sent message to " + serverAddress + ":" + port);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (outputStream != null) outputStream.close();
                if (socket != null) socket.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
