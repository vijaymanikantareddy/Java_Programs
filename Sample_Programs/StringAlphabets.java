//write a java program to remove characters in the given sring except alphabets
import java.io.*;
class StringAlphabets
{
    public static void main(String args[]) throws Exception
    {
        String str1, str2 = " ";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str1 = br.readLine();
        char ch[] =  str1.toCharArray();
        for(int i = 0 ; i<ch.length ; i++){
            if(Character.isLetter(ch[i]))  
                str2 = str2+ch[i];
        }
        System.out.println(str2);
    }
}