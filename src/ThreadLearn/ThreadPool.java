package ThreadLearn;

import java.util.LinkedList;

public class ThreadPool {
    LinkedList<Runnable> taskspool = new LinkedList<>();
    int poolSize;

    public ThreadPool()
    {
        poolSize = 10;
        synchronized (taskspool)
        {
            for(int i=0;i<poolSize;i++)
            {
                new taskThread("任务消费者线程 "+i).start();
            }
        }
    }

    public void add(Runnable r)
    {
        synchronized (taskspool)
        {
            taskspool.add(r);
            taskspool.notifyAll();
        }
    }

    //让线程最初都处于wait状态，当有线程想启动时，直接
    class taskThread extends Thread{
        public taskThread(String name)
        {
            super(name);
        }
        Runnable task;
        public void run()
        {
            while(true){
                synchronized (taskspool)
                {
                    while(taskspool.isEmpty())
                    {
                        try {
                            taskspool.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    task = taskspool.removeLast();
                    taskspool.notify();
                }
                System.out.println(this.getName() + "获取任务成功...");
                task.run();
            }
        }
    }
}
