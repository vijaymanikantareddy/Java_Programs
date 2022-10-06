import java.io.*;
class Box
{
    int l, b, h;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void getInput() throws Exception
    {
        System.out.println("Enter length, breadth, height ");
        l = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        h = Integer.parseInt(br.readLine());
    }
    public int cal_area()
    {
        return l*b;
    }
    public int cal_volume()
    {
        return l*b*h;
    }
    public static void main(String args[])throws Exception
    {
        Box  b = new Box();
        b.getInput();
        System.out.println("Area = "+b.cal_area());
        System.out.println("Volume = "+b.cal_volume());

        Box b2 = new Box();
        b2.l=10;
        b2.b = 20;
        b2.h = 30;
        System.out.println("Area = "+b2.cal_area());
        System.out.println("Volume = "+b2.cal_volume());
    }
}