import java.io.*;
class ArrayCompany
{
    public static void main(String args[]) throws Exception
    {
        int salary[], n, i, sum=0, min=999999, max=0, j;
        double avg;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the no. of employees: ");
        n = Integer.parseInt(br.readLine());
        salary = new int[n];
        System.out.println("Enter the "+n+" employee salaries: ");
        for(i=0 ; i<n ; i++){
            salary[i] = Integer.parseInt(br.readLine());
            sum+= salary[i];
            min = salary[i]<min? salary[i]: min;
            max = salary[i]>max? salary[i]: max;
        }
        avg = (double) sum/n;
        System.out.println("Average Salary is "+avg);
        System.out.println("Minimum Salary is "+min);
        System.out.println("Maximum Salary is "+max);
        System.out.println("Unique elements: ");

        for(i=0 ; i<n ; i++){   //unique element in an array
            int count=0;
            if(salary[i]!=-1){
                for(j=i+1 ; j<n ; j++){
                    if(salary[i]==salary[j]){
                        count++;
                        salary[j]=-1;
                    }
                }
                if(count==0)
                    System.out.println(salary[i]);
            }     
        }
    }
}
