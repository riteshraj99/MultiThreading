package smartProgramming.multiThreading.lec13join;

class Medical extends Thread{

    public void run()
    {
        try {
            System.out.println("Medical Started....");
            Thread.sleep(3000);
            System.out.println("Medical Completed....");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class TestDrive extends Thread
{
    public void run()
    {
        try
        {
            System.out.println("TestDrive Started....");
            Thread.sleep(5000);
            System.out.println("TestDrive Completed...");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}

class OfficerSign extends  Thread
{
    public void run()
    {
        try
        {
            System.out.println("Officer Sign Started...");
            Thread.sleep(1000);
            System.out.println("Officer Sign Completed...");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}

public class LicenseDemo {

    public static void main(String[] args) {
        try {
            Medical medical = new Medical();
            medical.start();

            medical.join();

            TestDrive testDrive = new TestDrive();
            testDrive.start();

            testDrive.join();

            OfficerSign officerSign = new OfficerSign();
            officerSign.start();

            officerSign.join();

            System.out.println("Your License Demo Completed..");


        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}
