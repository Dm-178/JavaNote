package ThreadLearn;

class test{
    public int  num;
}

public class thread3{
    public static void main(String[] args) {

        test x = new test();
        x.num=10;
        //使用synchronized，可以避免脏数据出现，只有参数内的对象处于未被占有的状态，才能进行操作
        //此时是线程安全的
        Thread t1 = new Thread(){
            public void run()
            {
                synchronized (x)
                {
                    if(x.num>0)
                    {
                        x.num--;
                        System.out.println("Now,x will down" + x.num);
                    }

                }
            }
        };
        Thread t2 = new Thread(){
            public void run()
            {
                synchronized (x)
                {
                    x.num--;
                    System.out.println("Now,x will up" + x.num);
                }
            }
        };
        t1.start();
        t2.start();
        //也可以在定义方法时直接加入synchronized，让这个方法变成线程安全的方法
        //一个类的所有方法都是线程安全的，那么这个类时线程安全的
    }
    public synchronized void fun()
    {

    }
}
