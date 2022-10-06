import java.io.*;
class VowelsCount
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string: ");
        String a =  new String("hello good Morning");
        char x[] = a.toCharArray();
        int cnt=0;
        for(int i=0 ; i<x.length ; i++){
            if(x[i]=='a' || x[i]=='e' || x[i]=='i' || x[i]=='o' || x[i]=='u'){
                cnt++;
            }
        }
        System.out.println("No. of vowels are "+ cnt);
    }
}