import java.io.*;
class Student
{
    //member variable declarations
    String rollnum, name, branch, clgname;
    int year;
    float per_marks;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //reading the input
    public void getData() throws Exception
    {
        System.out.println("Enter the Rollnum, Name, Branch, Year, Percentage and College Name");
        rollnum = br.readLine();
        name = br.readLine();
        branch = br.readLine();
        year = Integer.parseInt(br.readLine());
        per_marks = Float.parseFloat(br.readLine());
        clgname = br.readLine();
    }
    public void display()
    {
        System.out.println("Roll Number = "+rollnum);
        System.out.println("Name = "+name);
        System.out.println("Branch Name = "+branch);
        System.out.println("Year = "+year);
        System.out.println("Percentage of the Year = "+per_marks+"%");
        System.out.println("College Name = "+clgname);
    }
    public static void main(String args[]) throws Exception
    {
        Student s1 = new Student();
        s1.getData();
        Student s2 = new Student();
        s2.getData();
        s1.display();
        s2.display();
    }
}