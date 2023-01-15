import java.util.*;
class StringSumPro
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String ab = sc.nextLine();
        long sum=0, pro=1;
        for(int i=0 ; i<ab.length() ; i++)
        {
            long d = ab.charAt(i)-'0';
            if(d>=0 && d<=9){
                sum+=d;
                pro*=d;
            }
        }
        System.out.println("Product - Sum "+(pro-sum));
    }
}