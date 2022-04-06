package Web;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8888);
            Socket socketServer = serverSocket.accept();

            ReadThread readThreadServer = new ReadThread(socketServer);
            SendThread sendThreadServer = new SendThread(socketServer);

            readThreadServer.start();
            sendThreadServer.start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
