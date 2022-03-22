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
    }
}
