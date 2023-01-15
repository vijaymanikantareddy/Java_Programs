import java.util.Scanner;
class NumberAB
{
    int x;
    Scanner sc = new Scanner(System.in);
    public void getNo()
    {
        System.out.println("Enter a Number");
        x = sc.nextInt();
    }
    void show()
    {
        System.out.println("Decimal : "+x);
    }
}
class Hexa extends NumberAB
{
    void show()
    {
        super.show();
        System.out.println("Hexa : "+Integer.toHexString(x));
    }
}
class Octal extends NumberAB
{
    void show()
    {
        super.show();
        System.out.println("Octal : "+Integer.toOctalString(x));
    }
}
public class MethodOverriding4
{
    public static void Disp(NumberAB n){
        if(n instanceof Hexa){
            System.out.println("Hexa Class Instance");
        }
        else if(n instanceof Octal){
            System.out.println("Octal Class Instance");
        }
        n.getNo();  //NumberAB
        n.show();   //it depends on Child Class instace stored
    }
    public static void main(String args[])
    {
        Disp(new Hexa());
        Disp(new Octal());
    }
}
