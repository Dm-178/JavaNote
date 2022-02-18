package DeepClass2;

public class InterfaceTest extends father0 implements IntTest
{
    public void funInt()
    {
        //只有实例化了继承接口的类，才能正常
    }
    //类可以继承多个接口，但不能继承多个其他类
    /**转型_待补充*/
    /*对于子类与父类，向上转型是可以的，向下是不可以的*/
    public static void main(String[] args)
    {
        //子类转父类——可
        InterfaceTest interfaceTest0=new InterfaceTest();
        father0 father00=(father0) interfaceTest0;
        //父类转子类——不可
        father0 father01=new father0();
        InterfaceTest interfaceTest1=(InterfaceTest) father01;

    }
}
