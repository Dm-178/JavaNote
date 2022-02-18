package File0;

import java.io.File;

public class fileOIBasic {
    public static void main(String[] args) {
        /*file对象，打开文件的对象*/
        //多种方法：绝对路径，当前项目的文件，以某个文件对象为目录的文件
        File file0=new File("F:/Test/test0.txt");
        File file1=new File("NFile");
        File file2=new File("text0.txt");
        File file3=new File(file1,"test1.txt");
        /*
        System.out.println(file0.getAbsoluteFile());
        System.out.println(file1.getAbsoluteFile());
        System.out.println(file3.getAbsoluteFile());
        */

    }
}
