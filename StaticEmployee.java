import java.io.*;
public class StaticEmployee
{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int eno;
    float sal;
    String ename;
    static float tot_sal;
    static String company;
    static
    {
        company = "Aditya";
        tot_sal = 0;
    }

    public void getInfo()  throws Exception
    {
        System.out.println("Enter the eno, ename, sal");
        eno = Integer.parseInt(br.readLine());
        ename = br.readLine();
        sal = Float.parseFloat(br.readLine());
        StaticEmployee.tot_sal += sal;
    }

    public void display(){
        System.out.println("Employee Information : ");
        System.out.println("Emp No\t = \t"+eno);
        System.out.println("Emp Name\t = \t"+ename);
        System.out.println("Salary\t = \t"+sal);
        System.out.println("Company\t = \t"+StaticEmployee.company);
    }

    public static void showTotal(){
        System.out.println("Total Salaries paid by the Company = "+tot_sal);
    }
    public static void main(String args[])throws Exception
    {
       /* StaticEmployee e1 = new StaticEmployee();
        StaticEmployee e2 = new StaticEmployee();
        e1.getInfo();
        e2.getInfo();
        e1.display();
        e2.display();
        */
        StaticEmployee e[] = new StaticEmployee();
        for(int i=0 ; i<5 ; i++){
            e[i] = new StaticEmployee();
            e[i].getInfo();
        }
        for(int i=0 ; i<5 ; i++){
            System.out.println("Employee "+(i+1)+" Information is : ");
            e[i].display();
        }
        StaticEmployee.showTotal();
    }
}