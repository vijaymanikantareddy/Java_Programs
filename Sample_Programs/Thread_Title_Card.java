class Thread_Title_Card
{
    public static void main(String args[])
    {
        String name = "Doraemon Nobita Shizuka";
        for(int i=0 ; i<name.length() ; i++)
        {
            System.out.println(name.charAt(i));
            try 
            {
                Thread.sleep(150);
            }
            catch(InterruptedException e)
            {
                
            }
        }
    }
}