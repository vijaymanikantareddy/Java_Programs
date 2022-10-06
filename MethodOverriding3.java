import java.util.Scanner;
class Number
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
class Hexa extends Number
{
    void show()
    {
        super.show();
        System.out.println("Hexa : "+Integer.toHexString(x));
    }
}
class Octal extends Number
{
    void show()
    {
        super.show();
        System.out.println("Octal : "+Integer.toOctalString(x));
    }
}
public class MethodOverriding2
{
    public static void main(String args[])
    {
        Hexa h = new Hexa();
        Octal o = new Octal();
        h.getNo();
        h.show();
        System.out.println();
        o.getNo();
        o.show();
    }
}import java.util.Scanner;
class Number
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
class Hexa extends Number
{
    void show()
    {
        super.show();
        System.out.println("Hexa : "+Integer.toHexString(x));
    }
}
class Octal extends Number
{
    void show()
    {
        super.show();
        System.out.println("Octal : "+Integer.toOctalString(x));
    }
}
public class MethodOverriding3
{
    public static void main(String args[])
    {
        Hexa h = new Hexa();
        Octal o = new Octal();
        h.getNo();ṇ
        h.show();
        System.out.println();
        o.getNo();
        o.show();
    }
}