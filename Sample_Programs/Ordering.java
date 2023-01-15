import java.util.Scanner;
class Ordering
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Mobile Number: ");
        String mobile = sc.nextLine();
        System.out.print("Enter Address: ");
        String addr = sc.nextLine();
        System.out.print("Enter Email: ");
        String mail = sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        int order = 1, price=0;
        while(order==1){
            System.out.println("Welcome "+name+"!, "+"D Pizza is the favourite pizza store around your place.");
            System.out.println("What would you like to order?");
            System.out.println("1. Veg \n2. Non Veg");
            int veg = sc.nextInt();
            if(veg==1){
                System.out.println("What would you like to have?");
                System.out.println("1. Veg Deluxe \n2. Veg Supreme");
                int vgd = sc.nextInt();
                if(vgd==1){
                    System.out.println("Ask for the crust: \n1. Thin \n2. Pan");
                    int crust = sc.nextInt();
                    if(crust == 1){
                        System.out.println("Ask for the Size: \n1. Medium \n2. Large");
                        int size = sc.nextInt();
                        if(size==1){
                            price += 550;
                            
                        }
                        System.out.println("Would you like to add another pizza? \n1. Yes \n2. No");
                        order = sc.nextInt();
                    }
                }
            }
        }
        System.out.println("Price is: "+price);
        System.out.println("Pizza will be delivered in 30 minutes to the address and our delivery guy will contact you on mobile number.");
        System.out.println("Thank you for choosing D Pizza, Enjoy your meal");
    }
}