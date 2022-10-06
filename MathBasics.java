import aec.math.Arithmetic;
class MathBasics
{
    public static void main(String args[])
    {
        int x=10, y=20;
        Arithmetic a = new Arithmetic();
        System.out.println(a.add(x,y));
        System.out.println(a.sub(x,y));
        System.out.println(a.mul(x,y));
        System.out.println(a.div(y,x));
    }
}