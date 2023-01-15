import java.io.*;
class StaticKeyword
{
    static int a=10;
    static 
    {
        System.out.println("Static Block");
    }
    static void methodOne(){
        System.out.println("Static Method");
    }
    public static void main(String args[]) throws Exception
    {
        System.out.println("Main Method");
        System.out.println(a);
        methodOne();
    }
}