import java.util.*;
class MatrixSpiral
{
    public static void spriral(int m[][], int row, int col)
    {
        int top=0, left=0, down=row-1, right=col-1, dir=0;
        while(top<=down && left<=right)
        {
            if(dir==0){
                for(int i=left ; i<=right ; i++){
                    System.out.print(m[top][i]+" ");
                }
                top+=1;
            }
            else if(dir==1){
                for(int i=top ; i<=down ; i++){
                    System.out.print(m[i][right]+" ");
                }
                right-=1;
            }
            else if(dir==2){
                for(int i=right ; i>=left ; i--){
                    System.out.print(m[down][i]+" ");
                }
                down-=1;
            }
            else if(dir==3){
                for(int i=down ; i>=top ; i--){
                    System.out.print(m[i][left]+" ");
                }
                left+=1;
            }
            dir = (dir+1)%4;
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
        spiral(arr, row, col);
    }
}