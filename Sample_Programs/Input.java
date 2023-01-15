import java.io.*;
class Input
{
	public static void main(String args[])throws Exception
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		int p, t, r;
		System.out.println("Enter P, T, R values: ");
		p = Integer.parseInt(br.readLine());
		t = Integer.parseInt(br.readLine());
		r = Integer.parseInt(br.readLine());

		float i;
		i = (p*t*r)/100;
		System.out.println(i);
	}
}