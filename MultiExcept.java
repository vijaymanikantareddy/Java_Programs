class MultiExcept
{
    public static void main(String args[])
    {
        int sum=0, i, avg=0;
        try{
            for(i=0 ; i<args.length ; i++)
            {
                sum+=Integer.parseInt(args[i]);
            }
            avg = sum/args.length;
        }
        catch(ArrayIndexOutOfBoundsException aie)
        {
            System.out.println("Index out of Range");
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Divide with zero, not possible");
        }
        catch(NumberFormatException ne)
        {
            System.out.println("Number format exception");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println(avg);
    }
}