package ArrayLearn;

import jdk.swing.interop.SwingInterOpUtils;

public class GenObj {

    //这是一个泛型方法，可以根据不同类型的对象参数执行相对应的操作（这里是打印）
    public static <E> void PrintObj(E[] array)
    {
        for(E e:array) System.out.println(e);
        System.out.println("");
    }

    /*E:集合对象，T：java类，K,V：键和值，N：数值类型，？：未知java类型*/

    //这里使用了extend + 泛型，并且是非集合的例子
    public static <T extends Comparable<T>> T CompareFun(T a,T b)
    {
        if(a.compareTo(b)>0) return a;
        else                 return b;
    }

    public static void main(String[] args) {
        Integer[] num = {1,1,4,5,1,4,1,9,1,9};
        Character[] chars = {'a','c','t','d','g'};

        PrintObj(num);
        PrintObj(chars);

        System.out.println(CompareFun(num[0],num[2]));
        System.out.println(CompareFun(chars[0],chars[3]));
    }
}
