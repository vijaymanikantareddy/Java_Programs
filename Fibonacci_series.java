import java.util.Scanner;
class Fibonacci_series
{
	public static int fib(int a, int b, int c, int i, int n){
		if(i==n){
			return 0;
		}
		else{
			c = a+b;
			a = b;
			b = c;
			System.out.print(c+" ");
			i = i+1;
			return fib(a,b,c,i,n);
		}
	}
	public static void main(String args[])
	{
		int a=0, b=1, c, i=2, n;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number: ");
		n = s.nextInt();
		c=a+b;
		System.out.print(a+" "+b+" ");
		fib(a,b,c,i,n);
	}
}