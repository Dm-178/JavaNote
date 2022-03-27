package ReflectionLearn;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Learn1 {
    public static void main(String[] args) {
        //传统的构造对象方法
        MyClass myClass0 = new MyClass(5,"name1",'0');
        //利用反射构造
        try{
            Class c1 = Class.forName("ReflectionLearn.MyClass");
            Constructor con1 = c1.getConstructor();
            MyClass myClass1 = (MyClass) con1.newInstance();
        }catch (Exception e) {
            e.printStackTrace();
        }
        //利用反射修改对象的属性值
        try {
            Field f0 = myClass0.getClass().getDeclaredField("id");

            System.out.println(myClass0.id);
            f0.set(myClass0,50);
            System.out.println(myClass0.id);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
