class A_method
{
    public void m1()
    {
        System.out.println("A Method");
    }
}
class B_method extends A_method
{
    public void m1()
    {
        System.out.println("B Method");
    }
}
class C_method extends A_method
{
    public void m1()
    {
        System.out.println("C Method");
    }
}

public class ABC_method
{
    public static void main(String args[])
    {
        A_method a;
        a = new A_method();
        a.m1();

        a = new B_method();
        a.m1();

        a = new C_method();
        a.m1();
    }
}