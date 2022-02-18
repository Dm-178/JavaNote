package DeepClass3;

public abstract class InnerClass1 {
    /**内部类*/
    public abstract void fun();

    public static void main(String[] args) {
        //在创造一个对象时，将抽象方法直接实例化，实际上是创建了一个子类实例化了方法，故称为匿名类
        //"既然实现了抽象方法，那么就是一个新的类，只是这个类，没有命名。"
        InnerClass1 in0=new InnerClass1() {
            @Override
            public void fun() {
                System.out.println("匿名类成功创建");
            }
        };
        //本地类：有了名字的匿名类，是在代码块直接声明的类
        class nameInner extends InnerClass1{
            @Override
            public void fun() {}
        }
    }
}
