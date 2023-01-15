import java.io.*;
class Fib_series
{
    public static int fib(int n){
        if(n==1 || n==0)
            return n;
        return fib(n-1)+fib(n-2);
    }
    public static void main(String args[])throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        n = Integer.parseInt(br.readLine());
        int a = fib(n);
        System.out.println(a);
    }
}