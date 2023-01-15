import java.io.*;
class SortBinaryArray
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, zc=0;
        n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        String input = br.readLine();
        String in[] = input.split(" ");
        for(int i=0 ; i<n ; i++){
            arr[i] = Integer.parseInt(in[i]);
            if(arr[i]==0){
                zc++;
            }
        }
        for(int i=0 ; i<n ; i++){
            if(i<zc){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
            System.out.print(arr[i]+" ");
        }
    }
}