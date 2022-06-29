public class Car {
    String type = "ford";
    String model = "focus";
    String colour = "red";
    int speed = 120;
    void carTest()
    {
       System.out.println("the car details are..");
    }
    public static void main(String[] args)
    {
        Car c1=new Car();
        c1.carTest( );
       System.out.println(c1.type);
        System.out.println(c1.model);
        System.out.println(c1.colour);
        System.out.println(c1.speed);

    }
}

