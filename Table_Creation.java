import java.sql.*;
class Table_Creation
{
    public static void main(String args[])
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/thub","root","Thub@123");
            if(con!=null)
                System.out.println("Database Connected");
            else
                System.out.println("Not Connected"); Statement st=con.createStatement();
            int count=st.executeUpdate("create table assembly(code int,name varchar(20),mla varchar(20),count int)");
            if(count==1)
                System.out.println("table created"); 
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}