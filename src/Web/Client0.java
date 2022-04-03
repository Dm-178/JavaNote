package Web;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client0 {
    public static void main(String[] args) {
        try {
            //客户端发送消息，使用socket对象，它定义了要发送的ip，和端口
            Socket skClient = new Socket("127.0.0.1",8888);
            System.out.println("client link...");

            OutputStream osClient = skClient.getOutputStream();
            DataOutputStream dosClient = new DataOutputStream(osClient);
            dosClient.writeUTF("hello i am client !");

            skClient.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
