import java.util.*;
class MatrixSym
{
    public static String sym(int m[][], int row, int col)
    {
        for(int i=1 ; i<row ; i++){
            for(int j=0 ; j<i ; j++)
            {
                if(m[i][j]!=m[j][i]){
                    return "No";
                }
            }
        }
        return "Yes";
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int row=sc.nextInt();
        int col=row;
        int arr[][] = new int[row][col];
        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<col ; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(sym(arr, row, col));
    }
}