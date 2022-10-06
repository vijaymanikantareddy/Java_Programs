//write a java program to print student grade
import java.io.*;
class StudentGrade
{
    public static void main(String args[]) throws Exception
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int a,b,c, sum, avg;
        String name;
        System.out.println("Enter Student Name: ");
        name = br.readLine();
        System.out.println("Enter 3 subject marks: ");
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        c = Integer.parseInt(br.readLine());
        sum = a+b+c;
        avg = sum/3;
        System.out.println("Student Name : "+name);
        System.out.println("Result Using Else if: ");
        if(avg>=90 && avg<=100){
            System.out.println("A++ grade");
        }
        else if(avg>=80 && avg<=89){
            System.out.println("A+ grade");
        }
        else if(avg>=70 && avg<=79){
            System.out.println("A grade");
        }
        else{
            System.out.println("Fail");
        }
        System.out.println("Result Using switch: ");
        switch(avg/10){
            case 9:
            System.out.println("A++ grade");
            break;
            case 8:
            System.out.println("A+ grade");
            break;
            case 7:
            System.out.println("A grade");
            break;
            default: 
            System.out.println("Fail");
        }
    }
}