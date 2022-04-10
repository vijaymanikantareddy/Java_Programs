// Java Program to find absolute difference between diagonal and anti diagonal elements sum of a matrix
import java.io.*;
class MatrixDiag
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int m,n,x[][],i,j,d1=0,d2=0;
        System.out.println("Enter number of rows and cols");
        m=Integer.parseInt(br.readLine());
        n=Integer.parseInt(br.readLine());
        x=new int[m][n];
        System.out.println("Enter the Matrix1 data");
        for(i=0;i<m;i++)
        {
            String row = br.readLine();
            String in[] = row.split(" ");
            for(j=0;j<row.length;j++)
            {
                x[i][j]=Integer.parseInt(in[j]);
            }
        }
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==j)
                    d1=d1+x[i][j];
                if(i+j==n-1)
                    d2=d2+x[i][j];
            }
        }
        System.out.println(Math.abs(d1-d2));
    }
}

