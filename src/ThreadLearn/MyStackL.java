package ThreadLearn;

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyStackL<T> {
    LinkedList<T> value=new LinkedList<>();
    Lock l = new ReentrantLock();
    Condition c = l.newCondition();

    public void push(T t)
    {
        l.lock();
        while(value.size() >=20 )
        {
            try {
                c.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        value.push(t);
        l.unlock();
    }

    public T pull()
    {
        l.lock();
        while(value.isEmpty())
        {
            try {
                c.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        l.unlock();
        return value.removeLast();
    }


    public static void main(String[] args) {
        MyStackL<String> stack0 = new MyStackL<>();

        for(int i=0;i<3;i++)
        {
            int finalI = i;
            new Thread(){
                public void run()
                {
                    while(true)
                    {
                        String str="string put by ProductThread " + finalI;
                        stack0.push(str);
                        System.out.println("Thread " + finalI +" put a string");
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }.start();
        }

        for(int i=0;i<2;i++)
        {
            int finalI = i;
            new Thread(){
                public void run()
                {
                    while(true)
                    {
                        String str="string pull by ProductThread " + finalI;
                        System.out.println(str + " : " + stack0.pull());
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }.start();
        }
    }

}
