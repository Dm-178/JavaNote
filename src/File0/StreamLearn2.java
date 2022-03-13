package File0;

import java.io.*;

public class StreamLearn2 {
    public static void main(String[] args) {
        File file1 = new File("NFile");
        File file3 = new File(file1, "test_buffer.txt");
        try {
             FileWriter fw0 = new FileWriter(file3);
             //BufferedReader bfr0 = new BufferedReader(fr0);
             //PrintStream prs0 = new PrintStream(String.valueOf(fw0))
            /*char[] out=new char[(int)30];
            fr0.read(out);
            System.out.println(out);
            /*while(true)
            {
                String str=bfr0.readLine();
                if(str==null) break;
                System.out.println(str);
            }*/

            //flush : 立刻将 PrintStream中的字符写入硬盘
        }catch (IOException e) {
            e.printStackTrace();
        }
}
}
