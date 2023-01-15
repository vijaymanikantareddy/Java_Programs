import java.io.*;
class EvenOdd
{
    public static void main(String args[]) throws Exception
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int n, se=0, so = 0;
        System.out.println("Enter a number: ");
        n = Integer.parseInt(br.readLine());
        while(n>0){
            int r=n%10;
            if(r%2==0){
                se+=r;
            }
            else{
                so+=r;
            }
            n/=10;
        }
        System.out.println("evens = "+se+" odds = "+so);
    }
}