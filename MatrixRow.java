import java.util.*;
class MatrixRow
{
    public static String matrixSum(int m[][], int row, int col)
    {
        int s1=0, s2=0, s3;
        for(int i=0 ; i<row ; i++){
            s1+= m[i][i];
            s2+= m[i][row-i-1];
        }
        if(s1!=s2){
            return "No";
        }
        else{
            for(int i=0 ; i<row ; i++)
            {
                s2=s3=0;
                for(int j=0 ; j<col ; j++)
                {
                    s2+=m[i][j];
                    s3+= m[j][i];
                }
                if(s1!=s2 || s1!=s3){
                    return "No";
                }
            }
            return "Yes";
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
        System.out.println(matrixSum(arr, row, col));
    }
}