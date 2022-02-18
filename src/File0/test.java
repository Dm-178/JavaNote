package File0;

import java.io.*;

public class test implements AutoCloseable{
    public void close()
    {

    }

    public static void main(String[] args) {
        File file1 = new File("NFile");
        File file3 = new File(file1, "test_buffer.txt");

        try(
                FileWriter fw0 = new FileWriter(file3);
                FileReader fr=new FileReader(file3);
        )
        {
            char[] out=new char[30];
            fr.read(out);
            System.out.println(out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
