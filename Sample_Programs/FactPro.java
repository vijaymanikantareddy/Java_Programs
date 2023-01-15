//program to find the difference between 
//product of all the factors of a given number to sum of its factors
import java.io.*;
class FactPro
{
    public static void main(String args[]) throws Exception
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int n, sum=0, product = 1;
        System.out.println("Enter a number: ");
        n = Integer.parseInt(br.readLine());
        for(int i=1 ; i*i<= n ; i++){
            if(n%i==0){
                sum+= i+(n/i);
                product*=i*(n/i);
            }
        }
        int diff = Math.abs(product-sum);
        System.out.println("Difference is "+diff);
    }
}