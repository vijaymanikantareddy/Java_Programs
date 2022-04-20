public class CallBy1
{
    public void increment(int x[])
    {
        for(int i=0 ; i<x.length ; i++){
            x[i]++;
        }
    }
    public static void main(String args[]) throws Exception
    {
        CallBy1 c = new CallBy1();
        int p[] = {10, 20, 30};
        System.out.println("Before funcion call");
        for(int i=0 ; i<p.length ; i++)
            System.out.print(p[i]+" ");
            
        c.increment(p);

        System.out.println("\nAfter funcion call");
        for(int i=0 ; i<p.length ; i++)
            System.out.print(p[i]+" ");
    }
}