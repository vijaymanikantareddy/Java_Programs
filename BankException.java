import java.util.InputMismatchException;
import java.util.Scanner;

class MinAmountException extends Exception
{
    public MinAmountException(String msg)
    {
        super(msg);
    }
}
class AmountException extends Exception
{
    public AmountException(String msg)
    {
        super(msg);
    }
}

class BankException
{
    public static void main(String args[])
    {
        int amount=0;
        int wd=0;
        Scanner sc  = new Scanner(System.in);
        try
        {
            amount = sc.nextInt();
            wd = sc.nextInt();
            if((amount-wd)<500)
                throw new MinAmountException("You are not eligible for Withdrawl");
            else 
                throw new AmountException("You are eligible for withdrawl");
        }
        catch(MinAmountException me)
        {
            System.out.println(me);
        }
        catch(AmountException me)
        {
            System.out.println(me);
        }
        
        catch(InputMismatchException me)
        {
            System.out.println("Input format is not correct");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println(amount-wd);
    }
}
