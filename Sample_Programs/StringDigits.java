//write a java program to make the sum of digits in a string
import java.io.*;
class StringDigits
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int i, sum1=0, sum2 = 0;
        s = br.readLine();
        char ch[] = s.toCharArray();
        for(i = 0 ; i<ch.length ; i++){
            if(Character.isDigit(ch[i])){
                sum1 += Integer.parseInt(ch[i]+"");
                sum2 += (ch[i]-48);//second logic
            }
        }
        System.out.println(sum1+" "+sum2);
    }
}