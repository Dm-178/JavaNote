package ThreadLearn;

public class thread2 {
    public static void main(String[] args) {
        //多线程，使用匿名类进行
        Thread t0 = new Thread(){
          public void run()
          {
              for(int i=1;i<6;i++) System.out.println("Thread1: "+i);
          }
        };

        Thread t1 = new Thread(){
            public void run()
            {
                for(int i=1;i<6;i++) System.out.println("Thread2: "+i);
            }
        };

        t0.start();
        t1.start();

    }
}
