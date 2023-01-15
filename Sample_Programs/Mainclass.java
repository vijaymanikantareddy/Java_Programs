abstract class Vehicle
{
    public abstract int get_No_Wheels();
    public abstract int seating_Capacity();
}
class Bike extends Vehicle
{
    public int get_No_Wheels()
    {
        return 2;
    }
    public int seating_Capacity()
    {
        return 2;
    }
}

class Auto extends Vehicle
{
    public int get_No_Wheels()
    {
        return 3;
    }
    public int seating_Capacity()
    {
        return 4;
    }
}
class Car extends Vehicle
{
    public int get_No_Wheels()
    {
        return 4;
    }
    public int seating_Capacity()
    {
        return 5;
    }
}

class Mainclass
{
    public static void main(String args[])
    {
        Vehicle v;
        int w,c;
        v = new Bike();
        System.out.println("===============");
        System.out.println("Bike: ");
        w = v.get_No_Wheels();
        c = v.seating_Capacity();
        System.out.println("No. of wheels: "+w);
        System.out.println("Seating Capacity: "+c);

        v = new Auto();
        System.out.println("===============");
        System.out.println("Auto: ");
        w = v.get_No_Wheels();
        c = v.seating_Capacity();
        System.out.println("No. of wheels: "+w);
        System.out.println("Seating Capacity: "+c);

        v = new Car();
        System.out.println("===============");
        System.out.println("Car: ");
        w = v.get_No_Wheels();
        c = v.seating_Capacity();
        System.out.println("No. of wheels: "+w);
        System.out.println("Seating Capacity: "+c);
        System.out.println("===============");
    }
}