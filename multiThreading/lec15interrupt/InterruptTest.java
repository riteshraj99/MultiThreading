package smartProgramming.multiThreading.lec15interrupt;

public class InterruptTest extends Thread{

    public void run()
    {
        try
        {
            for(int i =1 ; i <= 5 ; i++)
            {
                System.out.println(i + " : "+ currentThread().getName());
                Thread.sleep(1000);
            }
        }catch(Exception e)
        {
            System.out.println("Thread Interrupted: "+e);
        }
    }

    public static void main(String[] args) {

        InterruptTest t = new InterruptTest();
        t.start();
        t.interrupt();
    }
}
