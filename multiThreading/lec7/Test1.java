package smartProgramming.multiThreading.lec7;

public class Test1 {

    public static void main(String[] args) {
        System.out.println("hello");

        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Ritesh");
        System.out.println(Thread.currentThread().getName());
        System.out.println(10/0);
    }


}
