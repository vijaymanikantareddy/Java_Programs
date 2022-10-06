import java.util.Scanner;
class DemoArrayExcept
{
    public static void main(String args[])
    {
        int a[] = {10, 20, 30, 40}, sum=0;
        try{
            for(int i=0 ; i<=a.length ; i++)
                sum+=a[i];
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println(sum);
    }
}