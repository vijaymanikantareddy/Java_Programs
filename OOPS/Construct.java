import java.io.*;
class Construct
{
    int x;
    public Construct()
    {
        System.out.println("Default Constructor Executed");
        x = 10;
    }
    public Construct(int y)
    {
        System.out.println("Parameterized Constructor ");
        x=y;
    }
    public void show()
    {
        System.out.println(x);
    }
    public static void main(String args[]) throws Exception
    {
        Construct s = new Construct();
        Construct s1 = new Construct(20);
        s.show();
        s1.show();
    }
}