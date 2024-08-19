package smartProgramming.multiThreading.lec17SynchronizationProblem;

class BookTheatreSeat
{
    int total_seats = 10;

    void bookSeat(int seats)
    {
        if(total_seats >= seats)
        {
            System.out.println(seats + " Seats Booked Successfully.. :) "+Thread.currentThread().getName());
            total_seats = total_seats - seats;
            System.out.println("Seats Left :) "+total_seats + " "+Thread.currentThread().getName());
        }else {
            System.out.println("Seats cannot be booked... :( "+Thread.currentThread().getName());
            System.out.println("Seats left :( - "+total_seats+ " "+Thread.currentThread().getName());
        }

    }
}


public class MovieBookApp extends Thread{
    static BookTheatreSeat b;
    int seats;
    public void run()
    {
        b.bookSeat(seats);
    }

    public static void main(String[] args) {

        b = new BookTheatreSeat();

        MovieBookApp deepak = new MovieBookApp();
        deepak.seats = 7;
        deepak.start();

        MovieBookApp amit = new MovieBookApp();
        amit.seats = 6;
        amit.start();
    }
}
