package smartProgramming.multiThreading.lec5;

// 4. Performing Multiple Task From Multiple Threads
 class MyThread1 extends Thread{
    public void run()
    {
        System.out.println("Playing Video...."+currentThread().getName());
    }
}
 class MyThread2 extends Thread{
    public void run()
    {
        System.out.println("Playing Music....."+currentThread().getName());
    }
}
class MyThread3 extends Thread{
    public void run()
    {
        System.out.println("Progress Bar....."+currentThread().getName());
    }
}
public class Case4Main {
    public static void main(String[] args) {
        MyThread1 t4a = new MyThread1();
        t4a.start();

        MyThread2 t4b = new MyThread2();
        t4b.start();

        MyThread3 t3 = new MyThread3();
        t3.start();
    }
}
