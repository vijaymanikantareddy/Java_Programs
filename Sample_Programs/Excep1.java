import java.io.*;
class Excep1
{
    public static void main(String args[])
    {
        int x=10, y=05, z;
        System.out.println("Statement1");
        try
        {
            z = x/y;
        }
        catch(ArithmeticException ae)
        {
            y = 2;
            z = x/y;
        }
        System.out.println(z);
        System.out.println("Statement2");
    }
}