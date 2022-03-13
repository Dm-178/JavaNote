package ArrayLearn;

import java.util.ArrayList;

public class Array0 {
    public static void main(String[] args) {
        //声明array
        ArrayList<Integer> list0 = new ArrayList<>();
        //add:添加元素,两种使用方法
        for(int i = 0 ;i<5; i++)  {list0.add(i);}
        list0.add(2,999);
        //判断存在性,判断不是表面判断
        System.out.println("the 3 in list0 :"+list0.contains(3));
        //get:获取固定位置的元素,按照下标获取
        System.out.println("get every num from list0:");
        for(int i = 0;i<6;i++)
        {
            System.out.print(list0.get(i)+" ");
        }
        //indexOf:返回特定目标在表中的索引值
        System.out.println("\nfind 999");
        System.out.println(list0.indexOf(999));
        //remove:根据下标或对象名删除
        //size:获取大小
        //set:将指定下标换成另一个对象
        System.out.println("the list0[2]:");
        System.out.println(list0.get(2));
        list0.set(2,114514);
        System.out.println(list0.get(2));
        //toArray:传入一个相应数组，将arraylist转换为数组
        //clear:清空
        //addAll：加起来
        list0.addAll(list0);
        for(int x : list0) System.out.print(x+" ");
    }
}
