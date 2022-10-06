public class ConstructTypes 
{
    int l,b,h;
    public ConstructTypes()
    {
        System.out.println("Default Constructor");
        l=b=h=0;
    }
    public ConstructTypes(int n)
    {
        System.out.println("Parameterized with only one argument");
        l=b=h=n;
    }
    public ConstructTypes(int x,int y,int z)
    {
        System.out.println("Parameterized with three args");
        l=x;
        b=y;
        h=z;
    }
    public int volume()
    {
        return l*b*h;
    }
        public static void main(String[] args) {
        ConstructTypes b1=new ConstructTypes (); //default
        ConstructTypes b2=new ConstructTypes (6); //Parameterized with one
        ConstructTypes b3=new ConstructTypes (2,3,4); //parameterized with three
        System.out.println(b1.volume()); //0
        System.out.println(b2.volume()); // 216
        System.out.println(b3.volume()); // 24
    }
}