import java.io.*;
class MethodOverload
{
    public void swap(int a, int b){
        int temp;
        temp =a ;
        a = b;
        b = temp;
        System.out.println(a+" "+b);
    }
    public void swap(char a, char b){
        char temp;
        temp =a ;
        a = b;
        b = temp;
        System.out.println(a+" "+b);
    }
    public void swap(double a, double b){
        double temp;
        temp =a ;
        a = b;
        b = temp;
        System.out.println(a+" "+b);
    }
    public static void main(String args[]) throws Exception
    {
        MethodOverload m = new MethodOverload();
        m.swap(25,20);
        m.swap('a','v');
        m.swap(67.67, 69.8);
    }
}