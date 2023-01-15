import java.util.Scanner;
public abstract class ShapeDemo{
    float s1, s2 ;
    final float pi = 3.142f;
    Scanner sc = new Scanner(System.in);
    public abstract void getInput();
    public abstract float cal_Area();
    public static void main(String args[]){
        ShapeDemo s;
        s = new Rect1();
        s.getInput();
        System.out.println(s.cal_Area());
        System.out.println("======================");
        s = new Circle1();
        s.getInput();
        System.out.println(s.cal_Area());
    }
}

class Rect1 extends ShapeDemo
{
    public void getInput()
    {
        System.out.println("Enter the sides of Rectangle: ");
        s1 = sc.nextFloat();
        s2 = sc.nextFloat();
    }
    public float cal_Area()
    {
        return s1*s2;
    }
}

class Circle1 extends ShapeDemo
{
    public void getInput()
    {
        System.out.println("Enter the Radius of the Circle: ");
        s1 = sc.nextFloat();
    }
    public float cal_Area()
    {
        return pi*s1*s1;
    }
}
