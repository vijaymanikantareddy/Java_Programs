import java.io.*;
class ArrayOp
{
    public static void main(String args[]) throws Exception
    {
        int arr[], n, i, sum=0, min, max;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of an array: ");
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        System.out.println("Enter the "+n+" elements: ");
        for(i=0 ; i<n ; i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum+= arr[i];
        }
        min = max = arr[0];
        for(int ele: arr){
            //System.out.println(ele);
            min = ele<min? ele: min;
            max = ele>max? ele: max;
        }
        System.out.println("sum is "+sum);
        System.out.println("min is "+min);
        System.out.println("max is "+max);
    }
}
