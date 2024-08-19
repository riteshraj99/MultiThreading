package smartProgramming.multiThreading.lec8;

public class DaemonTest extends Thread{

    public void run()
    {
        if(currentThread().isDaemon())
        System.out.println("Daemon Thread Task... "+ currentThread().getName());
        else System.out.println("Child Thread... "+currentThread().getName());
    }

    public static void main(String[] args) {

        /*
        If we comment this sout lines of main method then Daemon will not do anything.
        Until or Unless Parent Thread is not performing any task , the daemon thread
        will also not perform any task
         */
        System.out.println("Main Method 1 "+currentThread().getName());

        DaemonTest t = new DaemonTest();
        t.setName("Thread1");
        t.setDaemon(true);
        t.start();
        System.out.println("Main Method 2 "+currentThread().getName());


    }
}
