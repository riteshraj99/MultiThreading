package smartProgramming.multiThreading.lec21InterThreadCommunication.solution;

class TotalEarning extends Thread
{
    int total = 0;
    public void run()
    {
        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                total += 10;
            }
            this.notify();
        }

        System.out.println("Total Earning Task : "+total+ " : "+currentThread().getName());
    }
}

public class MovieBookApp {

    public static void main(String[] args) {

        TotalEarning te = new TotalEarning();
        te.start();

        System.out.println("1. Total Earning Main : "+te.total+ " : "+Thread.currentThread().getName());
        try {
            synchronized (te) {
                te.wait();
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("2. Total Earning Main : "+te.total+ " : "+Thread.currentThread().getName());

    }
}
