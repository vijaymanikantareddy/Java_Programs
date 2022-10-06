//write a java program to compare two strings
import java.io.*;
class StringYes
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1, str2;
        str1 = br.readLine();
        str2 = br.readLine();
        if(str1.contains(str2)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}