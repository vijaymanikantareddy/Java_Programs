import java.util.*;
class StringEquality
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String ab = sc.nextLine();
        long up=0, lo=0, sp=0, num=0;
        for(int i=0 ; i<ab.length() ; i++)
        {
            char ch = ab.charAt(i);
            if(Character.isDigit(ch)){
                num++;
            }
            else if(Character.isUpperCase(ch)){
                up++;
            }
            else if(Character.isLowerCase(ch)){
                lo++;
            }
            else {
                sp++;
            }
        }
        if(num==up && up==lo && lo==sp){
            System.out.println("String Equality: True");
        }
        else 
            System.out.println("String Equality: False");
    }
}