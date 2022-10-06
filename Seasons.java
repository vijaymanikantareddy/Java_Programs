import java.io.*;
class Seasons
{
    public static void main(String args[]) throws Exception
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter Month: ");
        int month;
        month = Integer.parseInt(br.readLine());
        switch(month){
            case 3:  case 4: case 5:
                System.out.println("Summer");
                break;
            case 6: case 7: case 8: case 9:
                System.out.println("Rainy");
                break;
            case 10: case 11: case 12: case 1: case 2:
                System.out.println("Winter");
                break;
            default:
                System.out.println("Enter correct month!");
        }
    }
}