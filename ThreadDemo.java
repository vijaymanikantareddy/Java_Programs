import java.lang.*;
class Thread1 extends Thread
{
    public void run()
    {
        for(int i=0 ; i<10 ; i++)
            System.out.println("Thala - Ajith");
    }
}
class Thread2 extends Thread
{
    public void run()
    {
        for(int i=0 ; i<10 ; i++)
            System.out.println("Thalaiva - Rajini");
    }
}
class ThreadDemo 
{
    public static void main(String args[])
    {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
        for(int i=0 ; i<10 ; i++)
            System.out.println("Thalapathy - Vijay");
    }
}