package smartProgramming.multiThreading.lec4;
//Step 1 : extend thread class
public class Test1 extends  Thread {
    //Step 2 : override run method
    public void run()
    {
        System.out.println("Hurray thread Executing.....");
    }

    public void start( )
    {
        System.out.println("Hello....");
    }

    public static void main(String[] args) {
        //Step 3 :create an object the class
        Test1 t = new Test1();
        //Step 4 : invoke the thread
        t.start();

        //If we try to again do t.start() it will show IllegalStateException
       // t.start();
    }
}
