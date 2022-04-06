package Web;

import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket sClient = new Socket("127.0.0.1",8888);
            SendThread sendThreadClient = new SendThread(sClient);
            ReadThread readThreadClient = new ReadThread(sClient);

            sendThreadClient.start();
            readThreadClient.start();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
