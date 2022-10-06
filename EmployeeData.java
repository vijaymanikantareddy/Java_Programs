import java.io.*;
class EmployeeData
{
    String name, dept, org, ug, pg;
    int salary, empid;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void getPersonal() throws Exception
    {
        System.out.println("Enter empid, name, dept name, salary, organization ");
        empid = Integer.parseInt(br.readLine());
        name = br.readLine();
        dept = br.readLine();
        salary = Integer.parseInt(br.readLine());
        org = br.readLine();
    }
    public void getQualification() throws Exception
    {
        System.out.println("Enter UG and PG ");
        ug = br.readLine();
        pg = br.readLine();
    }
    public void displayPersonal() 
    {
        System.out.println("Personal Information");
        System.out.println("Empid : "+ empid);
        System.out.println("Employee Name : "+name);
        System.out.println("Department Name : "+dept);
        System.out.println("Salary : "+salary);
        System.out.println("Organization : "+org);   
    }
    public void displayQualification()
    {
        System.out.println("Educational Qualification");
        System.out.println("UG : "+ ug);
        System.out.println("PG : "+pg);
    }
    public static void main(String args[]) throws Exception
    {
        EmployeeData e1 = new EmployeeData();
        e1.getPersonal();
        e1.getQualification();
        e1.displayPersonal();
        e1.displayQualification();
    }
}