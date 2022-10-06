import java.io.*;
class Buffer
{
    String data;
    boolean avail = false;
    public synchronized void put(String data)
    {
        while(avail==true)
        {
            try{
                wait();
            }
            catch(InterruptedException ie)
            {System.out.println(ie);}
        }
        this.data = data;
        System.out.println("Produced : "+data);
        avail = true;
        notify();
    }
    public synchronized String get()
    {
        while(avail==false)
        {
            try
            {
                wait();
            }
            catch(Exception e)
            {System.out.println(e);}
        }
        avail = false;
        notify();
        return data;
    }
}
class Producer extends Thread
{
    String data;
    BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
    Buffer buf;
    public Producer(Buffer buf)
    {
        super("Producer");
        this.buf = buf;
        start();
    }
    public void run()
    {
        try
        {
            while(true)
            {
                System.out.println("Enter data ");
                data = b.readLine();
                buf.put(data);
                Thread.sleep(500);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class Consumer extends Thread
{
    Buffer buf;
    public Consumer(Buffer buf)
    {
        super("Consumer");
        this.buf = buf;
        start();
    }
    public void run()
    {
        try{
            while(true)
            {
                System.out.println("Consumed : "+buf.get());
                Thread.sleep(500);
            }
        }
        catch(Exception e)
        {System.out.println(e);}
    }
}
class Product
{
    public static void main(String args[])
    {
        Buffer buf = new Buffer();
        Producer p = new Producer(buf);
        Consumer c = new Consumer(buf);
    }
}