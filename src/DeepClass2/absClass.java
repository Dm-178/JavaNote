package DeepClass2;

public abstract class absClass
{
    /**抽象*/
    //抽象类时不能实例化的
    //抽象类【可以】有抽象方法
    public abstract void funAbs();
    public void fun()
    {
        //抽象类也可以有非抽象方法
    }
    //继承抽象类，要么子类还是抽象的，要么必须实例化父类的所有抽象方法
    //也就是要么传递抽象，要么实例化抽象
}
