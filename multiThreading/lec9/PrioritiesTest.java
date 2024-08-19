package smartProgramming.multiThreading.lec9;

import org.springframework.security.access.method.P;

public class PrioritiesTest extends Thread{

    public void run()
    {
        System.out.println("Thread Task....... "+currentThread().getName());
        System.out.println("Thread Priority : "+currentThread().getPriority() + " of :"+currentThread().getName());
    }
    public static void main(String[] args) {

        System.out.println("Main Thread Priority : "+currentThread().getPriority());

        PrioritiesTest t2 = new PrioritiesTest();
        t2.setPriority(7);
        t2.start();

        PrioritiesTest t = new PrioritiesTest();
        t.setPriority(MAX_PRIORITY);
        t.start();


    }
}
