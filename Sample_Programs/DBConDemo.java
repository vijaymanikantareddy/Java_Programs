import java.sql.*;
class DBConDemo
{
    public static void main(String args[])
    {
        Connection con=null;
        try
        {
            // 1. Loading or Register the driver software
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2. Connection with database
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/thub","root","vijay768");
            if(con!=null)
                System.out.println("Conncetion Successful");
            else
                System.out.println("Not Connected");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}