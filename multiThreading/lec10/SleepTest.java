package smartProgramming.multiThreading.lec10;

class MyThread extends Thread
{
    public void run()
    {
        System.out.print("Example 2 : ");
        for(int i = 1 ; i <=5 ; i++)
        {
           try
           {
               Thread.sleep(2000);
               System.out.print(i+ " ");
           }catch(Exception e)
           {
               e.printStackTrace();
           }
        }
    }
}

public class SleepTest {

    public static void main(String[] args) {
        //Example 1:
        System.out.print("Example 1 : ");
        for(int i = 1; i <=5 ; i++ )
        {
            try
            {
                Thread.sleep(2000);
                System.out.print(i+ " ");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();

        MyThread t = new MyThread();
        t.start();
    }
}
