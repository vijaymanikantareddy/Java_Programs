//program to print primes between two numbers
import java.io.*;
class PrimeRange
{
    public Boolean prime(int n){
        if (n<=1)
        {
            return false;
        }
        for(int i=2 ; i<n ; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) throws Exception
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter two numbers: ");
        int a,b;
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        PrimeRange obj = new PrimeRange();
        for(int i=a ; i<=b ; i++)
        {
            if(obj.prime(i)){
                System.out.println(i);
            }
        }
    }
}