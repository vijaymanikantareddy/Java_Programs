import java.io.*;
class Hero_hits
{
    public static void main(String args[]) throws Exception
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String h1, h2;
        int h1h, h1a, h1f, h2h, h2a, h2f;
        System.out.println("Enter hero 1 name, hits, averages, flops: ");
        h1 = br.readLine();
        h1h = Integer.parseInt(br.readLine());
        h1a = Integer.parseInt(br.readLine());
        h1f = Integer.parseInt(br.readLine());
        System.out.println("Enter hero 2 name, hits, averages, flops: ");
        h2 = br.readLine();
        h2h = Integer.parseInt(br.readLine());
        h2a = Integer.parseInt(br.readLine());
        h2f = Integer.parseInt(br.readLine());
        int h1score, h2score;
        h1score = (h1h*10)+(h1a*5)+(h1f*-5);
        h2score = (h2h*10)+(h2a*5)+(h2f*-5);
        if(h1score>h2score){
            System.out.println(h1+" is the top hero in Film Industry");
        }
        else{
            System.out.println(h2+" is the top hero in Film Industry");
        }
    }
}