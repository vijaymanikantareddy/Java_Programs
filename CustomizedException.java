import java.util.InputMismatchException;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
class MinorException extends Exception
{
    public MinorException(String msg)
    {
        super(msg);
    }
}
class MajorException extends Exception
{
    public MajorException(String msg)
    {
        super(msg);
    }
}
class SeniorCitizenException extends RuntimeException
{
    public SeniorCitizenException(String msg)
    {
        super(msg);
    }
}
class CustomizedException
{
    public static void main(String args[])
    {
        int age=0;
        Scanner sc  = new Scanner(System.in);
        try
        {
            age = sc.nextInt();
            if(age<18)
                throw new MinorException("You are not eligible for marriage");
            else if(age>=18 && age<40)
                throw new MajorException("You are eligible for marriage");
            else 
                throw new SeniorCitizenException("You are too late for marriage");
        }
        catch(MinorException me)
        {
            System.out.println(me);
        }
        catch(MajorException me)
        {
            System.out.println(me);
        }
        catch(SeniorCitizenException se)
        {
            System.out.println(se);
        }
        catch(InputMismatchException me)
        {
            System.out.println("Input format is not correct");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println(age);
    }
}
