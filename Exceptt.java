import java.io.*;
class Exceptt
{
    void m1()
    {
        System.out.println("Hai");
    }
    public static void main(String args[])
    {
        Exceptt e = new Exceptt();
        e.m1();
        e = null;
        e.m1();
    }
}