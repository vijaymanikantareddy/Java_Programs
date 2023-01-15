public class CallBy
{
    public void increment(int x)
    {
        x++;
    }
    public static void main(String args[]) throws Exception
    {
        CallBy c = new CallBy();
        int p=10;
        System.out.println("Before funcion call");
        System.out.println(p);

        c.increment(p);

        System.out.println("After funcion call");
        System.out.println(p);
    }
}