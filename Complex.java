class Complex
{
    int real,img;
    public Complex()
    {
        real=0;
        img=0;
    }
    public Complex(int x,int y) // parameterized constructor
    {
        real=x;
        img=y;
    }
    public void show()
    {
        System.out.println(real+"+i"+img);
    }
    public void add(Complex c1,Complex c2)
    {
        this.real=c1.real+c2.real;
        this.img=c1.img+c2.img;
    }
    public static void main(String args[])
    {
        Complex c1=new Complex(2,3); // 2+i3
        Complex c2=new Complex(4,5); // 4+i5
        Complex c3=new Complex(); // default
        c3.add(c1,c2);
        c1.show();
        c2.show();
        System.out.println("The sum of two complex numbers is:");
        c3.show();
    }
}