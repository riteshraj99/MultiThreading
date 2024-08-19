package smartProgramming.multiThreading.lec21InterThreadCommunication.problem;

class TotalEarning extends Thread
{
    int total = 0;
    public void run()
    {
        for(int i = 1 ; i <= 10 ; i++)
        {
            total += 10;
        }

        System.out.println("Total Earning Task : "+total+ " : "+currentThread().getName());
    }
}

public class MovieBookApp {

    public static void main(String[] args) {

        TotalEarning te = new TotalEarning();
        te.start();

        System.out.println("Total Earning Main : "+te.total+ " : "+Thread.currentThread().getName());

    }
}
