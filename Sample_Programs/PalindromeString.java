import java.util.*;
class PalindromeString
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
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String ab = sc.nextLine();
        System.out.println(ispalin(ab)? "Palindrome": "Not Palindrome");
    }
}