class GP
{
    int x;
    public GP(int x)
    {
        this.x=x;
    }
    public void showX()
    {
        System.out.println("x = "+x);
    }
}
class CP extends GP{
    int y;
    public CP(int p, int q)
    {
        super(p);
        y=q;
    }
    public void showY()
    {
        System.out.println("y = "+y);
    }
}
class Child2 extends CP
{
    int z;
    public Child2(int p, int q , int r)
    {
        super(p,q);
        z=r;
    }
    public void showZ()
    {
        System.out.println("z = "+z);
    }
}
public class Super3
{
    public static void main(String args[])
    {
        Child2 c = new Child2(10,20,30);
        c.showY();
        c.showX();
        c.showZ();
    }
}