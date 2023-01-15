interface Inf1
{
    default void m1()
    {
        System.out.println("INF1 m1 method");
    }
}

interface Inf2
{
    default void m1()
    {
        System.out.println("INF2 m1 method");
    }
}

class Test3 implements Inf1, Inf2 
{
    public void m1()
    {
        Inf2.super.m1();
        System.out.println("Test3 m1 method");
    }
    
    public static void main(String args[])
    {
        Test3 t = new Test3();
        t.m1();
    }
}