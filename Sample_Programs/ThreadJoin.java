class Threadeg extends Thread
{
    public void run()
    {
        for(int i=0 ; i<10 ; i++)
            System.out.println("Thalapathy");
    }
}
class ThreadJoin
{
    public static void main(String args[]) throws InterruptedException
    {
        Threadeg t1 = new Threadeg();
        t1.start();
        t1.join();
        for(int i=0 ; i<10 ; i++)
            System.out.println("Thala");
    }
}