// Colum wise maximum element checking
import java.io.*;
class MatrixMaxCol
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int m,n,x[][],i,j,max=0;
        System.out.println("Enter number of rows and cols");
        m=Integer.parseInt(br.readLine());
        n=Integer.parseInt(br.readLine());
        x=new int[m][n];

        System.out.println("Enter the Matrix data");
        for(i=0;i<m;i++)
        {
            String row = br.readLine();
            String in[] = row.split(" ");
            for(j=0;j<n;j++)
            {
                x[i][j]=Integer.parseInt(in[j]);
            }
        }
        System.out.println("The given Matrix is:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(x[i][j]+" ");
            }
        System.out.println();
        }

        for(i=0;i<n;i++)
        { max=0;
            for(j=0;j<m;j++)
            {
                if(x[j][i]>max)
                    max=x[j][i];



        }
        System.out.print(max+" ");
        }
    }
}
