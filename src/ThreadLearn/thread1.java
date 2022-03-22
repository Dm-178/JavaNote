package ThreadLearn;

public class thread1 extends Thread{
    private Thread t;
    public String threadName;

    thread1(String str)
    {
        threadName = str;
    }

    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println(threadName + " : " + i);
        }
    }

    public void start()
    {
        if(t==null){
            t = new Thread(this,threadName);
        }
        System.out.println(threadName + " start...");
        t.start();
    }

    public static void main(String[] args) {
        thread1 t0 = new thread1("Thread1");
        thread1 t1 = new thread1("Thread2");

        t0.start();
        t1.start();
    }

}
