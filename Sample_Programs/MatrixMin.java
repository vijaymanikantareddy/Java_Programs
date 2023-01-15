import java.util.*;
class MatrixMin
{
    public static void four(int m[][], int r, int c)
    {
        int res[][] = new int[r+1][c+1];
        int rmin, j, cmin, dmin=m[0][0];
        for(int i=0 ; i<r ; i++){
            rmin = m[i][0];
            cmin=m[0][i];
            for(j=0 ; j<c ; j++)
            {
                res[i][j]=m[i][j];
                rmin = rmin<m[i][j]? rmin: m[i][j];
                cmin = cmin<m[j][i]? cmin: m[j][i];
                if(i==j){
                    dmin = dmin<m[i][j]? dmin: m[i][j];
                }
            }
            if(j==c){
                res[i][j]=rmin;
                res[j][i]=cmin;
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