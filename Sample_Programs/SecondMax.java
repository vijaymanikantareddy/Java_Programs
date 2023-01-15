import java.util.*;
class SecondMax
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[]= new int[n];
        for(int i=0 ; i<n ; i++)
            arr[i]=s.nextInt();
        int max=arr[0]>arr[1]? arr[0]:arr[1];
        int secondmax=arr[0]<arr[1]? arr[0]:arr[1];
        int min=arr[0]<arr[1]? arr[0]:arr[1];
        int secondmin=arr[0]>arr[1]? arr[0]:arr[1];
        for(int i=1 ; i<n ; i++)
        {
            if(arr[i]>max){
                secondmax = max;
                max = arr[i];
            }
            else if(secondmax<arr[i]){
                secondmax = arr[i];
            }
            if(arr[i]<min){
                secondmin=min;
                min= arr[i];
            }
            else if(secondmin>arr[i]){
                secondmin = arr[i];
            }
        }
        System.out.println(secondmax+" "+secondmin);
    }
}