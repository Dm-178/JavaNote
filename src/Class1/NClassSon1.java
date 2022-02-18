package Class1;

import Class0.NClass1;

public class NClassSon1 extends NClass1
{
    public NClassSon1(int a,int b,int c,int d)
    {
        super(a,b,c,d);
    }
    public static void main(String[] args) {
        //继承了也不能访问父类对象的pro
        NClass1 nClass11=new NClass1(1,2,3,4);
        System.out.println(/*nClass11.numPri+" "+nClass11.numPack+" "+nClass11.numPro+" "+*/nClass11.numPub);
        //包外子类继承了pro和pub
        NClassSon1 nClassSon11=new NClassSon1(1,2,3,4);
        System.out.println(/*nClassSon11.numPri+" "+nClassSon11.numPack+" "+*/nClassSon11.numPro+" "+nClassSon11.numPub);
    }
}
