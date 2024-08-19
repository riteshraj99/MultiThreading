package smartProgramming.multiThreading.lec13join;

public class JoinTest extends Thread{

    public void run()
    {
        try
        {
            for(int i = 1 ; i<=5 ;i++)
            {
                System.out.println("Child Thread : "+i);
                Thread.sleep(1000);
            }
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }

    public static void main(String[] args)  {
        JoinTest t = new JoinTest();
        t.start();

        try
        {
            t.join(); // t.join() will be used inside the thread which is waiting for other thread(t) to get completed
            for(int i = 1 ; i <=5 ; i++)
            {
                System.out.println("Main Thread : "+i);
                Thread.sleep(1000);
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
