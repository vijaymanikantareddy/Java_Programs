class ThreadGM extends Thread
{
    public void run()
    {
        while(true)
        {
            System.out.println("Good Morning");
            try 
            {
                Thread.sleep(2000);
            }
            catch(InterruptedException ie)
            {}
        }
    }
}
class ThreadHel extends Thread
{
    public void run()
    {
        while(true)
        {
            System.out.println("Hello");
            try 
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException ie)
            {}
        }
    }
}
class ThreadWel extends Thread
{
    public void run()
    {
        while(true)
        {
            System.out.println("Welcome");
            try 
            {
                Thread.sleep(3000);
            }
            catch(InterruptedException ie)
            {}
        }
    }
}
class ThreadExp
{
    public static void main(String args[])
    {
        ThreadGM t1 = new ThreadGM();
        ThreadHel t2 = new ThreadHel();
        ThreadWel t3 = new ThreadWel();
        t1.start();
        t2.start();
        t3.start();
    }
}
