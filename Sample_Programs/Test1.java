interface I
{
    void m1();
    void m2();
    default void m3()
    {
        System.out.println("Dafault Method");
    }
}

class T1 implements I 
{
    public void m1(){ System.out.println("M1 Method");}
    public void m2(){ System.out.println("M2 Method");}
    public void m3(){ System.out.println("Default Overrided Method Definition");}
}

class Test1
{
    public static void main(String args[])
    {
        I inf;
        inf = new T1();
        inf.m1();
        inf.m2();
        inf.m3();
    }
}