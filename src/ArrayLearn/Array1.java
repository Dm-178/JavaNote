package ArrayLearn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Array1 {
    public static void main(String[] args) {
        List<ClassA> La = new ArrayList<>();
        for(int i = 0 ; i < 5 ; i++) La.add(new ClassA("obj"+i));

        //遍历方法：for循环，增强for循环，迭代器
        Iterator<ClassA> itA = La.iterator();
        while(itA.hasNext())
        {
            System.out.println(itA.next().name); //读取的同时直接移动
        }


    }
}
