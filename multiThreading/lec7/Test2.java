package smartProgramming.multiThreading.lec7;

public class Test2 extends Thread{

    public void run()
    {
        System.out.println("Test2 task.... "+ currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Hello --- "+Thread.currentThread().getName());

        Test2 t1 = new Test2();
        t1.setName("Ritesh");
        t1.start();

        Test2 t2 = new Test2();
        t2.setName("Kumar");
        t2.start();
    }
}
