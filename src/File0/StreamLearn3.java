package File0;

import java.io.*;

public class StreamLearn3 {
    public static void main(String[] args) {
        File nf = new File("NFile");
        File dataTest = new File(nf,"DataTest.txt");

        //数据流要使用文件流进行创建，他们可以进行格式化的输入输出
        //可以解决连续输入时的分隔符问题
        write(dataTest);
        read(dataTest);
    }

    public static void write(File nf) {
        try {
            FileOutputStream fos = new FileOutputStream(nf);

            DataOutputStream dos = new DataOutputStream(fos);
            //格式化的输入，也会有顺序
            dos.writeBoolean(true);
            dos.writeInt(114514);
            dos.writeChar('x');
            dos.writeUTF("this is a txt");
            dos.writeUTF("this is a txt");

        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void read(File nf) {
        try {
            FileInputStream fis = new FileInputStream(nf);
            DataInputStream dis = new DataInputStream(fis);

            //格式化读出,当然，两次utf输入只读出了第一次
            boolean b = dis.readBoolean();
            int num = dis.readInt();
            char c = dis.readChar();
            String str = dis.readUTF();

            System.out.println(b);
            System.out.println(num);
            System.out.println(c);
            System.out.println(str);

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
