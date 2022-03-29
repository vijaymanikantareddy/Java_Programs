import java.io.*;
class Bike_racer
{
	public static void main(String args[])throws Exception
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		int[] r = new int[5];
		float avg=0;

		System.out.println("Enter 5 speeds: ");

		for(int i=0 ; i<5 ; i++){
			r[i] = Integer.parseInt(br.readLine());
			avg+= r[i];
		}

		avg /= 5;
		
		for(int i=0 ; i<5 ; i++){
			if(r[i]>avg){
				System.out.println((i+1)+" "+r[i]);
			}
		}
	}
}