package Class0;

public class NClass
{
    int num;
    /**静态方法，静态属性*/
    //在main中使用 类名.静态方法（属性）来进行调用,它代表了这个类和它的对象的共有属性
    static String className;
    static void sayClassName()
    {
        System.out.println(className);
        //静态方法属于一个类的也是所有对象的方法，不能调用某个对象的特有属性
        //System.out.println(this.num); //错误的
    }
    /**构造方法*/
    //在实例化对象时会触发的方法
    //隐式构造方法，不写就有
    //public NClass() {}
    //但是如果自定义了其他构造方法，如果还想用隐式，就需要自己定义
    /*一旦提供了一个有参的构造方法
    同时又没有显式的提供一个无参的构造方法
    那么默认的无参的构造方法，就“木有了“*/
    public NClass(int x)
    {
        System.out.println("num="+x);
    }

    /**this的使用*/
    //通过this可以指代自己
    //this可以调用其他的构造方法
    public NClass(String str)
    {
        //调用了 NClass(int x) 这个方法
        this(5);
    }
    /**方法重载*/
    //方法的重载：一个方法名在不同传参格式可以分别有自己的运行逻辑
    public void fun()
    {
        System.out.println("fun run");
    }
    public void fun(int num)
    {
        System.out.println("fun run,num="+num);
    }
    public void fun(String str)
    {
        System.out.println("fun run,string="+str);
    }
    /*fun()的三个重载，也可以进行不定参数输入，用“...”*/
    public static void main(String[] args)
    {
        //无参构造方法失效了，所以下面这条是错误的
        //NClass nClass0=new NClass();
        NClass nClass1=new NClass(5);
    }
}
