//write a java program to read a line of text and then find the number of uppercase, lowercase, digits and symbols in it.
import java.io.*;
class Stcompare
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1;
        int i, l=0, u=0, d=0, s = 0;
        str1 = br.readLine();
        char ch[] = str1.toCharArray();
        for(i = 0; i<ch.length ; i++){
            if(Character.isLowerCase(ch[i]))
                l++;
            else if(Character.isUpperCase(ch[i]))
                u++;
            else if(Character.isDigit(ch[i]))
                d++;
            else
                s++;
        }
        System.out.println(l+" "+u+" "+d+" "+s);
    }
}