package Class0;

public class NClass2
{
    public static void main(String args)
    {
        //numPri为private,故报错。
        NClass1 nClass11=new NClass1(1,2,3,4);
        System.out.println(/*nClass11.numPri+" "+*/nClass11.numPack+" "+nClass11.numPro+" "+nClass11.numPub);
    }
}
