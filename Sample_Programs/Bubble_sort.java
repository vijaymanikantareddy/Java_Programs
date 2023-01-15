public class Bubble_sort
{
    static void bubblesort(int[] arr)
    {
        int n = arr.length;
        int temp = 0;
        for(int i=0 ; i<n-1 ; i++){
            for(int j=0 ; j<n-i-1 ; j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String args[])throws Exception
    {
        int arr[] = {153,32,776,97,34,25,20,5,7};
        System.out.println("Before Sorting");
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }

        bubblesort(arr);
        System.out.println("\nAfter Sorting");
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}