import java.io.*;
class Biggest_of_two_numbers
{
    public static void main(String args[]) throws Exception
    {
        InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
        int a, b;
        System.out.println("Enter a, b values: ");
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        if(a>b){
            System.out.println(a+" is greater than "+b);
        }
        else{
            System.out.println(b+" is greater than "+a);
        }

    }
}