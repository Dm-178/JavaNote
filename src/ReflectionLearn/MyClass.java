package ReflectionLearn;

import java.io.File;
import java.lang.reflect.Field;

public class MyClass {
    public int id;
    protected String name;
    private char type;

    public MyClass() {}
    public MyClass(int id, String name, char type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    static {
        System.out.println("class static code");
        //无论什么途径获取类对象，都会导致静态属性被初始化，而且只会执行一次
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getType() {
        return type;
    }

    public void Print(String str)
    {
        System.out.println(str);
    }

    public static void main(String[] args) {
        try {
            //三种利用反射获取类对象的方法
            Class c1 = Class.forName("ReflectionLearn.MyClass");
            Class c2 = MyClass.class;
            Class c3 = new MyClass().getClass();
            System.out.println(c1==c2);
            System.out.println(c2==c3);

            try {
                //获取成员
                Field f1 = c1.getField("id");
                //Field f2 = c1.getField("type");
                Field f3 = c1.getDeclaredField("type");
                System.out.println(f1);
                //当然，不能获取private成员
                /*该方法只能用于获取类中指定名称的 public 所修饰的成员变量，
                 *对于 protected、private 所修饰的成员变量，该方法是无法获取的（包括父类）
                */
                //System.out.println(f2);
                System.out.println(f3);
                /*
                  getField 只能获取public的，包括从父类继承来的字段。
                  getDeclaredField 可以获取本类所有的字段，包括private的，但是不能获取继承来的字段
                */
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

}
