import java.io.*;
class Employee
{
	public static void main(String args[])throws Exception
	{
		int empid;
		String ename, address;
		float salary;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("ENter employee ID, name, salary and address: ");
		empid = Integer.parseInt(br.readLine());
		ename = br.readLine();
		salary = Float.parseFloat(br.readLine());
		address = br.readLine();
		System.out.println("Employee Information ");
		System.out.println(empid+" "+ename+" "+salary+" "+address);
	}
}