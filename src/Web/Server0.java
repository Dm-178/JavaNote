package Web;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server0 {
    public static void main(String[] args) {
        try {
            //服务器通过server socket进行信息的接收，开放了8888端口
            ServerSocket sck0 = new ServerSocket(8888);
            //服务器收到的信息是以socket传递的，所以需要在服务器用这种对象接收，接收成功后，才会执行后面的指令
            Socket stServer = sck0.accept();
            //socket上面的信息可以通过流进行读取和写入
            System.out.println("Link successful !");

            InputStream isServer = stServer.getInputStream();
            DataInputStream disServer = new DataInputStream(isServer);
            System.out.println(disServer.readUTF());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
