package smartProgramming.multiThreading.lec11;

public class Test extends Thread{

    public void run()
    {
        for(int i = 1 ; i <=5 ; i++)
        {
            System.out.println(i+" - "+ currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        Test t1 = new Test();
       // t1.start();
        t1.run();

        Test t2 = new Test();
        //t2.start();
        t1.run();
    }
}
