package Web;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ReadThread extends Thread{
    private Socket s;
    public ReadThread(Socket _s){
        s = _s;
    }
    @Override
    public void run()
    {
        InputStream is = null;
        try {
            is = s.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            while(true)
            {
                System.out.println(dis.readUTF());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
