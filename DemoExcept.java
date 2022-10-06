import java.util.Scanner;
class DemoExcept
{
    public static void main(String args[])
    {
        int a, b, c;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        try{
            c = a/b;
        }
        catch(Exception e){
            System.out.println(e);
            c=a/2;
        }
        finally{
            System.out.println("Finally Demo");
        }
        System.out.println(c);
    }
}