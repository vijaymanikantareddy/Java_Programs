class Parent111
{
    public Parent111()
    {
        this("Aditya1");
        System.out.println("Good Morning Guest");
    }
    public Parent111(String name)
    {
        System.out.println("Good Morning "+name);
    }
}
public class Super1
{
    public static void main(String args[])
    {
        Parent111 p = new Parent111("Aditya");
        Parent111 p1 = new Parent111();
    }
}