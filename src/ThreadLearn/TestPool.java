package ThreadLearn;

public class TestPool {
    public static void main(String[] args) {
        //每一个线程的启动和结束都是比较消耗时间和占用资源的。
        //可以设计一个线程池，让有限的几个线程处于运行状态，然后将写好的其他线程使用池子的线程“代理运行”
        ThreadPool p = new ThreadPool();
        while(true)
        {
            p.add(new Runnable() {
                @Override
                public void run() {
                    System.out.println("正在执行任务");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
