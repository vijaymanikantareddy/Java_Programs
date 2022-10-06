import java.util.*;
class NegValException extends Exception 
{
    public NegValException(String msg)
    {
        super(msg);
    }
}
class AvgExcept
{
    public static void main(String args[])
    {
        String name=null;
        int a=0, b=0, c=0;
        try
        {
            name = args[0];
            a = Integer.parseInt(args[1]);
            b = Integer.parseInt(args[2]);
            c = Integer.parseInt(args[3]);
            if(a<0 || b<0 || c<0)
                throw new NegValException("marks should be greater than zero");

        }
        catch(ArrayIndexOutOfBoundsException me)
        {
            System.out.println("minimum of 4 arguments should be passed");
            System.exit(0);
        }
        catch(NegValException me)
        {
            System.out.println(me);
            System.exit(0);
        }
        catch(NumberFormatException me)
        {
            System.out.println("Marks should be integers only");
            System.exit(0);
        }
        catch(Exception e)
        {
            System.out.println(e);
            System.exit(0);
        }
        int avg = (a+b+c)/3;
        System.out.println("Name : "+name);
        System.out.println("Average is : "+avg);
    }
}