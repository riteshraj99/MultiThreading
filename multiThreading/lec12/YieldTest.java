package smartProgramming.multiThreading.lec12;

public class YieldTest extends Thread{

    public void run()
    {
        Thread.yield();
        for(int i = 1 ; i <= 5 ; i++)
        {
            System.out.println(i + " - " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {

        YieldTest t = new YieldTest();
        t.start();

        //Thread.yield(); // if you want main thread to stop and provide chance to other thread for execution
        for(int i = 1 ; i <=5 ; i++)
        {
            System.out.println(i+" - "+currentThread().getName());
        }

    }
}
