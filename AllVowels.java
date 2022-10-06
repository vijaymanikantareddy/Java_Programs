import java.util.*;
class AllVowels
{
    public static boolean vowels(String s)
    {
        s = s.toLowerCase();
        for(int i=0 ; i<s.length() ; i++)
        {
            char ch = s.charAt(i);
            if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u'){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        // Strings in Separate Lines
        int n = sc.nextInt();
        sc.nextLine();
        String arr[] = new String[n];
        for(int i=0 ; i<n ; i++)
            arr[i] = sc.nextLine();
        for(int i=0 ; i<n ; i++)
        {
            if(vowels(arr[i]))
            {
		        System.out.println(arr[i]+" is a vowel String");
            }
        }

        // Strings in Same Line
        String line = sc.nextLine();
        String st[] = line.split(" ");
        for(int i=0 ; i<st.length ; i++)
        {
            if(vowels(st[i]))
            {
		        System.out.println(st[i]+" is a vowel String");
            }
        }

    }
}