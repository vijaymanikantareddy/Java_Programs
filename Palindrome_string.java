import java.util.Scanner;
class Palindrome_string
{
    public static boolean palindrome(String s)
    {
        /*StringBuffer sb=new StringBuffer(s);
        sb.reverse();
        String s1=new String(sb);
        if(s.equals(s1))
        return true;
        else
        return false;
        */
        char x[]=s.toCharArray();
        int flag=0;
        for(int i=0;i<=x.length/2;i++)
            {
            if(x[i]!=x[x.length-i-1])
            {
                flag=1;
                break;
            }
            }
        if(flag==0)
            return true;
        else
            return false;
    }

    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    String var=sc.next();
    boolean res;
    res=Palindrome_string.palindrome(var);
    if(res)
        System.out.println("Palindrome");
    else
        System.out.println("Not a Palindrome");
    }
}