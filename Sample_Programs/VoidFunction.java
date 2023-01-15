class VoidFunction
{
    public void display(){
        System.out.println("Power is the State of Mind --- Non Static Method");
    }

    public static void show()
    {
        System.out.println("I'm waiting --- Static Method");
    }
    public static void main(String args[]) throws Exception
    {
        VoidFunction v = new VoidFunction();    //to access non static methods we need to create an object to the class
        v.display();
        System.out.println("I'm the Only one, Super one --- Main function");
        show();     //to access static methods we don't need objects

    }
}