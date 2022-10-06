class A
{
    int x;
    public void setx(int p){
        x=p;
    }
    public int getx(){
        return x;
    }
}

class B extends A
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

class C extends A
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

class D extends A
{
    int n;
    public void setn(int q)
    {
        n=q;
    }
    public int getn()
    {
        return n;
    }
}

public class Hierarical
{
    public static void main(String args[]) throws Exception
    {
        B b = new B();
        b.setx(100);
        b.sety(200);
        System.out.println(b.getx());
        System.out.println(b.gety());
        System.out.println();

        C c = new C();
        c.setx(1000);
        c.setz(2000);
        System.out.println(c.getx());
        System.out.println(c.getz());
        System.out.println();

        D d = new D();
        d.setx(10000);
        d.setn(20000);
        System.out.println(d.getx());
        System.out.println(d.getn());
        System.out.println();
    }
}