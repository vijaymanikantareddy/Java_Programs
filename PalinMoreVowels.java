import java.util.*;
class PalinMoreVowels
{
    public static boolean ispalin(String s)
    {
        int l=0, r=s.length()-1;
        while(l<=r)
        {
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static int vowelcnt(String s)
    {
        s = s.toLowerCase();
        int cnt=0;
        for(int i=0 ; i<s.length() ; i++)
        {
            char ch = s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String words [] = line.split(" ");
        int mx=-1, mxind=-1;
        for(int i=0 ; i<words.length ; i++)
        {
            if(ispalin(words[i]) && mx<vowelcnt(words[i]))
            {
                mx = vowelcnt(words[i]);
                mxind = i;
            }
        }
        System.out.println(mxind!=-1 && mx!=-1? words[mxind]+" contains more number of vowels & Palindrome": "No Vowels Present in the String nor it is a palindrome");
    }
}