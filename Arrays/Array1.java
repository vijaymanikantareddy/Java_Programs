import java.io.*;
class Array1
{
    public static void main(String args[]) throws Exception
    {
        int x[] = {10, 20, 30, 40};
        for(int i : x){
            System.out.println(i);
        }

        int arr[], n, i, sum=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of an array: ");
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        System.out.println("Enter the "+n+" elements: ");
        for(i=0 ; i<n ; i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum+= arr[i];
        }

        for(int ele: arr){
            System.out.println(ele);
        }
        System.out.println(sum);
    }
}
