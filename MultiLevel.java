class GrandParent
{
    int x;
    public void setx(int p){
        x=p;
    }
    public int getx(){
        return x;
    }
}

class Parent extends GrandParent
{
    int y;
    public void sety(int q)
    {
        y=q;
    }
    public int gety()
    {
        return y;
    }
}

class Child extends Parent
{
    int z;
    public void setz(int q)
    {
        z=q;
    }
    public int getz()
    {
        return z;
    }
}

public class MultiLevel
{
    public static void main(String args[]) throws Exception
    {
        Child c = new Child();
        c.setx(100);
        c.sety(200);
        c.setz(300);
        System.out.println(c.getx());
        System.out.println(c.gety());
        System.out.println(c.getz());
    }
}