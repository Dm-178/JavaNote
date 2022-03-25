package ThreadLearn;

import java.util.LinkedList;

public class MyStack<T> {
    LinkedList<T> values = new LinkedList<>();
    public synchronized void push(T t)
    {
        while(values.size() >=200 )
        {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notifyAll();
        values.addLast(t);
    }
    public synchronized T pull()
    {
        while(values.isEmpty())
        {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notifyAll();
        return values.removeLast();
    }
    public synchronized T peek()
    {
        return values.getLast();
    }

    public static void main(String[] args) {
        MyStack<String> stack0 = new MyStack<>();

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
