class DemoString
{
    public static void main(String args[])
    {
     /*   String a = new String("Vijay");
        a.concat("Manikanta");
        StringBuffer b = new StringBuffer("Vijay");
        b.append("Manikanta");
*/
        String sa = new String("aditya");
        String sb = new String("aditya");
        String sc = "aditya";
        String sd = "aditya";
        System.out.println(sa==sb);
        System.out.println(sc.equals(sd));

        String saa = new String("Aditya Group of Institutions");

        //replace function
        String s1 = new String("Aditya Group Of Colleges");
        System.out.println(s1.replace('o','z'));
    }
}