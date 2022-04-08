// Java Program to add two matrices
import java.io.*;
class MatrixAdd
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int m,n,x[][],y[][], z[][],max=0;
        System.out.println("Enter number of rows and cols");
        m=Integer.parseInt(br.readLine());
        n=Integer.parseInt(br.readLine());
        x = new int[m][n];
        y = new int[m][n];
        z = new int[m][n];
        System.out.println("Enter the Matrix1 data");
        for(int i=0;i<m;i++)
        {
            String row = br.readLine();
            String in[] = row.split(" ");
            for(int j=0;j<in.length;j++)
            {
                x[i][j]=Integer.parseInt(in[j]);
            }
        }

        System.out.println("Enter the Matrix2 data");
        for(int i=0;i<m;i++)
        {
            String row = br.readLine();
            String in[] = row.split(" ");
            for(int j=0;j<in.length;j++)
            {
                y[i][j]=Integer.parseInt(in[j]);
            }
        }
        System.out.println("The Result Matrix is:");
        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                z[i][j]=x[i][j]+y[i][j];
                System.out.print(z[i][j]+" ");
            }
            System.out.println();
        }
    }
}
