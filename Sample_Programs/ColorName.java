import java.io.*;
class ColorName
{
    public static void main(String args[]) throws Exception
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter color code: ");
        char col;
        col = (char)br.read();
        switch(col){
            case 'R': case 'r':
                System.out.println("Red");
                break;
            case 'Y': case 'y':
                System.out.println("Yellow");
                break;
            case 'G': case 'g':
                System.out.println("Green");
                break;
            case 'B': case 'b':
                System.out.println("Blue");
                break;
            case 'V': case 'v':
                System.out.println("Violet");
                break;
            case 'O': case 'o':
                System.out.println("Orange");
                break;
            case 'I': case 'i':
                System.out.println("Indigo");
                break;
            default:
                System.out.println("Color code Not Matched.");
        }
    }
}