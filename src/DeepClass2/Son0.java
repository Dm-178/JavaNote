package DeepClass2;

public class Son0 extends father0
{
    /**重写，覆盖*/
    //通过这种方式可以实现多态
    //将父类的某一个方法改变，使得子类有一个同名的独特方法
    @Override
    public void fun()
    {
        System.out.println("Son fun running...");
    }
    /**隐藏：将父类的静态方法“覆盖”*/
    public static void funS()
    {
        System.out.println("Son static fun running...");
    }
    /**super*/
    //this代表对象自己，super代表的是父类，也就是用子类对象调用父类方法or属性
    public static void main(String[] args) {
        new father0().fun();
        new Son0().fun();
        father0.funS();
        Son0.funS();
    }
}
