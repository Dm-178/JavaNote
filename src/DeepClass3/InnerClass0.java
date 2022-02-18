package DeepClass3;

public class InnerClass0 {
    int num;
    /**内部类*/
    //非静态内部类,需要外部类的实例才能实例化
    class InnerClass{
        int inner_int;
        InnerClass()
        {}
        public void fun()
        {
            num=100;
        }
    }
    //静态内部类，不需要外部实例
    static class innerStatic{
        //和非静态不同，静态内部类不能访问外部类的属性和方法
        public void fun()
        {
            System.out.println("111");
        }
    }

    public static void main(String[] args) {
        //非静态内部类的使用
        InnerClass0 innerClass01=new InnerClass0();
        InnerClass x=innerClass01.new InnerClass();
        x.inner_int=114514;
        //静态内部类的使用
        InnerClass0.innerStatic aStatic=new innerStatic();
        aStatic.fun();

    }
}
