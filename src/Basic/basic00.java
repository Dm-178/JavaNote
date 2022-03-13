package Basic;
/*
* 一些容易忘记的操作
* 都是很基础的
*/

import org.jetbrains.annotations.NotNull;

public class basic00
{
    //多参数输入
    public void fun00(TestClass @NotNull ...t1)
    {
        for(TestClass x : t1)
        {
            System.out.println(x.str);
        }
    }
    public static void main(String[] args)
    {
        /*使用标签直接结束外部循环*/
        loop:
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.println(i+"+"+j);
                if(i*j==8)
                    break loop;
            }
        }

        /*数组声明格式*/
        int[] a=new int[5];
    }
}
