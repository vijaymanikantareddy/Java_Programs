import java.util.*;
class MoreVowels
{
    public static int vowels(String s)
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
        // Strings in Separate Lines
        int n = sc.nextInt();
        sc.nextLine();
        String arr[] = new String[n];
        int mx=-1, mxind=-1;
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextLine();
            if(mx<vowels(arr[i]))
            {
                mx = vowels(arr[i]);
                mxind = i;
            }
        }
        System.out.println(mxind!=-1 && mx!=-1? arr[mxind]+" contains more number of vowels": "No Vowels Present in the String");

    }
}