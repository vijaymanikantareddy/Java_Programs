import java.util.*;
class MatrixTraverse
{
    public static void traverse(int m[][], int row, int col)
    {
        for(int i=0 ; i<row ; i++)
        {
            if(i%2==0){
                for(int j=0 ; j<col ; j++){
                    System.out.print(m[i][j]+" ");
                }
            }
            else{
                for(int j=col-1 ; j>=0 ; j--){
                    System.out.print(m[i][j]+" ");
                }
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int arr[][] = new int[row][col];
        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<col ; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        traverse(arr, row, col);
    }
}