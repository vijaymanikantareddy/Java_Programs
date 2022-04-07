// print all the corner elements of an array
import java.io.*;
class MatirxCorner
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int m,n,x[][],i,j;
        System.out.println("Enter number of rows and cols");
        m=Integer.parseInt(br.readLine());
        n=Integer.parseInt(br.readLine());
        x=new int[m][n];

        System.out.println("Enter the Matrix data");
        for(i=0;i<m;i++)
        {
            String row = br.readLine();
            String in[] = row.split(" ");
            for(j=0;j<row.length;j++)
                x[i][j]=Integer.parseInt(br.readLine());
            }
        }

        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(x[i][j]+" ");
            }
            System.out.println();
        }

        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==0 || i==m-1 || j==0 || j==n-1)
                    System.out.print(x[i][j]+" ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
}
