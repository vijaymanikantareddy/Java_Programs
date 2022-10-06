class DemoNull
{
    public void display(String s) throws NullPointerException
    {
        // try
        // {
            System.out.println(s.length());
        // }
        // catch(NullPointerException ne)
        // {
            // System.out.println("String object must be initialized");
        // }
    }
    public static void main(String args[]) throws NullPointerException
    {
        String s = null;
        DemoNull d = new DemoNull();
        d.display(s);
    }
}