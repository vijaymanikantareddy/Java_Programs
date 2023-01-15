import java.io.*;
class Starray
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        int sum=0;
        input = br.readLine();
        String num[] = input.split(" ");
        for(int i=0 ; i<num.length ; i++){
            sum = sum+Integer.parseInt(num[i]);
            System.out.println(num[i]);
        }
        System.out.println(sum);


        //contains(String) and copyValueof()
        String s1 = new String("12-34-56");
        char x[] = s1.toCharArray();
        for(int i=0 ; i<x.length ; i++){
            System.out.println(x[i]);
        }
    }
}