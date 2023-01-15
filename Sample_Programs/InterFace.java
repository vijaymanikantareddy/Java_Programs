interface I1
{
    void m1();
}
interface I2
{
    void m2();
}
interface I3 extends I1, I2{
    void m3();
}
class InterFace implements I3
{
    public void m1()
    {
        System.out.println("M1 Method");
    }
    public void m2()
    {
        System.out.println("M2 Method");
    }
    public void m3()
    {
        System.out.println("M3 Method");
    }
    public static void main(String args[])
    {
        I3 i;
        i = new InterFace();
        i.m1();
        i.m2();
        i.m3();
    }
}