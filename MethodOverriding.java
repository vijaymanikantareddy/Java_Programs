class AAA
{
    public void show()
    {
        System.out.println("Parent show method");
    }
    public void display()
    {
        System.out.println("Parent display method");
    }
}

class BBB extends AAA
{
    public void show()
    {
        super.show();       //It is an example of method Overriding
        System.out.println("Child show method");
    }
    public void msg()
    {
        System.out.println("Child msg method");
    }
}

class MethodOverriding
{
    public static void main(String args[]) throws Exception
    {
        BBB b= new BBB();
        b.display();    //Parent Display method 
        b.msg();    // Child msg method
        b.show();   //Child Show Method
    }
}