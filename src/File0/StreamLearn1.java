package File0;

import java.io.*;

public class StreamLearn1 {
    public static void main(String[] args) {
        File file1=new File("NFile");
        File file3=new File(file1,"test_reader.txt");
        File file4=new File(file1,"test_writer.txt");
        /*
        * file reader,file writer，写入读出以字符形式的流
        */
        try(FileReader fr0=new FileReader(file3); FileWriter fw0=new FileWriter(file4);) {

            char[] read0=new char[(int)file3.length()];
            fr0.read(read0);
            System.out.println(read0);

            char[] write0={'a','b','c'};
            fw0.write(write0);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
