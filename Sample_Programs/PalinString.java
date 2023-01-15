import java.util.*;
class PalinString
{
    public static boolean ispalin(String s)
    {
        char ch[] = s.toCharArray();
        int le=0, ri=ch.length-1;
        while(le<=ri)
        {
            if(ch[le]!=ch[ri]){
                return false;
            }
            le++;
            ri--;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String s = sc.nextLine();
        while(t-->0)
        {
            String str = sc.nextLine();
            if(ispalin(str))
            {
                if(str.length()%2==0)
                {
                    System.out.println("YES EVEN");
                }
                else{
                    System.out.println("YES ODD");
                }
            }
            else{
                System.out.println("NO");
            }
        }
    }
}