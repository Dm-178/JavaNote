package ThreadLearn;

public class TestThread0 {
    public static void main(String[] args) {
        thread0 t0 = new thread0("Thread1");
        thread0 t1 = new thread0("Thread2");

        //一个实现了runnable的对象可以传入线程对象中并行
        new Thread(t0).start();
        new Thread(t1).start();

        //直接调用只会顺序执行
        //t0.start();
        //t1.start();

        //各类方法
        /*
        * 线程暂停：sleep()
        * 加入主线程：join()                   主线程会等待该线程结束完毕， 才会往下运行。
        * 设置优先级：    t1.setPriority(Thread.MAX_PRIORITY);
        * 临时暂停：yield()
        * 设置守护线程：  t1.setDaemon(true);  当一个进程里，所有的线程都是守护线程的时候，结束当前进程。
        * */
    }
}
