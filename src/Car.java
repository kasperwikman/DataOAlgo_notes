public class Car extends Vehicle {

    // Constant values cannot be changed in runtime
    static final String VEHICLE_TYPE = "Car";

    // Class variable (fuel for all cars)
    // All objects share the same variable
    static int totalFuel = 0;


    // Instance variable
    private int fuel = 0;

    // Overload
    // needed to allow multiple parameters
    public Car(String name, double price) {
        super(name, "motorized vehicle");
        super.price = price;
        super.discount = 0.9499999;
    }

    public Car(String name) {
        super(name, "motorized vehicle");
    }

    @Override
    public String soundWarning() {
        return "honk";
    }

    public void refuel(int amount) {
        fuel +=amount;
        totalFuel +=amount;
    }

    public String getFuelInfo() {
        return String.format("fuel %d (total fuel: %d)",
                getFuel(),
                getTotalFuel()
        );
    }

    public int getFuel() {
        return fuel;
    }
    public int getTotalFuel() {
        return totalFuel;
    }
}
