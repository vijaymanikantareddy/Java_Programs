import java.io.*;
class ArrayEvenOdd
{
    public static void main(String args[]) throws Exception
    {
        int arr[], n, i, even[], odd[], j=0, k=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of an array: ");
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        even = new int[n];
        odd = new int[n];
        System.out.println("Enter the "+n+" elements: ");
        for(i=0 ; i<n ; i++){
            arr[i] = Integer.parseInt(br.readLine());
            if(arr[i]%2==0)
                 even[j++]=arr[i];
            else
                 odd[k++]=arr[i];
        }
        for(i=0 ; i<j ; i++)
            System.out.print(even[i]+" ");
        System.out.println();
        for(i=0 ; i<k ; i++)
            System.out.print(odd[i]+" ");
        
    }
}