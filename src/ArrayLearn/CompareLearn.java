package ArrayLearn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class CompareLearn {
    public static void main(String[] args) {
        /*对集合进行排序时，默认的sort无法应对复杂的对象，所以需要自定义排序规则（类似cmp*/
        ArrayList<Obj> objList = new ArrayList<>();
        for(int i = 1 ; i<4 ;i++) objList.add(new Obj(4-i,i));

        for(Obj x : objList) System.out.println(x);

        //定义临时的比较方法,也可以让类实现接口（见obj
        Comparator<Obj> c =new Comparator<Obj>() {
            @Override
            public int compare(Obj o1, Obj o2) {
                if(o1.id >= o2.id) return 1;
                else              return -1;
            }
        };
        Collections.sort(objList,c);

        System.out.println("after sort by id:");
        for(Obj x : objList) System.out.println(x);

        Collections.sort(objList);//实现了接口comparable，可以直接使用sort
        System.out.println("another sort by name:");
        for(Obj x : objList) System.out.println(x);
    }
}
