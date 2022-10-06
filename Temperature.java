import java.io.*;
class Temperature
{
    public static void main(String args[]) throws Exception
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter temperature: ");
        int temp;
        temp = Integer.parseInt(br.readLine());
        if(temp<0) {
            System.out.println("Freezing Water");
        }
        else if(temp==0 && temp<=10){
            System.out.println("Very Cold weather");
        }
        else if(temp >10 && temp <= 20){
            System.out.println("Cold weather");
        }
        else if(temp >20 && temp <= 30){
            System.out.println("Normal weather");
        }
        else if(temp >30 && temp <= 40){
            System.out.println("Hot weather");
        }
        else{
             System.out.println("Very Hot weather");
        }
    }

}