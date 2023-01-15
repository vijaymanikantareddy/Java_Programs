import java.util.Scanner;
class Move
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for(int i=0 ; i<n; i++)
            arr[i]=sc.nextInt();
        int j=0, found=0;
        for(int i=n-1 ; i>=0 ; i--){
            if(arr[i]==0){
                j=i;
                found = 1;
                break;
            }
        }
        if(found==1)
        {
            for(int i=j-1 ; i>=0 ; i--)
            {
                if(arr[i]!=0 && i!=j){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    j--;
                }
            }
        }
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}