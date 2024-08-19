package smartProgramming.multiThreading.lec20StaticSynchronizationProblemAndSol.problem;

class BookTheatreSeat
{
    int totalSeat = 20;
    synchronized void bookSeat(int seats)
    {
        if(totalSeat >= seats)
        {
            System.out.println(seats + " seats booked successfully.."+Thread.currentThread().getName());
            totalSeat -= seats;
            System.out.println("Seats left :) "+totalSeat + " "+Thread.currentThread().getName());
        }else{
            System.out.println(seats+" Sorry not able to book seats "+Thread.currentThread().getName());
            System.out.println("Seats left :( "+totalSeat+ " "+Thread.currentThread().getName());
        }
    }
}

class MyThread1 extends Thread{
    BookTheatreSeat b;
    int seats;
    MyThread1(BookTheatreSeat b , int seats)
    {
        this.b = b;
        this.seats = seats;
    }
    public void run()
    {
        b.bookSeat(seats);
    }

}

class MyThread2 extends Thread
{
    BookTheatreSeat b;
    int seats;
    MyThread2(BookTheatreSeat b, int seats)
    {
        this.b = b;
        this.seats = seats;
    }

    public void run()
    {
        b.bookSeat(seats);
    }
}

public class MovieBookApp {

    public static void main(String[] args) {

        BookTheatreSeat b1 = new BookTheatreSeat();

        MyThread1 t1 = new MyThread1(b1,7);
        t1.start();

        MyThread2 t2 = new MyThread2(b1,6);
        t2.start();

//--------

        BookTheatreSeat b2 = new BookTheatreSeat();

        MyThread1 t3 = new MyThread1(b2,5);
        t3.start();

        MyThread2 t4 = new MyThread2(b2,9);
        t4.start();

    }
}
/*
7 seats booked successfully..Thread-0
Seats left :) 13 Thread-0
6 seats booked successfully..Thread-1
Seats left :) 7 Thread-1
5 seats booked successfully..Thread-2
Seats left :) 15 Thread-2
9 seats booked successfully..Thread-3
Seats left :) 6 Thread-3

 */