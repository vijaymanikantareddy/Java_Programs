class MethOver 
{
    public void method(int i){
        System.out.println("int-arg method");
    }
    public void method(float f){
        System.out.println("float-arg method");
    }
    public static void main(String args[]) 
    {
        MethOver m = new MethOver();
        m.method('a');
        m.method(10.2f);
        m.method(4.5);
    }
}