class Thread1a extends Thread
{
    public void run()
    {
        for(int i=0 ; i<5 ; i++)
        {
            System.out.println(Thread.currentThread().getName()+" : "+i);
        }
    }
}
class Thread1b extends Thread
{
    public void run()
    {
        for(int i=0 ; i<5 ; i++)
        {
            System.out.println(Thread.currentThread().getName()+" : "+i);
        }
    }
}
class Thread1c extends Thread
{
    public void run()
    {
        for(int i=0 ; i<5 ; i++)
        {
            System.out.println(Thread.currentThread().getName()+" : "+i);
        }
    }
}
class ThreadDemo1
{
    public static void main(String args[])
    {
        Thread1a t1 = new Thread1a();
        Thread1b t2 = new Thread1b();
        Thread1c t3 = new Thread1c();
        t1.start();
        t2.start();
        t3.start();
        t1.setName("Vijay Sethupathi");
        t2.setName("Samantha");
        t3.setName("Nayanthara");
        System.out.println("");
        for(int i=0 ; i<5 ; i++)
            System.out.println(Thread.currentThread().getName()+" : "+i);
    }
}