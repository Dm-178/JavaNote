package ThreadLearn;

//通过接口runnable，实现了run方法。
public class thread0 implements Runnable{
    String name;
    int runTime = 0;

    public thread0(String name) {
        this.name = name;
    }

    public thread0() {}

    @Override
    public void run() {
        System.out.println(name+" will start run...");
        while(runTime < 5)
        {
            System.out.println(name + ":runTime = " + runTime);
            runTime++;
        }
    }
}
