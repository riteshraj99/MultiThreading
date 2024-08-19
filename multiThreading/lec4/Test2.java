package smartProgramming.multiThreading.lec4;

//Step 1 : Implement Runnable interface
public class Test2 implements Runnable {

    //Step 2 : Override the run()
    public void run()
    {
        System.out.println("Hurray Thread got executed.......");
    }

    public static void main(String[] args) {
        //Step 3 : Create object of class
        Test2 t2 = new Test2();
        //Step 4 : Create object of thread class and pass Test obj as parameter in Constructor
        Thread th = new Thread(t2);
        //Step 5 Invoke the thread
        th.start();
    }
}
