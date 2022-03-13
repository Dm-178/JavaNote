package Class0;

public class NClass1
{
    /**属性初始化*/
    //对象属性初始化一般有三种方法
    int num1=0;     //在声明时就初始化

    double num2;
    {
        num2=3.14;
    }               //使用代码块初始化

    public NClass1(){}
    public NClass1(int a,int b,int c,int d)
    {
        numPri=a;
        numPack=b;
        numPro=c;
        numPub=d;
    }               //构造方法初始化

    //类属性初始化有两种方法（没了构造函数法）
    static String name0="name";

    static char tags;
    static
    {
        tags='t';
    }

    //执行顺序问题：先声明时的，然后是代码块的，最后是构造函数的
    /**修饰符*/
    //private:除了类内部，无法调用，无法继承
    private int numPri;
    //package:一般不写，默认是这个，在包内可以调用和继承
    int numPack;
    //protected:包内所有类，包外所有子类可以调用和继承
    protected int numPro;
    //public:全局都可以调用和继承
    public int numPub;

    public static void main(String[] args)
    {
        NClass1 nClass11=new NClass1(1,2,3,4);
        System.out.println(nClass11.numPri+" "+nClass11.numPack+" "+nClass11.numPro+" "+nClass11.numPub);
    }
}
