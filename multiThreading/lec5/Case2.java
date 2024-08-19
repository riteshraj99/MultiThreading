package smartProgramming.multiThreading.lec5;

// 2. Performing Single Task From Multiple Threads

public class Case2 extends Thread{

    public void run()
    {
        System.out.println("Case2 Task......"+ Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Case2 t1 = new Case2();
        t1.start();

        Case2 t2 = new Case2();
        t2.start();
    }
}
