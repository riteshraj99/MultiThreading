package smartProgramming.multiThreading.lec5;

// 1. Performing Single Task From Single Thread
public class Case1 extends Thread{

    public void run()
    {
        System.out.println("Case1 Task....");
    }
    public static void main(String[] args) {

        Case1 t1 = new Case1();
        t1.start();

    }
}
