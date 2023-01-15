class TicketCounter
{
    private int availableSeats = 3;
    public synchronized void bookTicket(String name, int num_seats)
    {
        if(availableSeats >= num_seats && num_seats>0)
        {
            System.out.println("Hi "+ name +" : "+num_seats +" Seats Booked Successfully");
            availableSeats -= num_seats;
        }
        else
            System.out.println("Hi "+name +" : "+" Seats are not available");
    }
}
class TicketBookingThread extends Thread 
{
    TicketCounter tc;
    String pname;
    int num_seats;
    public TicketBookingThread(TicketCounter tc, String pname, int num_seats)
    {
        this.tc = tc;
        this.pname = pname;
        this.num_seats = num_seats;
    }
    public void run()
    {
        tc.bookTicket(pname, num_seats);
    }
}
class TicketBooking 
{
    public static void main(String args[])
    {
        TicketCounter tc = new TicketCounter();
        TicketBookingThread t1 = new TicketBookingThread(tc, "Suriya", 2);
        TicketBookingThread t2 = new TicketBookingThread(tc, "Karthi", 2);
        t1.start();
        t2.start();
    }
}