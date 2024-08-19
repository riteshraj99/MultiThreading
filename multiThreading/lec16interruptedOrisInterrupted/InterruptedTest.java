package smartProgramming.multiThreading.lec16interruptedOrisInterrupted;

public class InterruptedTest extends Thread{
    public void run()
    {
        try
        {
            System.out.println(Thread.interrupted());
            for(int i = 1 ; i <=5 ; i++)
            {
                System.out.println(i + " : "+ currentThread().getName());
                Thread.sleep(1000);

            }
            System.out.println(Thread.interrupted());
        }catch(Exception e)
        {
            System.out.println("Thread Interrupted Exception : "+e);
        }
    }

    public static void main(String[] args) {

        InterruptedTest t = new InterruptedTest();
        t.start();
        t.interrupt();
    }
}
