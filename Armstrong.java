import java.io.*;
class Armstrong
{
    public static void main(String args[]) throws Exception
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int n, len, temp, sum=0, temp1;
        System.out.println("Enter a number: ");
        n = Integer.parseInt(br.readLine());
        temp = n;
        //temp1 = n;
        len = (int)Math.log10(n)+1;
        /*while(temp1>0){
            temp1/=10;
            len+=1;
        }*/
        while(temp>0)
        {
            int rem = temp%10;
            temp/=10;
            sum+= Math.pow(rem, len);
        }
        if(n==sum){
            System.out.println(n+" is Armstrong number");
        }
        else{
            System.out.println(n+" is not Armstrong number");
        }
    }
}