class Parent1
{
    int x;
    public void setx(int p){
        x=p;
    }
    public int getx(){
        return x;
    }
}
class Child1 extends Parent1
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
public class SingleLevel
{
    public static void main(String args[]) throws Exception
    {
        System.out.println("Parent Obj - Parent Instance");
        Parent1 p= new Parent1();
        p.setx(100);
        System.out.println(p.getx());
        System.out.println();

        //p.sety(200) => Compilation Error
        //p.gety() => Compilation Error

        System.out.println("Child Obj - Child Instance");
        Child1 c = new Child1();
        c.setx(101);
        System.out.println(c.getx());
        c.sety(201);
        System.out.println(c.gety());
        System.out.println();


        System.out.println("Parent Obj - Child Instance");
        Parent1 p1 = new Child1();
        p1.setx(301);
        System.out.println(p1.getx());
        // p1.sety(401);    ---     It shows an Compilation Error
        //  Child1 c1 = new Parent1();  --- It shows an Compilation Error
    }
}