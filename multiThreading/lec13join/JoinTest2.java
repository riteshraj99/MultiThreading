package smartProgramming.multiThreading.lec13join;

public class JoinTest2 extends Thread{
    static Thread mainThread;
    public void run()
    {
        try
        {
            mainThread.join(); // mainThread.join() will be used inside the thread which is waiting for other thread(mainThread) to get completed

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

        mainThread = Thread.currentThread();

        JoinTest2 t = new JoinTest2();
        t.start();

        try
        {
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
