import java.io.*;
class Vowel
{
    public static void main(String args[]) throws Exception
    {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    char ch;
    System.out.println("Enter a character: ");
    ch = (char)br.read();
    switch(ch){
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Constant");
                break;
       }
    }
}