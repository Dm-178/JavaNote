package Class1;

import Class0.NClass1;

public class NClassB0
{
    public static void main(String[] args)
    {
        //包外，而且不是子类，所以只有public有效
        NClass1 nClass11=new NClass1(1,2,3,4);
        System.out.println(/*nClass11.numPri+" "+nClass11.numPack+" "+nClass11.numPro+" "+*/nClass11.numPub);
    }
}
