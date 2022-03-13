package File0.ObjectStream;

import java.io.*;

public class testOStream {
    public static void main(String[] args) {
        //对象流，一种可以将对象以流的形式传输到硬盘上
        File f= new File("oTest.txt");
        Class0 cl0 = new Class0(99,"name0");
        try
        {
            //对象流要在文件流的基础上创建
            FileOutputStream fos = new FileOutputStream(f);
            FileInputStream fis = new FileInputStream(f);
            //对象输入输出流
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            ObjectInputStream ois = new ObjectInputStream(fis);

            oos.writeObject(cl0);
            Class0 cl1 = (Class0) ois.readObject();

            System.out.println(cl1.num + cl1.name);
        }catch (IOException | ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
