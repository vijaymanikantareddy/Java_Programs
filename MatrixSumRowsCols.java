import java.util.*;
class MatrixSumRowsCols
{
    public static void four(int m[][], int r, int c)
    {
        int res[][] = new int[r+1][c+1];
        int rsum, j, csum, dmin=m[0][0];
        for(int i=0 ; i<r ; i++){
            rsum = m[i][0];
            csum=m[0][i];
            for(j=0 ; j<c ; j++)
            {
                res[i][j]=m[i][j];
                rsum = rsum<m[i][j]? rsum: m[i][j];
                csum = csum<m[j][i]? csum: m[j][i];
                if(i==j){
                    dmin = dmin<m[i][j]? dmin: m[i][j];
                }
            }
            if(j==c){
                res[i][j]=rsum;
                res[j][i]=csum;
            }
        }
        res[r][c]=dmin;
        for(int i=0 ; i<=r ; i++)
        {
            for(j=0 ; j<=c ; j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
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
        four(arr, row, col);
    }
}