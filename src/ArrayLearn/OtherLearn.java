package ArrayLearn;

import java.util.HashMap;
import java.util.Map;

public class OtherLearn {
    public static void main(String[] args) {
        /*LinkedList:
        * 在链表中间和首尾都有频繁的增删，并且有循环迭代访问元素的需求
        * 和ArrayList相比，如果只在首尾增删，而且访问元素是特定的几个，则尽量用AL
        * 可以当做队列，链表使用，可克隆*/
        //add,addFirst,addLast.remove,get同理

        /*HashSet:
        * 实现了set接口
        * 不重复，无序*/
        //add,contain

        /*HashMap:散列表，键值对应
        * 不支持线程同步
        * */
        HashMap<String,String> HM0 = (HashMap<String, String>) Map.of("key1","value1");
        //put方法：放入key-value,get(key)获取value
        HM0.put("key","value");
        //使用迭代遍历时，可使用keySet和values进行特定迭代
        for(String s:HM0.values()) System.out.println(s);

    }
}
