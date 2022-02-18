package File0;

import java.io.*;

public class StreamLearn
{
    public static void main(String[] args) {
        File file1=new File("NFile");
        File file3=new File(file1,"test1.txt");
        File file4=new File(file1,"test2.txt");

        /*FileInputStream:文件输入流（对于程序来说）
        * FileOutputStream:文件输出流
        *
        * 关闭流的方式：
        * 1.在try内直接关闭（有风险但是简单，如下）
        * 2.在try外声明流，在finally内关闭流（关闭时判断是否为null
        * 3.在try()内关闭，会在try块结束后直接关闭
        * //这种编写代码的方式叫做 try-with-resources， 这是从JDK7开始支持的技术
        * //所有的流，都实现了一个接口叫做 AutoCloseable，任何类实现了这个接口，都可以在try()中进行实例化。
        * //并且在try, catch, finally结束的时候自动关闭，回收相关资源。
        * */
        try {
            FileInputStream fileInputStream0=new FileInputStream(file3);
            FileOutputStream fileOutputStream0=new FileOutputStream(file4);
            //input stream的使用，将文件内容读入程序，使用完流要关闭
            byte[] strin =new byte[(int)(file3.length())];
            fileInputStream0.read(strin);
            /**/
            for(byte e:strin)
            {
                System.out.println(e);
            }
            /**/
            fileInputStream0.close();

            //output stream的使用，将byte写入文件
            byte[] strout={99,100,101};
            fileOutputStream0.write(strout);
            fileOutputStream0.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
