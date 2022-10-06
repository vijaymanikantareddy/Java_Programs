//write a java program to show the number of characters of each word in a string array
import java.io.*;
class StringSplitting
{
    public static void  main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        input = br.readLine();
        String words[] = input.split(" ");
        for(int i=0 ; i<words.length ;i++)
        {
            System.out.println("Word "+(i+1)+" - "+words[i].length());
        }
    }
}