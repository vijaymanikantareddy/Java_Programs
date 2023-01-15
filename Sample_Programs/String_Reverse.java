//write a java program to take a line as an input and print each word in reverse
import java.io.*;
class StringReverse
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1;
        StringBuffer s2;
        s1 = br.readLine();

        String words[] = s1.split(" ");
        for(int i=0 ; i<words.length ; i++)
        {
            s2 = new StringBuffer(words[i]);
            System.out.print(s2.reverse()+" ");
        }
    }
}